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

  public ArrayList<String> getInventory() {
    return inventory;
  }
  public void addToInventory(String item){
    this.inventory.add(item);
  }
  public void goDirection(Rooms direction) throws InterruptedException {
    if (direction == null) {
      uxPrint.directionNull();
    } else {
      setCurrentPosition(direction);
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
  }

