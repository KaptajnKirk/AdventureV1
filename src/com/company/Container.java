package com.company;

import java.util.ArrayList;

public class Container {

  private final ArrayList<String> items = new ArrayList<>();
  private final String name;

  public Container(String name){
    this.name = name;
  }

  public ArrayList<String> getItems() {
    return items;
  }

  public void addItems(String item) {
    this.items.add(item);
  }

  public String getName(){
    return name;
  }
}
