package com.company;

public class uxPrint {

  //Displays the backstory during the intro
  public static void introPrint () {
    System.out.println("\u001B[32m***************************************[BACKSTORY]*****************************************************\u001B[0m");
    System.out.println("You are an engine mechanic aboard the galactic excavation and discovery vehicle The Aurora." +
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
  public static void displayTitleCard() {
    System.out.println("\n\n\u001B[34m███████╗███████╗ ██████╗ █████╗ ██████╗ ███████╗    ███████╗██████╗  ██████╗ ███╗   ███╗     █████╗ ██╗   ██╗██████╗  ██████╗ ██████╗  █████╗" +
        "\n██╔════╝██╔════╝██╔════╝██╔══██╗██╔══██╗██╔════╝    ██╔════╝██╔══██╗██╔═══██╗████╗ ████║    ██╔══██╗██║   ██║██╔══██╗██╔═══██╗██╔══██╗██╔══██╗" +
        "\n█████╗  ███████╗██║     ███████║██████╔╝█████╗      █████╗  ██████╔╝██║   ██║██╔████╔██║    ███████║██║   ██║██████╔╝██║   ██║██████╔╝███████║" +
        "\n██╔══╝  ╚════██║██║     ██╔══██║██╔═══╝ ██╔══╝      ██╔══╝  ██╔══██╗██║   ██║██║╚██╔╝██║    ██╔══██║██║   ██║██╔══██╗██║   ██║██╔══██╗██╔══██║" +
        "\n███████╗███████║╚██████╗██║  ██║██║     ███████╗    ██║     ██║  ██║╚██████╔╝██║ ╚═╝ ██║    ██║  ██║╚██████╔╝██║  ██║╚██████╔╝██║  ██║██║  ██║" +
        "\n╚══════╝╚══════╝ ╚═════╝╚═╝  ╚═╝╚═╝     ╚══════╝    ╚═╝     ╚═╝  ╚═╝ ╚═════╝ ╚═╝     ╚═╝    ╚═╝  ╚═╝ ╚═════╝ ╚═╝  ╚═╝ ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝\u001B[0m");
  }

  //Displays ASCII art endcard
  public static void displayEndCard() {
    System.out.println("\u001B[32m████████╗██╗  ██╗ █████╗ ███╗   ██╗██╗  ██╗    ██╗   ██╗ ██████╗ ██╗   ██╗\n" +
        "╚══██╔══╝██║  ██║██╔══██╗████╗  ██║██║ ██╔╝    ╚██╗ ██╔╝██╔═══██╗██║   ██║\n" +
        "   ██║   ███████║███████║██╔██╗ ██║█████╔╝      ╚████╔╝ ██║   ██║██║   ██║\n" +
        "   ██║   ██╔══██║██╔══██║██║╚██╗██║██╔═██╗       ╚██╔╝  ██║   ██║██║   ██║\n" +
        "   ██║   ██║  ██║██║  ██║██║ ╚████║██║  ██╗       ██║   ╚██████╔╝╚██████╔╝\n" +
        "   ╚═╝   ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═══╝╚═╝  ╚═╝       ╚═╝    ╚═════╝  ╚═════╝\n" +
        "███████╗ ██████╗ ██████╗     ██████╗ ██╗      █████╗ ██╗   ██╗██╗███╗   ██╗ ██████╗\n" +
        "██╔════╝██╔═══██╗██╔══██╗    ██╔══██╗██║     ██╔══██╗╚██╗ ██╔╝██║████╗  ██║██╔════╝\n" +
        "█████╗  ██║   ██║██████╔╝    ██████╔╝██║     ███████║ ╚████╔╝ ██║██╔██╗ ██║██║  ███╗\n" +
        "██╔══╝  ██║   ██║██╔══██╗    ██╔═══╝ ██║     ██╔══██║  ╚██╔╝  ██║██║╚██╗██║██║   ██║\n" +
        "██║     ╚██████╔╝██║  ██║    ██║     ███████╗██║  ██║   ██║   ██║██║ ╚████║╚██████╔╝\n" +
        "╚═╝      ╚═════╝ ╚═╝  ╚═╝    ╚═╝     ╚══════╝╚═╝  ╚═╝   ╚═╝   ╚═╝╚═╝  ╚═══╝ ╚═════╝ \u001B[0m");
  }

  //Intro to the game, basically room 1 description but with a wakeup start sentence
  public static void displayWakeUp() {
    System.out.println("""
        You awake in a room partly on fire. Small pieces of debris is falling from holes in the ceiling.
        Around you are scattered furniture, displaced in the crash. A work table, some vials on the floor,
        and a Alterra poster on the wall with a picture of the newest model of Alterra excavation machine.
        You are slightly confused, and the last thing you remember is dropping to the planet surface in the Alterra Space cruiser.
        You see doors to the south and east.
        """);

  }

  //display of the HELP menu
  public static void displayHelpMenu() {
    System.out.println("\u001B[34m*******************************************************************************************************");
    System.out.println("*****************************************[HELP]********************************************************\u001B[0m");
    System.out.println("\n\texit\t- Exit the game");
    System.out.println("\tlook\t- Get the description of current room");
    System.out.println("\tgo\t\t- Go in the direction you wish by typing 'go' followed by the direction. (ex. go north)");
    System.out.println("\thelp\t- Get this help menu");
    System.out.println("\n\u001B[34m*****************************************[Menu]********************************************************");
    System.out.println("*******************************************************************************************************\u001B[0m");
  }

  //Press Enter prompt for start
  public static void enterPromt (){
    System.out.println("\nPress 'ENTER' to continue");
  }

  //Prompt to tell the command for help, in the start
  public static void helpPrompt(){
    System.out.println("Type 'help' at any stage during the adventure to get a list of commands.");
  }

  //Final enter prompt, starts the game
  public static void enterWakeUpPromt(){
    System.out.println("\nPress 'ENTER' to wake up and start the adventure");
  }

  //Next move prompt
  public static void nextMovePrompt(){
    System.out.println("\n\nWhat is your next move?");
  }


  //Exit prompt
  public static void exitPrompt(){
    System.out.println("You are now exiting the game!");
  }

  //Outprint when player only types "go"
  public static void incompleteDirection(){
    System.out.println("Where do you want to go?");
    System.out.println("Please type something like 'go east' or 'go north'");
  }

  //outprint for invalid input command
  public static void invalidInput(){
    System.out.println("Invalid input");
  }

  //For when direction is null
  public static void directionNull(){
    System.out.println("You cannot go this way");
  }


}


