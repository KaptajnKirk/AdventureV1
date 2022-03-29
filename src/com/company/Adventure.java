package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Adventure {
  //call map and scanner
  Map map = new Map();
  Player player1 = new Player(map.getRoom1());
  Scanner scanner = new Scanner(System.in);
  private final Music music = new Music();
  private String choice2;
  private String choice1;

  public void choiceSplitter() {
    String choice = scanner.nextLine();
    if (choice.contains(" ")) {
      choice1 = choice.substring(0, choice.indexOf(" ")).toLowerCase(Locale.ROOT);
      choice2 = choice.substring((choice.indexOf(" ") + 1)).toLowerCase(Locale.ROOT);
    } else {
      choice1 = choice.toLowerCase(Locale.ROOT);
      choice2 = " ";
    }
  }

  public void gameIntro() throws InterruptedException {
    //music.playMusic();
    uiPrint.displayTitleCard();
    uiPrint.enterPromt();
    String next = scanner.nextLine();
    uiPrint.newPage();
    uiPrint.displayHelpMenu();
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
  }

  public void displayNextMove() throws InterruptedException {
    uiPrint.displayPlayerUI(player1.getHealth(), player1.getEquippedWeapon());
    uiPrint.nextMovePrompt();
    choiceSplitter();
    uiPrint.newPage();
  }

  //The main game method with while loop that runs until user types exit
  public void game() throws InterruptedException {
    gameIntro();
    boolean run = true;
    while (run) {
      displayNextMove();
      switch (choice1) {
        case "take" -> player1.addToInventory(choice2);
        case "inventory", "inv" -> player1.displayInventory();
        case "drop" -> player1.dropItem(choice2);
        case "help" -> uiPrint.displayHelpMenu();
        case "look" -> player1.lookRoom();
        case "health" -> uiPrint.displayHealth(player1.getHealth());
        case "eat" -> player1.eatItem(choice2);
        case "search" -> player1.searchContainer();
        case "equip" -> player1.equipWeapon(choice2);
        case "attack" -> player1.attack();
        case "go" -> {
          switch (choice2) {
            case "north", "n" -> player1.goDirection(player1.getCurrentPosition().getNorth());
            case "south", "s" -> player1.goDirection(player1.getCurrentPosition().getSouth());
            case "east", "e" -> player1.goDirection(player1.getCurrentPosition().getEast());
            case "west", "w" -> player1.goDirection(player1.getCurrentPosition().getWest());
            default -> uiPrint.incompleteDirection();
          }
        }
        case "exit" -> {
          uiPrint.exitPrompt();
          run = false;
        }
        default -> uiPrint.invalidInput();
      }
      if (player1.getHealth() <= 0) {
        uiPrint.displayGameOver();
        run = false;
      }
    }
    uiPrint.displayEndCard();
  }
}
