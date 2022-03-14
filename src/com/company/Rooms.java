package com.company;

public class Rooms {

  private Rooms north;
  private Rooms south;
  private Rooms east;
  private Rooms west;
  String description;
  String name;

  public Rooms (String name, String description){
    this.name = name;
    this.description = description;
    this.north = null;
    this.south = null;
    this.east = null;
    this.west = null;
  }

  public String toString(){
    return name + "/" + description + "/" + north + "/" + south + "/" + east + "/" + west;
  }

  //Create 9 rooms as objects with entrances that connect to different rooms

  //Type connection to the room with array = room1.addDirection("south", rooms[0]);

  //

}
