package com.company;

import java.util.ArrayList;

public class LootBox {

  private ArrayList<String> items = new ArrayList<>();
  private String name;

  public LootBox(String name){
    this.name = name;
  }

  public ArrayList<String> getItems() {
    return items;
  }

  public void addItems(String item) {
    this.items.add(item);
  }

  public void setName(String name){
    this.name = name;
  }

  public String getName(){
    return name;
  }
}
