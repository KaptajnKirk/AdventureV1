package com.company;

public class MeleeWeapon extends Weapon{

  public MeleeWeapon(String name, int damage) {
    super(name, damage);
  }

  public int attack (){
    return damage;
  }

  @Override
  public int getMagSize() {
    return 0;
  }

  public void reload (int bullets){
    System.out.println("How would you like to reload a melee weapon?!?!?!");
  }

  public void shoot (){
    System.out.println("You cant shoot a melee weapon");
  }

  @Override
  public int getMagBulletsAmount() {
    return -1;
  }
}
