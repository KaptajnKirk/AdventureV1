package com.company;

import java.util.ArrayList;

public class Container {

  private final ArrayList<Item> items = new ArrayList<>();
  private final String name;

  public Container(String name) {
    this.name = name;
  }

  public ArrayList<Item> getItems() {
    return items;
  }

  public void addItems(Item item) {
    this.items.add(item);
  }

  public String getName() {
    return name;
  }
  public String toString(){
    return name;
  }
}