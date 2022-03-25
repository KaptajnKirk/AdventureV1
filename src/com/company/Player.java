package com.company;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Player {
  String choice1;
  String choice2;
  Map map = new Map();
  private Rooms currentPosition;
  private final ArrayList<Item> inventory;
  private int health;
  private Item equipedWeapon;

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

  public Item getEquipedWeapon(){
    return equipedWeapon;
  }

  public void choiceSplitter() {
    Scanner scanner = new Scanner(System.in);
    String choice = scanner.nextLine();
    if (choice.contains(" ")) {
      choice1 = choice.substring(0, choice.indexOf(" ")).toLowerCase(Locale.ROOT);
      choice2 = choice.substring((choice.indexOf(" ") + 1)).toLowerCase(Locale.ROOT);
    } else {
      choice1 = choice;
      choice2 = " ";
    }
  }

  public void takeFromChest(String item) {
    Item temp;
    boolean isItemInInv = false;
    if (item.equals(" ")) {
      System.out.println("Are you trying to pickup nothing?\nTry again!");
    } else {
      for (int x = 0; x < currentPosition.getChest().getItems().size(); x++) {
        temp = currentPosition.getChest().getItems().get(x);
        if (item.equals(temp.getName())) {
          isItemInInv = true;
          inventory.add(temp);
          currentPosition.getChest().getItems().remove(x);
          x = getCurrentPosition().getChest().getItems().size();
          System.out.println("You have added " + item + " to your inventory!");
        }
      }
      if (!isItemInInv) {
        System.out.println("There is no " + item + " nearby!");
      }
    }
  }

  public void addToInventory(String item) {
    Item temp;
    boolean isItemInInv = false;
    if (item.equals(" ")) {
      System.out.println("Are you trying to pickup nothing?\nTry again!");
    } else {
      for (int x = 0; x < currentPosition.getItems().size(); x++) {
        temp = currentPosition.getItems().get(x);
        if (item.equals(temp.getName())) {
          isItemInInv = true;
          inventory.add(temp);
          currentPosition.getItems().remove(x);
          x = currentPosition.getItems().size();
          System.out.println("You have added " + item + " to your inventory!");
        }
      }if (!isItemInInv) {
        System.out.println("There is no " + item + " nearby!");
      }
    }
  }

  public void dropItem(String item) {
    boolean isItemInInv = false;
    Item temp;
    if (item.equals(" ")) {
      System.out.println("Are you trying to drop nothing?\nTry again!");
    } else {
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
  }


  //TODO: make it so only weapons can be equipped
  public void equipWeapon(String item) {
    Item temp;
    boolean isItemInInv = false;
    if (item.equals(" ")) {
      System.out.println("Are you trying to equip nothing?\nTry again!");
    } else {
      for (int x = 0; x < inventory.size(); x++) {
        isItemInInv = true;
        temp = inventory.get(x);
        if (equipedWeapon != null) {
          inventory.add(equipedWeapon);
          equipedWeapon = temp;
          System.out.println("You have replaced your equipped " + equipedWeapon + " with " + item);
        } else {
          inventory.remove(x);
          equipedWeapon = temp;
          System.out.println("You have equipped " + item);
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
      System.out.println(currentPosition.getChest().getName());
      System.out.println(currentPosition.getChest().getItems());
      boolean run2 = true;
      while (run2) {
        uiPrint.nextMovePrompt();
        choiceSplitter();
        uiPrint.newPage();
        switch (choice1) {
          case "go" -> System.out.println("You have to close the container before moving on");
          case "help" -> uiPrint.displayHelpMenu();
          case "take" -> takeFromChest(choice2);
          case "inventory", "inv" -> displayInventory();
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
  }

  public void displayInventory() {
    if (inventory.size() == 0) {
      System.out.println("Your inventory is empty!");
    } else System.out.println("Inventory: " + inventory);
  }
}

