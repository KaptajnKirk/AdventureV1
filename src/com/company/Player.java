package com.company;

import java.util.ArrayList;

public class Player {
  Map map = new Map();
  private Rooms currentPosition;
  private final ArrayList<String> inventory;

  public Player(Rooms room) {
    this.currentPosition = room;
    this.inventory = new ArrayList<>();
  }

  public void setCurrentPosition(Rooms currentRoom) {
    this.currentPosition = currentRoom;
  }

  public Rooms getCurrentPosition() {
    return currentPosition;
  }

  /*public void takeFromChest(String item){
    boolean isItemInInv = false;
    for (int x = 0; x < currentPosition.getItems().size(); x++) {
      if (item.equals(currentPosition.getItems().get(x))) {
        isItemInInv = true;
        inventory.add(item);
        currentPosition.getItems().remove(x);
        System.out.println("You have added " + item + " to your inventory!");
      }
      if (item.equals(" ")) {
        System.out.println("Are you trying to pickup nothing?\nTry again!");
      }
    }
    if (!isItemInInv) {
      System.out.println("There is no " + item + " nearby!");
    }
  }*/

  public void addToInventory(String item) {
    boolean isItemInInv = false;
    for (int x = 0; x < currentPosition.getItems().size(); x++) {
      if (item.equals(currentPosition.getItems().get(x))) {
        isItemInInv = true;
        inventory.add(item);
        currentPosition.getItems().remove(x);
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

  public void dropItem(String item) {
    if (item.equals(" ")) {
      System.out.println("Are you trying to drop nothing?\nTry again!");
    }
    boolean isItemInInv = false;
    int i = 0;
    for (int x = 0; x < inventory.size(); x++) {
      i++;
      if (item.equals(inventory.get(x))) {
        isItemInInv = true;
        inventory.remove(item);
        currentPosition.addItems(item);
        System.out.println("You have dropped " + item + " on the floor!");
      }
    }
    if (i == inventory.size() && !isItemInInv) {
      System.out.println("You don't have " + item + " in your inventory!");
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

  public void displayInventory() {
    if (inventory.size() == 0) {
      System.out.println("Your inventory is empty!");
    } else System.out.println("Inventory: " + inventory);
  }
}

