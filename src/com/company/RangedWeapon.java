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
    magBulletsAmount += bullets;
  }

  public int attack (){
    return damage;
  }

  public void shoot(){
    magBulletsAmount-=1;
  }

  public int getMagSize (){
    return magSize;
  }

  public int getMagBulletsAmount() {
    return magBulletsAmount;
  }
}
