package com.company;

import java.util.ArrayList;

public class Player {
  Map map = new Map();
  private Rooms currentPosition;
  private ArrayList<String> inventory;

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

  public void addToInventory(String item) {
    for (int x = 0; x < currentPosition.getItems().size(); x++) {
      if (item.equals(currentPosition.getItems().get(x))) {
        this.inventory.add(item);
        currentPosition.getItems().remove(x);
        System.out.println("You have added " + item + " to your inventory");
      }System.out.println("You have added " + item + " to your inventory");
    }
  }


  public void goDirection(Rooms direction) throws InterruptedException {
    if (direction == null) {
      uxPrint.directionNull();
    } else {
      setCurrentPosition(direction);
      map.setCurrentRoom(direction);
    }
    if (currentPosition.getDiscovered()) { //Do not display room name when direction is null
      uxPrint.displayRoomName(getCurrentPosition().getName());
    } else {
      markAreaDiscovered();
      uxPrint.displayRoomDescription(getCurrentPosition().getDescription());
      uxPrint.displayRoomName(getCurrentPosition().getName());
    }
  }
    public void markAreaDiscovered() {
      getCurrentPosition().setDiscovered(true);
    }

    public void displayInventory(){
    if (inventory.size() == 0) {
      System.out.println("Your inventory is empty!");
    }else System.out.println("Inventory: " + inventory);
    }
  }

