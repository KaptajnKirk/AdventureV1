package com.company;

import java.util.Scanner;

public class Adventure {
  //call map and scanner
  Map map = new Map();
  Player player1 = new Player(map.getRoom1());
  Scanner scanner = new Scanner(System.in);
  private Music music;

  //The main game method with while loop that runs until user types exit
  public void game() throws InterruptedException {
    music = new Music();
    uxPrint ux = new uxPrint();
    music.playMusic();
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
    uxPrint.displayRoomName(player1.getCurrentPosition().getName());
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
        case "look" -> uxPrint.displayLookDescription(player1.getCurrentPosition().getDescription());
        case "go north", "north", "n" -> player1.goDirection(player1.getCurrentPosition().getNorth());
        case "go south", "south", "s" -> player1.goDirection(player1.getCurrentPosition().getSouth());
        case "go east", "east", "e" -> player1.goDirection(player1.getCurrentPosition().getEast());
        case "go west", "west", "w" -> player1.goDirection(player1.getCurrentPosition().getWest());
        case "go" -> uxPrint.incompleteDirection();
        case "help" -> uxPrint.displayHelpMenu();
        default -> uxPrint.invalidInput();
      }
    }
    uxPrint.displayEndCard();
  }
}
