package com.company;

public class Rooms {

  boolean discovered;
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
    this.discovered = false;
  }


  public String getDescription () {
    return description;
  }

  public String getName () {
    return name;
  }

  public Rooms getEast() {
    return east;
  }

  public Rooms getNorth() {
    return north;
  }

  public Rooms getSouth(){
    return south;
  }

  public Rooms getWest(){
    return west;
  }

  public boolean getDiscovered(){
    return discovered;
  }

  public void setNorth(Rooms north) {
    this.north = north;
  }

  public void setSouth(Rooms south) {
    this.south = south;
  }

  public void setEast(Rooms east) {
    this.east = east;
  }

  public void setWest(Rooms west) {
    this.west = west;
  }

  public void setDiscovered(boolean discovered){
    this.discovered = discovered;
  }
}
