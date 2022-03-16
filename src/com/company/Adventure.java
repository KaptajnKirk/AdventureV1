package com.company;

import java.util.Scanner;

public class Adventure {

  Scanner scanner = new Scanner(System.in);

  //Create all 9 rooms for the game
  Rooms room1 = new Rooms("Captains quarters", " a room partly on fire. Small pieces of debris is falling from holes in the ceiling.\nAround you are scattered furniture, displaced in the crash. A work table, some vials on the floor,\nand a Alterra poster on the wall with a picture of the newest model of Alterra excavation machine.\nYou are slightly confused, and the last thing you remember is dropping to the planet surface in the Alterra Space cruiser.\nYou see doors to the south and east.");
  Rooms room2 = new Rooms("Mess Hall", " the massive mess hall, made to feed the 240 workers aboard the Alterra Starliner Aurora.\nOnly a few of the bright fluorecent lights, light up the grey and white walls of the mess hall,\nand reflect in the water that is slowly filling the room. Once filled with perfectly formed lines of long-tables and benches,\nthe room is now a chaos of floating furniture and patches of fire.\nYou see doors to the west and east.");
  Rooms room3 = new Rooms("Armory", " a medium sized room, with water reaching to your knees. The room is tightly packed with shelves that are now partly empty,\nas the crates that once occupied them are now all around you. Contrary to its name, you dont see any actual weapons,\nbut mostly tools used for excavation and research. The room is slightly dark, as your only light-source is a standing lamp,\nnow tipped over and lying submerged in water, scattering the light.\nYou see doors to the west and south.");
  Rooms room4 = new Rooms("Garage ", " the giant garage, with cars, excavation-machines and boats are hanging from the ceiling.\nSome of the bigger vehicles have fallen to the ground, but somehow the garage is weirdly intact.\nA small electric fire obscures one of the exits. There is a giant gate at the end of the room, for getting the vehicles out,\nonce on planet-side. You know it leads to the Auroras stern ramp.\nThe gates is slowly leaking water through the crack where to two doors meet.\nYou see doors to the north and south.");
  Rooms room5 = new Rooms("Reactor Room", " the massive reactor room, onto the bridge. The bridge is suspended in the middle of the massive room,\noverlooking the abyss that is now the almost filled reactor room. The water almost reaches the bridge.\nFour pillars stretches from the ceiling way above you, and disappear into the depths below.\nWhen you look closely, you can see the shadow of something big, slithering around in the water below you,\nbut you cant quite make out what it is.\nThe way you came in, seems to be the only way out.");
  Rooms room6 = new Rooms("Engine Room", ", what you instantly recognize as the engine room, since this is where you used to work.\nIts a low hanging ceiling, and you have to duck some places to get around,\nbecause of the interwoven tubes that go from the engines to the sub-engines. The room is mostly intact,\nwith the exception of small fires here and there, and one of the sub-engines leaking coolant.\nYou see a door to the north and south.");
  Rooms room7 = new Rooms("Sleeping Quarters", " the sleeping quarters. This is just one room of the many that makes up the crew quarters.\nSmall fires are scattered across the room, and a medium sizes hole has been made in the southern wall,\nmaking the neighbour room visible. As Alterra doesnt allow many personal items to bring along on excavation voyages,\nthe only things floating around in the ankle high water are small tools, hygiene items, papers, etc.\nYou see doors to the north and east.");
  Rooms room8 = new Rooms("Science Lab", " a small room, with a single, one-person submarine suspended from the ceiling in the middle of the room.\nYou have never visited the lab prior, since it has always been off limits. Glass shards from vials fills the floor,\nand microscopes and other research tools, are scattered amongst the flipped worktables and whiteboards.\nYou can see equations etched onto the wall-embedded worktables.\nThe ceiling lights are weirdly still fully functioning, covering the lab in a bright defused, white light.\nYou see doors to the west, north and east.");
  Rooms room9 = new Rooms("Submarine Bay", " a massive hall, with Alterra's signature expedition submarine, 'The Cyclops' taking up most of the hall.\nThe submarine has fallen out of its ceiling mount, and now partly blocks the entrance pool below it.\nOn the bottom of the entrance pool, there is a gate that opens up, as an exit for submarines.\nAround the room, there are one-man submarines socketed into the walls, where they used to charge.\nSome of them fell out during the crash, and now partly occupy the bay floor.\nYou should be able to take a one-man submarine through the gate, provided you can get it open.\nYou see doors to the north and west.");

  //Set the current location to the first room which is where the user starts the game
  Rooms currentLocation = room1;

  //route all rooms to one another
  public void roomRoutes() {
    room1.setDiscovered(true); //As it is the room that you spawn in
    room1.setEast(room2);
    room1.setSouth(room4);
    room2.setWest(room1);
    room2.setEast(room3);
    room3.setSouth(room6);
    room3.setWest(room2);
    room4.setNorth(room1);
    room4.setSouth(room7);
    room5.setSouth(room8);
    room6.setSouth(room9);
    room6.setNorth(room3);
    room7.setNorth(room4);
    room7.setEast(room8);
    room8.setWest(room7);
    room8.setNorth(room5);
    room8.setEast(room9);
    room9.setWest(room8);
    room9.setNorth(room6);
  }

  //Title Card text art
  public void displayTitleCard() {
    System.out.println("\n\n\u001B[34m███████╗███████╗ ██████╗ █████╗ ██████╗ ███████╗    ███████╗██████╗  ██████╗ ███╗   ███╗     █████╗ ██╗   ██╗██████╗  ██████╗ ██████╗  █████╗" +
        "\n██╔════╝██╔════╝██╔════╝██╔══██╗██╔══██╗██╔════╝    ██╔════╝██╔══██╗██╔═══██╗████╗ ████║    ██╔══██╗██║   ██║██╔══██╗██╔═══██╗██╔══██╗██╔══██╗" +
        "\n█████╗  ███████╗██║     ███████║██████╔╝█████╗      █████╗  ██████╔╝██║   ██║██╔████╔██║    ███████║██║   ██║██████╔╝██║   ██║██████╔╝███████║" +
        "\n██╔══╝  ╚════██║██║     ██╔══██║██╔═══╝ ██╔══╝      ██╔══╝  ██╔══██╗██║   ██║██║╚██╔╝██║    ██╔══██║██║   ██║██╔══██╗██║   ██║██╔══██╗██╔══██║" +
        "\n███████╗███████║╚██████╗██║  ██║██║     ███████╗    ██║     ██║  ██║╚██████╔╝██║ ╚═╝ ██║    ██║  ██║╚██████╔╝██║  ██║╚██████╔╝██║  ██║██║  ██║" +
        "\n╚══════╝╚══════╝ ╚═════╝╚═╝  ╚═╝╚═╝     ╚══════╝    ╚═╝     ╚═╝  ╚═╝ ╚═════╝ ╚═╝     ╚═╝    ╚═╝  ╚═╝ ╚═════╝ ╚═╝  ╚═╝ ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝\u001B[0m");
  }

  //End Card text art
  public void displayEndCard() {
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

  //Display room name whenever user enters a room
  public void displayRoomName() {
    System.out.println("You are in the " + currentLocation.getName());
  }

  //display the room description when the user enters a specif room for the first time
  public void displayRoomDescription() {
    System.out.println("You walk into" + currentLocation.getDescription());
  }

  //look command to display the room description to the user
  public void displayLookDescription() {
    System.out.println("You are in" + currentLocation.getDescription());
  }

  //Intro to the games backstory and setup
  public void displayIntro() {
    System.out.println("\u001B[32m***************************************[BACKSTORY]*****************************************************\u001B[0m");
    System.out.println("""
            You are an engine mechanic aboard the galactic excavation and discovery vehicle The Aurora.
            The mission, codenamed 'Degassi' is funded by the trans-governmental corporation Alterra.
            Alterra owns 61% of all space travel assets in the milky way galaxy, and they also happen to be your employer.
            The Degassi mission is slated to last approximately four years.
            its main objective is to research and excavate newly discovered planet 6784X, for future habitation.
            With no real family or relationship back on earth, you signed on for the generous mission salary.
            The Aurora is a massive ship equipped for both land and water-based missions, and houses 265 crew members in total.
            The Degassi mission has recently passed its one year mark, and you are currently slingshotting around planet 4546B.
            An ocean planet consisting of 91.1% water. One day you are called to the Captains Quarters, to report the weekly fuel consumption rate.
            In the middle of your report, the ship suddenly starts to shake violently, and you lose your footing, stumbling to the ground.
            Red lights starts blinking, as the intercom sounds 'ALERT: SHIP UNDER ATTACK. TWO MAIN ENGINES LOST. EVACUATE TO THE ESCAPE PODS'.
            Suddenly a small explosion happens inside the room, and as you and the captain are storming towards the exit, a single wall panel rips lose.
            it flies straight towards you. In an instant, everything turns dark...
            """);
  }

  //Intro to the game, basically room 1 description but with a wakeup start sentence
  public void displayWakeUp() {
    System.out.println("""
            You awake in a room partly on fire. Small pieces of debris is falling from holes in the ceiling.
            Around you are scattered furniture, displaced in the crash. A work table, some vials on the floor,
            and a Alterra poster on the wall with a picture of the newest model of Alterra excavation machine.
            You are slightly confused, and the last thing you remember is dropping to the planet surface in the Alterra Space cruiser.
            You see doors to the south and east.
            """);
  }

  //display of the HELP menu
  public void displayHelpMenu() {
    System.out.println("\u001B[34m*******************************************************************************************************");
    System.out.println("*****************************************[HELP]********************************************************\u001B[0m");
    System.out.println("\n\texit\t- Exit the game");
    System.out.println("\tlook\t- Get the description of current room");
    System.out.println("\tgo\t\t- Go in the direction you wish by typing 'go' followed by the direction. (ex. go north)");
    System.out.println("\thelp\t- Get this help menu");
    System.out.println("\n\u001B[34m*****************************************[Menu]********************************************************");
    System.out.println("*******************************************************************************************************\u001B[0m");
  }


  //Change rooms discover boolean to true after the user has entered a room
  public void markAreaDiscovered() {
    currentLocation.setDiscovered(true);
  }

  public void goDirection(Rooms direction){
    if (direction == null) {
      System.out.println("You cannot go this way");
    } else {
      currentLocation = direction;
    }
    if (currentLocation.getDiscovered()) { //Do not display room name when direction is null
      displayRoomName();
    }else {
      markAreaDiscovered();
      displayRoomDescription();
      displayRoomName();
    }
  }

  //The main game method with while loop that runs until user types exit
  public void game() {
    roomRoutes();
    displayTitleCard();
    System.out.println("\nPress 'ENTER' to continue");
    String next = scanner.nextLine();
    System.out.println("Type 'help' at any stage during the adventure to get a list of commands.");
    System.out.println("\nPress 'ENTER' to continue");
    next = scanner.nextLine();
    displayIntro();
    System.out.println("\nPress 'ENTER' to wake up and start the adventure");
    next = scanner.nextLine();
    displayWakeUp();
    displayRoomName();
    boolean run = true;
    while (run) {
      System.out.println("\n\nWhat is your next move?");
      String choice = scanner.nextLine();

      switch (choice) {
        case "exit":
          System.out.println("You are now exiting the game!");
          run = false;
          break;
        case "look":
          displayLookDescription();
          break;
        case "go north", "north", "n":
          //goNorth();
          goDirection(currentLocation.getNorth());
          break;
        case "go south", "south", "s":
          //goSouth();
          goDirection(currentLocation.getSouth());
          break;
        case "go east", "east", "e":
          //goEast();
          goDirection(currentLocation.getEast());
          break;
        case "go west", "west", "w":
          //goWest();
          goDirection(currentLocation.getWest());
          break;
        case "go":
          System.out.println("Where do you want to go?");
          System.out.println("Please type something like 'go east' or 'go north'");
          break;
        case "help":
          displayHelpMenu();
          break;
        default:
          System.out.println("Invalid input");
      }
    }
    displayEndCard();
  }

  public static void main(String[] args) {

    Adventure prg = new Adventure();
    prg.game();
  }
}
