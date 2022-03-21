package com.company;

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
    uiPrint ux = new uiPrint();
    music.playMusic();
    uiPrint.displayTitleCard();
    uiPrint.enterPromt();
    String next = scanner.nextLine();
    uiPrint.newPage();
    uiPrint.helpPrompt();
    uiPrint.enterPromt();
    next = scanner.nextLine();
    uiPrint.newPage();
    uiPrint.introPrint();
    uiPrint.enterWakeUpPromt();
    next = scanner.nextLine();
    uiPrint.newPage();
    uiPrint.displayWakeUp();
    uiPrint.displayRoomName(player1.getCurrentPosition().getName());
    uiPrint.displayRoomItems(player1.getCurrentPosition().getItems());
    boolean run = true;
    while (run) {
      uiPrint.nextMovePrompt();
      String choice = scanner.nextLine();
      String choice2;
      String choice1;
      if(choice.contains(" ")){
        choice1 = choice.substring(0, choice.indexOf(" "));
        choice2 = choice.substring((choice.indexOf(" ")+1));
      } else { choice1 = choice;
        choice2 = " ";
      }
      uiPrint.newPage();
      switch (choice1.toLowerCase(Locale.ROOT)) {
        case "exit" -> {
          uiPrint.exitPrompt();
          run = false;
        }
        case "look" -> uiPrint.displayLookDescription(player1.getCurrentPosition().getDescription());
        case "go" -> {
          switch (choice2.toLowerCase(Locale.ROOT)){
            case "north", "n" -> player1.goDirection(player1.getCurrentPosition().getNorth());
            case "south", "s" -> player1.goDirection(player1.getCurrentPosition().getSouth());
            case "east", "e" -> player1.goDirection(player1.getCurrentPosition().getEast());
            case "west", "w" -> player1.goDirection(player1.getCurrentPosition().getWest());
            default -> uiPrint.incompleteDirection();
          }
        }
        case "take" -> player1.addToInventory(choice2.toLowerCase(Locale.ROOT));
        case "inventory", "inv" -> player1.displayInventory();
        case "drop" -> player1.dropItem(choice2);
        case "help" -> uiPrint.displayHelpMenu();
        default -> uiPrint.invalidInput();
      }
    }
    uiPrint.displayEndCard();
  }
}
