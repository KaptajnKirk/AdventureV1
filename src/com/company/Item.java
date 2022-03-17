package com.company;

public class Item {

  String[] items;

  public Item(String book, String the_great_gatsby) {
    this.items[0] = "lasercutter";
    this.items[1] = "fire extinguisher";
    this.items[2] = "repair tool";
    this.items[3] = "survival knife";
    this.items[4] = "flashlight";
    this.items[5] = "power cell";
  }

  public String[] getItems() {
    return items;
  }
}
