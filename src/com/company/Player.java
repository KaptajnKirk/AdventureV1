package com.company;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Player {
  private boolean isItemInInv;
  private String choice1;
  private String choice2;
  private Map map = new Map();
  private Rooms currentPosition;
  private final ArrayList<Item> inventory;
  private int health;
  private Weapon equippedWeapon;

  public Player(Rooms room) {
    this.currentPosition = room;
    this.inventory = new ArrayList<>();
    this.health = 100;
  }

  public void setCurrentPosition(Rooms currentRoom) {
    this.currentPosition = currentRoom;
  }

  public Rooms getCurrentPosition() {
    return currentPosition;
  }

  public int getHealth() {
    return health;
  }

  public Item getEquippedWeapon() {
    return equippedWeapon;
  }

  public void choiceSplitter() {
    Scanner scanner = new Scanner(System.in);
    String choice = scanner.nextLine();
    if (choice.contains(" ")) {
      choice1 = choice.substring(0, choice.indexOf(" ")).toLowerCase(Locale.ROOT);
      choice2 = choice.substring((choice.indexOf(" ") + 1)).toLowerCase(Locale.ROOT);
    } else {
      choice1 = choice.toLowerCase(Locale.ROOT);
      choice2 = " ";
    }
  }

  public void findItemDrop(String item){
    isItemInInv = false;
    Item temp;
    for (int x = 0; x < inventory.size(); x++) {
      temp = inventory.get(x);
      if (item.equals(temp.getName())) {
        isItemInInv = true;
        inventory.remove(temp);
        currentPosition.addItems(temp);
        x = inventory.size();
        System.out.println("You have dropped " + item + " on the floor!");
      }
    }
    if (!isItemInInv) {
      System.out.println("You don't have " + item + " in your inventory!");
    }
  }

  public void findItemTake(ArrayList<Item> items, String item){
    Item temp;
    isItemInInv = false;
    for (int x = 0; x < items.size(); x++) {
      temp = items.get(x);
      if (item.equals(temp.getName())) {
        isItemInInv = true;
        inventory.add(temp);
        items.remove(x);
        x = items.size();
        System.out.println("You have added " + item + " to your inventory!");
      }
    }if (!isItemInInv) {
      System.out.println("There is no " + item + " nearby!");
    }
  }

  public void takeFromChest(String item) {
    if (item.equals(" ")) {
      System.out.println("Are you trying to pickup nothing?\nTry again!");
    } else {
      findItemTake(currentPosition.getChest().getItems(),item);
    }
  }

  public void addToInventory(String item) {
    if (item.equals(" ")) {
      System.out.println("Are you trying to pickup nothing?\nTry again!");
    } else {
      findItemTake(currentPosition.getItems(),item);
    }
  }

  public void dropItem(String item) {
    if (item.equals(" ")) {
      System.out.println("Are you trying to drop nothing?\nTry again!");
    } else {
      findItemDrop(item);
    }
  }

  public void equipWeapon(String item) {
    Item temp;
    boolean isItemInInv = false;
    if (item.equals(" ")) {
      System.out.println("Are you trying to equip nothing?\nTry again!");
    } else {
      for (int x = 0; x < inventory.size(); x++) {
        isItemInInv = true;
        temp = inventory.get(x);
        if (item.equals(temp.getName())) {
          if (temp instanceof Weapon) {
            if (equippedWeapon != null) {
              System.out.println("You have replaced your equipped " + equippedWeapon + " with " + item);
              inventory.add(equippedWeapon);
              inventory.remove(x);
              equippedWeapon = (Weapon)temp;
              x = inventory.size();
            } else {
              System.out.println("You have equipped " + item);
              inventory.remove(x);
              equippedWeapon = (Weapon) temp;
              x = inventory.size();
            }
          } else System.out.println("You can only equip weapons!");
        }
      }
    }if (!isItemInInv) {
      System.out.println("You do not have " + item + " in your inventory!");
    }
  }

  public void searchContainer() throws InterruptedException {
    if (currentPosition.getChest() == null) {
      System.out.println("There are no containers to search in this room!");
    } else {
      uiPrint.displaySearchContainer();
      boolean run2 = true;
      while (run2) {
        System.out.println(currentPosition.getChest().getName());
        System.out.println(currentPosition.getChest().getItems());
        uiPrint.displayPlayerUI(health, equippedWeapon);
        uiPrint.nextMovePrompt();
        choiceSplitter();
        uiPrint.newPage();
        switch (choice1) {
          case "go" -> System.out.println("You have to close the container before moving on");
          case "help" -> uiPrint.displayContainerHelpMenu();
          case "take" -> takeFromChest(choice2);
          case "inventory", "inv" -> displayInventory();
          case "equip" -> equipWeapon(choice2);
          case "eat" -> eatItem(choice2);
          case "close" -> {
            uiPrint.displayCloseContainer();
            run2 = false;
          }
          default -> uiPrint.invalidInput();
        }
      }
    }
  }

  public void goDirection(Rooms direction) throws InterruptedException {
    if (direction == null) {
      uiPrint.directionNull();
    } else {
      setCurrentPosition(direction);
      map.setCurrentRoom(direction);
    }
    if (!currentPosition.getDiscovered()) {
      markAreaDiscovered();
      uiPrint.displayRoomDescription(getCurrentPosition().getDescription());
    }
    uiPrint.displayRoomName(getCurrentPosition().getName());
    uiPrint.displayRoomItems(getCurrentPosition().getItems());
    uiPrint.displayRoomContainer(getCurrentPosition().getChest());
    uiPrint.displayRoomEnemy(getCurrentPosition().getEnemy());
  }

  public void markAreaDiscovered() {
    getCurrentPosition().setDiscovered(true);
  }

  public void eatItem(String food) {
    Item temp;
    boolean isFoodInInv = false;
    if (food.equals(" ")) {
      System.out.println("Please specify what you wanna eat");
    } else {
      for (int x = 0; x < inventory.size(); x++) {
        if (food.equals(inventory.get(x).getName())) {
          isFoodInInv = true;
          temp = inventory.get(x);
          if (temp instanceof Food) {
            this.health += ((Food) temp).getHealth();
            uiPrint.displayEat(temp.getName(), ((Food) temp).getHealth());
            inventory.remove(temp);
            x = inventory.size();
            if (health > 100) {
              health = 100;
            }
          } else {
            System.out.println("You cant eat " + food);
          }
        }
      }
      if (!isFoodInInv) {
        System.out.println("You dont have " + food + " in your inventory");
      }
    }
  }

  public void lookRoom(){
    uiPrint.displayLookDescription(currentPosition.getDescription());
    uiPrint.displayRoomItems(currentPosition.getItems());
    uiPrint.displayRoomContainer(currentPosition.getChest());
  }

  public void displayInventory() {
    if (inventory.size() == 0) {
      System.out.println("Your inventory is empty!");
    } else System.out.println("Inventory: " + inventory);
  }

  public void attack () {
    int damageDealt;
    if (equippedWeapon != null) {
      if (equippedWeapon.getMagBulletsAmount() == 0) {
        System.out.println("You have no more ammo left!");
      } else {
        equippedWeapon.attack();
        damageDealt = equippedWeapon.getDamage();
        System.out.println("You dealt " + damageDealt + " damage");
        if (equippedWeapon.getMagBulletsAmount() > 0) {
          equippedWeapon.shoot();
          System.out.println("You have " + equippedWeapon.getMagBulletsAmount() + " ammo left");
        }
      }
    }
      else {
      System.out.println("You have no weapon equipped");

    }
  }
}

