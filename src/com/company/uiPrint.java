package com.company;

import java.util.ArrayList;

public class uiPrint {

  public uiPrint(){

  }

  //Displays the backstory during the intro
  public static void introPrint ()throws InterruptedException {
    System.out.println("\u001B[32m***************************************[BACKSTORY]*****************************************************\u001B[0m");
    printer("You are an engine mechanic aboard the galactic excavation and discovery vehicle The Aurora." +
        "\nThe mission, codenamed 'Degassi' is funded by the trans-governmental corporation Alterra." +
        "\nAlterra owns 61% of all space travel assets in the milky way galaxy, and they also happen to be your employer." +
        "\nThe Degassi mission is slated to last approximately four years." +
        "\nits main objective is to research and excavate newly discovered planet 6784X, for future habitation." +
        "\nWith no real family or relationship back on earth, you signed on for the generous mission salary." +
        "\nThe Aurora is a massive ship equipped for both land and water-based missions, and houses 265 crewmembers in total. " +
        "\nThe Degassi mission has recently passed its one year mark, and you are currently slingshotting around planet 4546B. " +
        "\nAn ocean planet consisting of 91.1% water. \nOne day you are called to the Captains Quarters, to report the weekly fuel consumption rate. " +
        "\nIn the middle of your report, the ship suddenly starts to shake violently, and you lose your footing, stumbling to the ground. " +
        "\nRed lights starts blinking, as the intercom sounds 'ALERT: SHIP UNDER ATTACK. TWO MAIN ENGINES LOST. EVACUATE TO THE ESCAPE PODS'. " +
        "\nSuddenly a small explosion happens inside the room, and as you and the captain are storming towards the exit, a single wall panel rips lose. " +
        "\nit flies straight towards you. In an instant, everything turns dark...");
  }

  //Displays ASCII art Titlecard
  public static void displayTitleCard() throws InterruptedException {
    newPage();
    System.out.println("\u001B[34m███████╗███████╗ ██████╗ █████╗ ██████╗ ███████╗    ███████╗██████╗  ██████╗ ███╗   ███╗     █████╗ ██╗   ██╗██████╗  ██████╗ ██████╗  █████╗");
    Thread.sleep(500);
    System.out.println("██╔════╝██╔════╝██╔════╝██╔══██╗██╔══██╗██╔════╝    ██╔════╝██╔══██╗██╔═══██╗████╗ ████║    ██╔══██╗██║   ██║██╔══██╗██╔═══██╗██╔══██╗██╔══██╗");
    Thread.sleep(500);
    System.out.println("█████╗  ███████╗██║     ███████║██████╔╝█████╗      █████╗  ██████╔╝██║   ██║██╔████╔██║    ███████║██║   ██║██████╔╝██║   ██║██████╔╝███████║");
    Thread.sleep(500);
    System.out.println("██╔══╝  ╚════██║██║     ██╔══██║██╔═══╝ ██╔══╝      ██╔══╝  ██╔══██╗██║   ██║██║╚██╔╝██║    ██╔══██║██║   ██║██╔══██╗██║   ██║██╔══██╗██╔══██║");
    Thread.sleep(500);
    System.out.println("███████╗███████║╚██████╗██║  ██║██║     ███████╗    ██║     ██║  ██║╚██████╔╝██║ ╚═╝ ██║    ██║  ██║╚██████╔╝██║  ██║╚██████╔╝██║  ██║██║  ██║");
    Thread.sleep(500);
    System.out.println("╚══════╝╚══════╝ ╚═════╝╚═╝  ╚═╝╚═╝     ╚══════╝    ╚═╝     ╚═╝  ╚═╝ ╚═════╝ ╚═╝     ╚═╝    ╚═╝  ╚═╝ ╚═════╝ ╚═╝  ╚═╝ ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝\u001B[0m");
    Thread.sleep(500);
    System.out.println();
    Thread.sleep(500);
    System.out.println();
    Thread.sleep(500);
    System.out.println();
    Thread.sleep(500);
    System.out.println();
    Thread.sleep(500);
  }

  //Displays ASCII art endcard
  public static void displayEndCard() throws InterruptedException {
    newPage();
    System.out.println("\u001B[32m████████╗██╗  ██╗ █████╗ ███╗   ██╗██╗  ██╗    ██╗   ██╗ ██████╗ ██╗   ██╗");
    Thread.sleep(500);
    System.out.println("╚══██╔══╝██║  ██║██╔══██╗████╗  ██║██║ ██╔╝    ╚██╗ ██╔╝██╔═══██╗██║   ██║");
    Thread.sleep(500);
    System.out.println("   ██║   ███████║███████║██╔██╗ ██║█████╔╝      ╚████╔╝ ██║   ██║██║   ██║");
    Thread.sleep(500);
    System.out.println("   ██║   ██╔══██║██╔══██║██║╚██╗██║██╔═██╗       ╚██╔╝  ██║   ██║██║   ██║");
    Thread.sleep(500);
    System.out.println("   ██║   ██║  ██║██║  ██║██║ ╚████║██║  ██╗       ██║   ╚██████╔╝╚██████╔╝");
    Thread.sleep(500);
    System.out.println("   ╚═╝   ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═══╝╚═╝  ╚═╝       ╚═╝    ╚═════╝  ╚═════╝");
    Thread.sleep(500);
    System.out.println("███████╗ ██████╗ ██████╗     ██████╗ ██╗      █████╗ ██╗   ██╗██╗███╗   ██╗ ██████╗");
    Thread.sleep(500);
    System.out.println("██╔════╝██╔═══██╗██╔══██╗    ██╔══██╗██║     ██╔══██╗╚██╗ ██╔╝██║████╗  ██║██╔════╝");
    Thread.sleep(500);
    System.out.println("█████╗  ██║   ██║██████╔╝    ██████╔╝██║     ███████║ ╚████╔╝ ██║██╔██╗ ██║██║  ███╗");
    Thread.sleep(500);
    System.out.println("██╔══╝  ██║   ██║██╔══██╗    ██╔═══╝ ██║     ██╔══██║  ╚██╔╝  ██║██║╚██╗██║██║   ██║");
    Thread.sleep(500);
    System.out.println("██║     ╚██████╔╝██║  ██║    ██║     ███████╗██║  ██║   ██║   ██║██║ ╚████║╚██████╔╝");
    Thread.sleep(500);
    System.out.println("╚═╝      ╚═════╝ ╚═╝  ╚═╝    ╚═╝     ╚══════╝╚═╝  ╚═╝   ╚═╝   ╚═╝╚═╝  ╚═══╝ ╚═════╝ \u001B[0m");
    Thread.sleep(500);
    System.out.println();
    Thread.sleep(500);
    System.out.println();
    Thread.sleep(5000);
  }

  //Intro to the game, basically room 1 description but with a wakeup start sentence
  public static void displayWakeUp()throws InterruptedException{
    printer("""
        You awake in a room partly on fire. Small pieces of debris is falling from holes in the ceiling.
        Around you are scattered furniture, displaced in the crash. A work table, some vials on the floor,
        and a Alterra poster on the wall with a picture of the newest model of Alterra excavation machine.
        You are slightly confused, and the last thing you remember is dropping to the planet surface in the Alterra Space cruiser.
        You see doors to the south and east.
        """);
  }

  //Clears console to avoid cluttering
  public static void newPage(){
    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
  }

  //display of the HELP menu
  public static void displayHelpMenu() {
    System.out.println("\u001B[34m*******************************************************************************************************");
    System.out.println("*****************************************[HELP]********************************************************\u001B[0m");
    System.out.println("\n\texit\t\t\t- Exit the game");
    System.out.println("\tlook\t\t\t- Get the description of current room");
    System.out.println("\tgo 'direction'\t- Go in the given direction(ex. go north)");
    System.out.println("\thelp\t\t\t- Get this help menu");
    System.out.println("\ttake 'item'\t\t- Place a given item in your inventory ");
    System.out.println("\tdrop 'item'\t\t- Drop the given item on the floor in current room");
    System.out.println("\tinventory\t\t- Open your inventory");
    System.out.println("\tsearch\t\t\t- Search nearby container");
    System.out.println("\tclose\t\t\t- Close nearby container");
    System.out.println("\theath\t\t\t- display current HP");
    System.out.println("\teat 'food'\t\t- eat given food");
    System.out.println("\n\u001B[34m*****************************************[Menu]********************************************************");
    System.out.println("*******************************************************************************************************\u001B[0m");
  }

  //Press Enter prompt for start
  public static void enterPromt()throws InterruptedException{
    System.out.println("\nPress 'ENTER' to continue");
  }

  //Final enter prompt, starts the game
  public static void enterWakeUpPromt()throws InterruptedException{
    System.out.println("\nPress 'ENTER' to wake up and start the adventure");
  }

  //Next move prompt
  public static void nextMovePrompt()throws InterruptedException{
    printer("\n\nWhat is your next move?");
  }


  //Exit prompt
  public static void exitPrompt()throws InterruptedException{
    printer("You are now exiting the game!");
  }

  //Outprint when player only types "go"
  public static void incompleteDirection()throws InterruptedException{
    printer("Where do you want to go?");
    printer("Please type something like 'go east' or 'go north'");
  }

  //outprint for invalid input command
  public static void invalidInput() {
    System.out.println("Invalid input!");
  }

  //For when direction is null
  public static void directionNull(){
    System.out.println("You cannot go this way");
  }

  public static void displayRoomName(String name)throws InterruptedException{
    printer("You are in the " + name);
  }

  //display the room description when the user enters a specif room for the first time
  public static void displayRoomDescription(String description) throws InterruptedException {
    printer("You walk into" + description);
  }
  //look command to display the room description to the user
  public static void displayLookDescription(String description) {
    System.out.println("You are in" + description);
  }

  public static void displayRoomItems(ArrayList<Item> item) {
    System.out.println("You see the following items in the room: " + item);
  }

  public static void displaySearchContainer() throws InterruptedException {
    System.out.print("Searching container");
    Thread.sleep(1000);
    System.out.print(".");
    Thread.sleep(1000);
    System.out.print(".");
    Thread.sleep(1000);
    System.out.print(".");
    Thread.sleep(1000);
    System.out.println("\n\n");
  }

  public static void displayCloseContainer() throws InterruptedException {
    printer("Closing container");
  }

  public static void displayEat(String name, int health) {
    System.out.println("You have eaten " + name  );
    if (health < 0){
      System.out.println("You have lost " + -health + " HP");
    }else{
      System.out.println("You have gained " + health + " HP");
    }

  }



  public static void displayHealth(int health) {
    System.out.print("Your HP is currently " + health);
    switch ((int)health/20) {
      case (0) -> System.out.print(". Your health is critical. Avoid combat at all costs!");
      case (1) -> System.out.print(". Your health is low. You should not seek combat");
      case (2) -> System.out.print(". Your health is okay. You are lighlt injured");
      case (3) -> System.out.print(". Your health is good. You can engage in combat");
      case (4) -> System.out.print(". Your health is very good. You can safely engage in combat");
      case (5) -> System.out.print(". You are full health! Seek out your enemies!");
    }
  }

  public static void printer(String text) throws InterruptedException {
    for (int i = 0; i <= text.length()-1; i++){
      System.out.print(text.charAt(i));
      Thread.sleep(0);
    }
    System.out.println();
  }

}


