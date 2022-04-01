package com.company;

import java.util.ArrayList;

public class uiPrint {
  static final String BLACK = "\033[0;30m";   // BLACK
  static final String RED = "\033[0;31m";     // RED
  static final String GREEN = "\033[0;32m";   // GREEN
  static final String YELLOW = "\033[0;33m";  // YELLOW
  static final String BLUE = "\033[0;34m";    // BLUE
  static final String PURPLE = "\033[0;35m";  // PURPLE
  static final String CYAN = "\033[0;36m";    // CYAN
  static final String WHITE = "\033[0;37m";   // WHITE
  static final String RESET = "\u001B[0m";    // reset colour

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
    System.out.println(BLUE + "███████╗███████╗ ██████╗ █████╗ ██████╗ ███████╗    ███████╗██████╗  ██████╗ ███╗   ███╗     █████╗ ██╗   ██╗██████╗  ██████╗ ██████╗  █████╗");
    Thread.sleep(500);
    System.out.println("██╔════╝██╔════╝██╔════╝██╔══██╗██╔══██╗██╔════╝    ██╔════╝██╔══██╗██╔═══██╗████╗ ████║    ██╔══██╗██║   ██║██╔══██╗██╔═══██╗██╔══██╗██╔══██╗");
    Thread.sleep(500);
    System.out.println("█████╗  ███████╗██║     ███████║██████╔╝█████╗      █████╗  ██████╔╝██║   ██║██╔████╔██║    ███████║██║   ██║██████╔╝██║   ██║██████╔╝███████║");
    Thread.sleep(500);
    System.out.println("██╔══╝  ╚════██║██║     ██╔══██║██╔═══╝ ██╔══╝      ██╔══╝  ██╔══██╗██║   ██║██║╚██╔╝██║    ██╔══██║██║   ██║██╔══██╗██║   ██║██╔══██╗██╔══██║");
    Thread.sleep(500);
    System.out.println("███████╗███████║╚██████╗██║  ██║██║     ███████╗    ██║     ██║  ██║╚██████╔╝██║ ╚═╝ ██║    ██║  ██║╚██████╔╝██║  ██║╚██████╔╝██║  ██║██║  ██║");
    Thread.sleep(500);
    System.out.println("╚══════╝╚══════╝ ╚═════╝╚═╝  ╚═╝╚═╝     ╚══════╝    ╚═╝     ╚═╝  ╚═╝ ╚═════╝ ╚═╝     ╚═╝    ╚═╝  ╚═╝ ╚═════╝ ╚═╝  ╚═╝ ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝" + RESET);
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
    System.out.println(GREEN + "████████╗██╗  ██╗ █████╗ ███╗   ██╗██╗  ██╗    ██╗   ██╗ ██████╗ ██╗   ██╗");
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
    System.out.println("╚═╝      ╚═════╝ ╚═╝  ╚═╝    ╚═╝     ╚══════╝╚═╝  ╚═╝   ╚═╝   ╚═╝╚═╝  ╚═══╝ ╚═════╝" + RESET);
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

    System.out.println(CYAN + "╔═══════════════════════════════════════════════════HELP═══════════════════════════════════════════════╗" + RESET);
    System.out.println("\n\texit\t\t\t\t- Exit the game");
    System.out.println("\tlook\t\t\t\t- Get the description of current room");
    System.out.println("\tgo 'direction'\t\t- Go in the given direction(ex. go north)");
    System.out.println("\thelp\t\t\t\t- Get this help menu");
    System.out.println("\ttake 'item'\t\t\t- Place a given item in your inventory ");
    System.out.println("\tdrop 'item'\t\t\t- Drop the given item on the floor in current room");
    System.out.println("\tinventory\t\t\t- Open your inventory");
    System.out.println("\tsearch 'container'\t- Search nearby container");
    System.out.println("\tclose\t\t\t\t- Close nearby container");
    System.out.println("\thealth\t\t\t\t- Display current HP");
    System.out.println("\teat 'food'\t\t\t- Eat given food");
    System.out.println("\tequip 'weapon'\t\t- Equip given weapon");
    System.out.println("\tattack\t\t\t\t- Attack with equipped weapon");
    System.out.println(CYAN + "\n╚══════════════════════════════════════════════════════════════════════════════════════════════════════╝" + RESET);
  }

  //display of the HELP menu when in container
  public static void displayContainerHelpMenu() {
    System.out.println(CYAN + "╔═══════════════════════════════HELP═════════════════════════════╗" + RESET);
    System.out.println("\n\thelp\t\t\t- Get this help menu");
    System.out.println("\ttake 'item'\t\t- Place a given item in your inventory ");
    System.out.println("\teat 'food'\t\t- Eat given food");
    System.out.println("\tinventory\t\t- Open your inventory");
    System.out.println("\tequip 'weapon'\t- Equip given weapon");
    System.out.println("\tclose\t\t\t- Close nearby container");
    System.out.println(CYAN + "\n╚════════════════════════════════════════════════════════════════╝" + RESET);
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
    System.out.println("Invalid input! Type 'help' for available commands!");
  }

  //For when direction is null
  public static void directionNull() throws InterruptedException {
    printer("You cannot go this way");
  }

  public static void displayRoomName(String name)throws InterruptedException{
    printer("You are in the " + name);
  }

  //display the room description when the user enters a specif room for the first time
  public static void displayRoomDescription(String description) throws InterruptedException {
    printer("You walk into" + description + "\n");
  }
  //look command to display the room description to the user
  public static void displayLookDescription(String description){
    System.out.println("You are in" + description + "\n");
  }

  public static void displayRoomItems(ArrayList<Item> item) {
    System.out.println("You see the following items in the room: " + item);
  }

  public static void displayRoomEnemy(Enemy enemy){
    System.out.println("The following enemies are in this room: " + enemy);
  }

  public static void displayRoomEnemyDescription(String description) throws InterruptedException {
    printer(description);
  }
  public static void displayRoomContainer(Container container){
    System.out.println("You see the following containers in the room: " + container);
  }

  public static void displaySearchContainer(String name) throws InterruptedException {
    System.out.print("Searching " + name);
    Thread.sleep(1000);
    System.out.print(".");
    Thread.sleep(1000);
    System.out.print(".");
    Thread.sleep(1000);
    System.out.print(".");
    Thread.sleep(1000);
    System.out.println("\n\n");
  }

  public static void displayCloseContainer(String name) throws InterruptedException {
    printer("You moved away from the " + name);
  }

  public static void displayEat(String name, int health) {
    System.out.println("You have eaten " + name  );
    if (health < 0){
      System.out.println("You have lost " + -health + " HP");
    }else{
      System.out.println("You have gained " + health + " HP");
    }
  }

  public static void displayGameOver() throws InterruptedException {
    newPage();
    System.out.println("\t\t\t\t\t   ;~)                  (~;_");
    Thread.sleep(500);
    System.out.println("\t\t\t\t\t (   |                  |   )");
    Thread.sleep(500);
    System.out.println("\t\t\t\t\t  ~', ',    ,''~'',   ,' ,'~");
    Thread.sleep(500);
    System.out.println("\t\t\t\t\t      ', ','       ',' ,'");
    Thread.sleep(500);
    System.out.println("\t\t\t\t\t        ',:"+BLACK+" {'} {'}"+RESET+" :,'");
    Thread.sleep(500);
    System.out.println("\t\t\t\t\t          ;   /^\\   ;");
    Thread.sleep(500);
    System.out.println("\t\t\t\t\t           ~\\  ~  /~");
    Thread.sleep(500);
    System.out.println("\t\t\t\t\t         ,' ,"+BLACK+"~~~~~"+RESET+", ',");
    Thread.sleep(500);
    System.out.println("\t\t\t\t\t       ,' ,' ;~~~; ', ',");
    Thread.sleep(500);
    System.out.println("\t\t\t\t\t     ,' ,'    '''    ', ',");
    Thread.sleep(500);
    System.out.println("\t\t\t\t\t   (~  ;               ;  ~)");
    Thread.sleep(500);
    System.out.println("\t\t\t\t\t    -;_)               (_;-\n");
    System.out.println();
    System.out.println(RED + " ██████   █████  ███    ███ ███████      ██████  ██    ██ ███████ ██████");
    Thread.sleep(500);
    System.out.println("██       ██   ██ ████  ████ ██          ██    ██ ██    ██ ██      ██   ██");
    Thread.sleep(500);
    System.out.println("██   ███ ███████ ██ ████ ██ █████       ██    ██ ██    ██ █████   ██████");
    Thread.sleep(500);
    System.out.println("██    ██ ██   ██ ██  ██  ██ ██          ██    ██  ██  ██  ██      ██   ██");
    Thread.sleep(500);
    System.out.println(" ██████  ██   ██ ██      ██ ███████      ██████    ████   ███████ ██   ██"+ RESET);
    Thread.sleep(2000);
  }

  public static void winGame () throws InterruptedException {
    newPage();
    printer("Congratulations! You killed the reaper leviathan, and can now escape the Aurora.\nNow the real challenge begins in the oceans of Planet 4546B... ");
    Thread.sleep(5000);
    newPage();
    System.out.println( GREEN +"██    ██  ██████  ██    ██     ██     ██  ██████  ███    ██ ██ ");
    Thread.sleep(500);
    System.out.println( BLUE +" ██  ██  ██    ██ ██    ██     ██     ██ ██    ██ ████   ██ ██ ");
    Thread.sleep(500);
    System.out.println( YELLOW +"  ████   ██    ██ ██    ██     ██  █  ██ ██    ██ ██ ██  ██ ██ ");
    Thread.sleep(500);
    System.out.println( RED +"   ██    ██    ██ ██    ██     ██ ███ ██ ██    ██ ██  ██ ██    ");
    Thread.sleep(500);
    System.out.println( CYAN +"   ██     ██████   ██████       ███ ███   ██████  ██   ████ ██ ");
    Thread.sleep(2000);
  }



  public static void displayHealth(int health) {
    System.out.print("Your HP is currently " + health);
    switch (health/20) {
      case (0) -> System.out.print(". Your health is critical. Avoid combat at all costs!");
      case (1) -> System.out.print(". Your health is low. You should not seek combat");
      case (2) -> System.out.print(". Your health is okay. You are lightly injured");
      case (3) -> System.out.print(". Your health is good. You can engage in combat");
      case (4) -> System.out.print(". Your health is very good. You can safely engage in combat");
      case (5) -> System.out.print(". You are full health! Seek out your enemies!");
    }
  }

  public static void displayPlayerUI(int health, Item weapon){
    System.out.println("\n╔══════════HP════════════╗");
    switch(health/10){
      case 0 -> System.out.println("║  " + RED +    "██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒" + RESET + "  ║");
      case 1 -> System.out.println("║  " + RED +    "████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒" + RESET + "  ║");
      case 2 -> System.out.println("║  " + RED +    "██████▒▒▒▒▒▒▒▒▒▒▒▒▒▒" + RESET + "  ║");
      case 3 -> System.out.println("║  " + YELLOW + "████████▒▒▒▒▒▒▒▒▒▒▒▒" + RESET + "  ║");
      case 4 -> System.out.println("║  " + YELLOW + "█████████▒▒▒▒▒▒▒▒▒▒▒" + RESET + "  ║");
      case 5 -> System.out.println("║  " + YELLOW + "██████████▒▒▒▒▒▒▒▒▒▒" + RESET + "  ║");
      case 6 -> System.out.println("║  " + YELLOW + "████████████▒▒▒▒▒▒▒▒" + RESET + "  ║");
      case 7 -> System.out.println("║  " + GREEN +  "██████████████▒▒▒▒▒▒" + RESET + "  ║");
      case 8 -> System.out.println("║  " + GREEN +  "████████████████▒▒▒▒" + RESET + "  ║");
      case 9 -> System.out.println("║  " + GREEN +  "██████████████████▒▒" + RESET + "  ║");
      case 10 ->System.out.println("║  " + GREEN +  "████████████████████" + RESET + "  ║");
    }
    System.out.println("╚════════════════════════╝");
    if (weapon != null){
      System.out.print("WEAPON SLOT: " + weapon);
      if(weapon instanceof RangedWeapon){
        System.out.print(" [" + ((RangedWeapon) weapon).getMagBulletsAmount() + "]");
      }
    }
  }

  public static void printer(String text) throws InterruptedException {
    for (int i = 0; i <= text.length()-1; i++){
      System.out.print(text.charAt(i));
      Thread.sleep(5);
    }
    System.out.println();
  }

}


