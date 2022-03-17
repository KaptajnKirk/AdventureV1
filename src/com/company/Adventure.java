package com.company;

import java.util.Scanner;

public class Adventure {
  //call map and scanner
  Map map = new Map();
  Scanner scanner = new Scanner(System.in);

  //Change rooms discover boolean to true after the user has entered a room
  public void markAreaDiscovered() {
    map.getPlayerLocation().setDiscovered(true);
  }

  //Go command which takes any of the 4 directions
  public void goDirection(Rooms direction) throws InterruptedException {
    if (direction == null) {
      uxPrint.directionNull();
    } else {
      map.setPlayerLocation(direction);
    }
    if (map.getPlayerLocation().getDiscovered()) { //Do not display room name when direction is null
      uxPrint.displayRoomName(map.getPlayerLocation().getName());
    } else {
      markAreaDiscovered();
      uxPrint.displayRoomDescription(map.getPlayerLocation().getDescription());
      uxPrint.displayRoomName(map.getPlayerLocation().getName());
    }
  }

  //The main game method with while loop that runs until user types exit
  public void game() throws InterruptedException {
    uxPrint ux = new uxPrint();
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
    uxPrint.displayRoomName(map.getPlayerLocation().getName());
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
        case "look" -> uxPrint.displayLookDescription(map.getPlayerLocation().getDescription());
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
}
