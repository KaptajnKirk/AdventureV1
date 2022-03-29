package com.company;

public class Enemy {

  private String name;
  private String description;
  private int enemyHealth;
  private Weapon equippedWeapon;
  private Container corpse;


  public Enemy (String name, String description, int enemyHealth, Weapon equippedWeapon,Container corpse){
    this.name = name;
    this.description = description;
    this.enemyHealth = enemyHealth;
    this.equippedWeapon = equippedWeapon;
    this.corpse = corpse;
  }

  public int getDamage (){
    return equippedWeapon.getDamage();
  }

  public int getEnemyHealth() {
    return enemyHealth;
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
