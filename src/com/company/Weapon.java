package com.company;

public class Weapon extends Item{

  protected int damage;

  public Weapon(String name, int damage) {
    super(name);
    this.damage = damage;
  }
}
