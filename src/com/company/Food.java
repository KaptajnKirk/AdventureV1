package com.company;

public class Food extends Item{

  private int health;

  public Food(String name, int health){
    super(name);
    this.health = health;
  }

  public int getHealth(){
    return health;
  }


}
