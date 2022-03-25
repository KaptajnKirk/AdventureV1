package com.company;

public class RangedWeapon extends Weapon{
  private int magSize;
  private int magBulletsAmount;

  public RangedWeapon(String name, int damage, int magSize) {
    super(name, damage);
    this.magSize = magSize;
    this.magBulletsAmount = magSize; //When creating gun it spawns with full mag
  }

  public void reload(int bullets){
    this.magBulletsAmount += bullets;
    if (magSize==magBulletsAmount){

    }
  }

}
