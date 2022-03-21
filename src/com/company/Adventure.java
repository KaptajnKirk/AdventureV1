package com.company;

import java.util.ArrayList;
import java.util.Locale;
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
      String choice2;
      String choice1;
      if(choice.contains(" ")){
        choice1 = choice.substring(0, choice.indexOf(" "));
        choice2 = choice.substring((choice.indexOf(" ")+1));
      } else { choice1 = choice;
        choice2 = " ";
      }
      uxPrint.newPage();
      switch (choice1) {
        case "exit" -> {
          uxPrint.exitPrompt();
          run = false;
        }
        case "look" -> uxPrint.displayLookDescription(player1.getCurrentPosition().getDescription());
        case "go" -> {
          switch (choice2){
            case "north", "n" -> player1.goDirection(player1.getCurrentPosition().getNorth());
            case "south", "s" -> player1.goDirection(player1.getCurrentPosition().getSouth());
            case "east", "e" -> player1.goDirection(player1.getCurrentPosition().getEast());
            case "west", "w" -> player1.goDirection(player1.getCurrentPosition().getWest());
            default -> uxPrint.incompleteDirection();
          }
        }
        case "take" -> player1.addToInventory(choice2);
        case "inventory", "inv" -> player1.displayInventory();
        case "drop" -> player1.dropItem(choice2);
        case "help" -> uxPrint.displayHelpMenu();
        default -> uxPrint.invalidInput();
      }
    }
    uxPrint.displayEndCard();
  }
}
