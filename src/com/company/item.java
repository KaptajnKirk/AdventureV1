package com.company;

public class item {

  private item laserCutter;
  private item fireExtinguisher;
  private item repairTool;
  private item survivalKnife;
  private item flashLight;
  private item powercell;

  public item(item laserCutter, item fireExtinguisher, item repairTool, item survivalKnife, item flashLight, item powercell) {
    this.laserCutter = laserCutter;
    this.fireExtinguisher = fireExtinguisher;
    this.repairTool = repairTool;
    this.survivalKnife = survivalKnife;
    this.flashLight = flashLight;
    this.powercell = powercell;
  }

  public item getLaserCutter() {
    return laserCutter;
  }

  public item getFireExtinguisher() {
    return fireExtinguisher;
  }

  public item getRepairTool() {
    return repairTool;
  }

  public item getSurvivalKnife() {
    return survivalKnife;
  }

  public item getFlashLight() {
    return flashLight;
  }

  public item getPowercell() {
    return powercell;
  }
}
