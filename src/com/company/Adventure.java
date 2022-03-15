package com.company;

import java.util.Scanner;

public class Adventure {

  Scanner scanner = new Scanner(System.in);
  Rooms room1 = new Rooms("Captains quarters", " You awake in a room partly on fire. Small pieces of debris is falling from holes in the ceiling. Around you are scattered furniture, displaced in the crash. A work table, some vials on the floor, and a Alterra poster on the wall with a picture of the newest model of Alterra excavation machine. You are slightly confused, and the last thing you remember is dropping to the planet surface in the Alterra Space cruiser. You see doors to the south and east");
  Rooms room2 = new Rooms("Mess Hall", " the massive mess hall, made to feed the 240 workers aboard the Alterra Starliner Aurora. Only a few of the bright fluorecent lights, light up the grey and white walls of the mess hall, and reflect in the water that is slowly filling the room. Once filled with perfectly formed lines of long-tables and benches, the room is now a chaos of floating furniture and patches of fire. You see doors to the west and east");
  Rooms room3 = new Rooms("Armory", " a medium sized room, with water reaching to your knees. The room is tightly packed with shelves that are now partly empty, as the crates that once occupied them are now all around you. Contrary to its name, you dont see any actual weapons, but mostly tools used for excavation and research. The room is slightly dark, as your only light-source is a standing lamp, now tipped over and lying submerged in water, scattering the light. You see doors to the west and south");
  Rooms room4 = new Rooms("Garage ", " the giant garage, with cars, excavation-machines and boats are hanging from the ceiling. Some of the bigger vehicles have fallen to the ground, but somehow the garage is weirdly intact. A small electric fire obscures one of the exits. There is a giant gate at the end of the room, for getting the vehicles out, once on planet-side. You know it leads to the Auroras stern ramp. the gates is slowly leaking water through the crack where to two doors meet. You see doors to the north and south");
  Rooms room5 = new Rooms("Reactor Room", " the massive reactor room, onto the bridge. The bridge is suspended in the middle of the massive room, overlooking the abyss that is now the almost filled reactor room. The water almost reaches the bridge. Four pillars stretches from the ceiling way above you, and disappear into the depths below. When you look closely, you can see the shadow of something big, slithering around in the water below you, but you cant quite make out what it is. The way you came in, seems to be the only entrance or exit");
  Rooms room6 = new Rooms("Engine Room", ", what you instantly recognize as the engine room, since this is where you used to work. its a low hanging ceiling, and you have to duck some places to get around, because of the interwoven tubes that go from the engines to the sub-engines. The room is mostly intact, with the exception of small fires here and there, and one of the sub-engines leaking coolant. You see a door to the north and south");
  Rooms room7 = new Rooms("Sleeping Quarters", " the sleeping quarters. This is just one room of the many that makes up the crew quarters. Small fires are scattered across the room, and a medium sizes hole has been made in the southern wall, making the neighbour room visible. As Alterra doesnt allow many personal items to bring along on excavation voyages, the only things floating around in the ankle high water are small tools, hygiene items, papers, etc. You see doors to the north and east");
  Rooms room8 = new Rooms("Science Lab", " a small room, with a single, one-person submarine suspended from the ceiling in the middle of the room. You have never visited the lab prior, since it has always been off limits. Glass shards from vials fills the floor, and microscopes and other research tools, are scattered amongst the flipped worktables and whiteboards. You can see equations etched onto the wall-embedded worktables. The ceiling lights are weirdly still fully functioning, covering the lab in a bright defused, white light. You see doors to the west, north and east");
  Rooms room9 = new Rooms("Submarine Bay", " a massive hall, with Alterra's signature expedition submarine, 'The Cyclops' taking up most of the hall. The submarine has fallen out of its ceiling mount, and now partly blocks the entrance pool below it. On the bottom of the entrance pool, there is a gate that opens up, as an exit for submarines. Around the room, there are one-man submarines socketed into the walls, where they used to charge. Some of them fell out during the crash, and now partly occupy the bay floor. You should be able to take a one-man submarine through the gate, provided you can get it open. you see doors to the north and west.");

  Rooms currentLocation = room1;
  boolean discovered = currentLocation.getDiscovered();

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

  public void displayRoomName() {
    System.out.println("You are in the " + currentLocation.getName());
  }

  public void displayRoomDescription() {
    System.out.print("You walk into" + currentLocation.getDescription());
  }

  public void displayLookDescription(){
    System.out.println("You are in" + currentLocation.getDescription());
  }

  public void displayIntro() {
    displayRoomDescription();
  }

  public void displayHelpMenu() {
    System.out.println("exit\t- Exit the game");
    System.out.println("look\t- Get the description of current room");
    System.out.println("go\t\t- Go in the direction you wish by typing 'go' followed by the direction. (ex. go north)");
    System.out.println("help\t- Get this help menu");
  }

  public void markAreaDiscovered() {
    currentLocation.setDiscovered(true);
  }

  public void goNorth() {
    if (currentLocation.getNorth() == null) {
      System.out.println("You cannot go this way");
    } else {
      currentLocation = currentLocation.getNorth();
      displayRoomName();
    }
    if (currentLocation.getDiscovered() == false) {
      markAreaDiscovered();
      displayRoomDescription();
    }
  }

  public void goSouth() {
    if (currentLocation.getSouth() == null) {
      System.out.println("You cannot go this way");
    } else{
      currentLocation = currentLocation.getSouth();
    displayRoomName();}
    if (currentLocation.getDiscovered() == false) {
      markAreaDiscovered();
      displayRoomDescription();
    }
  }

  public void goEast() {
    if (currentLocation.getEast() == null) {
      System.out.println("You cannot go this way");
    } else {
      currentLocation = currentLocation.getEast();
    displayRoomName();}
    if (currentLocation.getDiscovered() == false) {
      markAreaDiscovered();
      displayRoomDescription();
    }
  }

  public void goWest() {
    if (currentLocation.getWest() == null) {
      System.out.println("You cannot go this way");
    } else{
      currentLocation = currentLocation.getWest();
    displayRoomName();}
    if (currentLocation.getDiscovered() == false) {
      markAreaDiscovered();
      displayRoomDescription();
    }
  }

  public void game() {
    roomRoutes();
    System.out.println("Welcome to Subnautica");
    System.out.println("\nPress ENTER to continue");
    String next = scanner.nextLine();
    displayIntro();
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
          goNorth();
          break;
        case "go south", "south", "s":
          goSouth();
          break;
        case "go east", "east", "e":
          goEast();
          break;
        case "go west", "west", "w":
          goWest();
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
    System.out.println("Thank you for playing Subnautica by Thomas & Theodor");
  }

  public static void main(String[] args) {

    Adventure prg = new Adventure();

    prg.game();


  }
}
