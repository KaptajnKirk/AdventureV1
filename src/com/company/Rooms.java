package com.company;

import java.util.ArrayList;

public class Rooms {

  boolean discovered;
  private Rooms north;
  private Rooms south;
  private Rooms east;
  private Rooms west;
  private String description;
  private String name;
  private ArrayList<Item> items = new ArrayList<>();
  private Container chest;
  private Enemy enemy;



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

  public void addItems(Item item) {
    this.items.add(item);
  }
  public ArrayList<Item> getItems(){
    return items;
  }

  public void addChest(Container chest){
    this.chest = chest;
  }

  public Container getChest(){
    return chest;
  }

  public Enemy getEnemy (){
    return enemy;
  }

  public void addEnemy (Enemy enemy){
    this.enemy = enemy;
  }

  public void removeEnemy (){
    this.enemy=null;
  }

}
