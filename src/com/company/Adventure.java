package com.company;

import java.util.Scanner;

public class Adventure {
  Map map = new Map();
  Scanner scanner = new Scanner(System.in);

  //Display room name whenever user enters a room
  public void displayRoomName() {
    System.out.println("You are in the " + map.getPlayerLocation().getName());
  }

  //display the room description when the user enters a specif room for the first time
  public void displayRoomDescription() {
    System.out.println("You walk into" + map.getPlayerLocation().getDescription());
  }

  //look command to display the room description to the user
  public void displayLookDescription() {
    System.out.println("You are in" + map.getPlayerLocation().getDescription());
  }

  //Change rooms discover boolean to true after the user has entered a room
  public void markAreaDiscovered() {
    map.getPlayerLocation().setDiscovered(true);
  }

  public void goDirection(Rooms direction){
    if (direction == null) {
      uxPrint.directionNull();
    } else {
      map.setPlayerLocation(direction);
    }
    if (map.getPlayerLocation().getDiscovered()) { //Do not display room name when direction is null
      displayRoomName();
    }else {
      markAreaDiscovered();
      displayRoomDescription();
      displayRoomName();
    }
  }

  //The main game method with while loop that runs until user types exit
  public void game() {
    map.roomRoutes();
    uxPrint.displayTitleCard();
    uxPrint.enterPromt();
    String next = scanner.nextLine();
    uxPrint.newPage();
    uxPrint.helpPrompt();
    uxPrint.enterPromt();
    next = scanner.nextLine();
    uxPrint.newPage();
    uxPrint.introPrint();
    uxPrint.enterWakeUpPromt();
    next = scanner.nextLine();
    uxPrint.newPage();
    uxPrint.displayWakeUp();
    displayRoomName();
    boolean run = true;
    while (run) {
      uxPrint.nextMovePrompt();
      String choice = scanner.nextLine();
      uxPrint.newPage();
      switch (choice) {
        case "exit" -> {
          uxPrint.exitPrompt();
          run = false;
        }
        case "look" -> displayLookDescription();
        case "go north", "north", "n" -> goDirection(map.getPlayerLocation().getNorth());
        case "go south", "south", "s" -> goDirection(map.getPlayerLocation().getSouth());
        case "go east", "east", "e" -> goDirection(map.getPlayerLocation().getEast());
        case "go west", "west", "w" -> goDirection(map.getPlayerLocation().getWest());
        case "go" -> uxPrint.incompleteDirection();
        case "help" -> uxPrint.displayHelpMenu();
        default -> uxPrint.invalidInput();
      }
    }
      uxPrint.displayEndCard();
    }

  public static void main(String[] args) {

    Adventure prg = new Adventure();
    prg.game();
  }
}
