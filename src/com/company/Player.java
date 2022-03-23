package com.company;

import java.util.ArrayList;

public class Player {
  Map map = new Map();
  private Rooms currentPosition;
  private final ArrayList<Item> inventory;
  private int health;

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

  public void setHealth(int health) {
    this.health = health;
  }

  public void takeFromChest(String item) {
    boolean isItemInInv = false;
    for (int x = 0; x < currentPosition.getChest().getItems().size(); x++) {
      if (item.equals(currentPosition.getChest().getItems().get(x))) {
        isItemInInv = true;
        inventory.add(currentPosition.getChest().getItems().get(x));
        currentPosition.getChest().getItems().remove(x);
        System.out.println("You have added " + item + " to your inventory!");
      }
      if (item.equals(" ")) {
        System.out.println("Are you trying to pickup nothing?\nTry again!");
      }
    }
    if (!isItemInInv) {
      System.out.println("There is no " + item + " nearby!");
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
          System.out.println("You have added " + item + " to your inventory!");
        }
      }
      if (!isItemInInv) {
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
          System.out.println("You have dropped " + item + " on the floor!");
        }
      }
      if (!isItemInInv) {
        System.out.println("You don't have " + item + " in your inventory!");
      }
    }
  }


    public void goDirection (Rooms direction) throws InterruptedException {
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

    public void markAreaDiscovered () {
      getCurrentPosition().setDiscovered(true);
    }

    public void eat (Item food){
      Item temp = food;
      if (temp instanceof Food) {
        this.health += ((Food) temp).getHealth();
        uiPrint.displayEat(temp.getName());
      }
    }

    public void displayInventory () {
      if (inventory.size() == 0) {
        System.out.println("Your inventory is empty!");
      } else System.out.println("Inventory: " + inventory);
    }
  }

