package com.company;

public abstract class Weapon extends Item{

  protected int damage;

  public Weapon(String name, int damage) {
    super(name);
    this.damage = damage;
  }

  public int getDamage (){
    return damage;
  }

  public abstract void reload ();

  public abstract int attack ();

  public abstract int getMagSize();

  public abstract void shoot();

  public abstract int getMagBulletsAmount();

}
