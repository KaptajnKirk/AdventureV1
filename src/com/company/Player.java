package com.company;

public class Player {

  private String name;
  private int health;
  private Rooms currentPosition;

  public Player(String name, Rooms currentPosition) {
    this.name = name;
    this.health = 100;
    this.currentPosition = currentPosition;
  }

  public void setCurrentPosition(Rooms currentRoom) {
    this.currentPosition = currentRoom;
  }

  public Rooms getCurrentPosition() {
    return currentPosition;
  }

  public void setHealth(int health){
    this.health = health;
  }

  public int getHealth(){
    return health;
  }
}

