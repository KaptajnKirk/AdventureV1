package com.company;

public class Enemy {

  private String name;
  private String description;
  private int health;
  private Weapon equippedWeapon;
  private Container corpse;
  private Rooms currentlocation;


  public Enemy (String name, String description, int health, Weapon equippedWeapon,Container corpse){
    this.name = name;
    this.description = description;
    this.health = health;
    this.equippedWeapon = equippedWeapon;
    this.corpse = corpse;
  }

  public Weapon dropWeapon(){
    return equippedWeapon;
  }

  public int getDamage (){
    return equippedWeapon.getDamage();
  }

  public void damageTaken(int damage){
    this.health -= damage;
  }

  public int health() {
    return health;
  }

  public String getName(){
    return name;
  }

  public String getDescription() {
    return description;
  }

  public Weapon getEquippedWeapon() {
    return equippedWeapon;
  }

  @Override
  public String toString() {
    return name;
  }

}
