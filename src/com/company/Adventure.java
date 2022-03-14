package com.company;

import java.util.Scanner;

public class Adventure {

    Scanner scanner = new Scanner(System.in);

    public void helpMenu(){
        System.out.println("exit\t- Exit the game");
        System.out.println("look\t- Get the description of current room");
        System.out.println("go\t\t- Go in the direction you wish by typing (ex. go north)");
        System.out.println("help\t- Get this help menu");
    }

    public void game(){
        System.out.println("Welcome to Subnautica");
        System.out.println("\n Press ENTER to continue");
        String next = scanner.nextLine();
        boolean run = true;
        while (run){
            System.out.println("What is your next move?");
            String choice = scanner.nextLine();

            switch (choice){
                case "exit":
                    System.out.println("You are now exiting the game!");
                    run = false;
                    break;
                case "look":
                    System.out.println("Looking around");
                    break;
                case "go north":
                    System.out.println("going north");
                    break;
                case "go south":
                    System.out.println("going South");
                    break;
                case "go east":
                    System.out.println("going east");
                    break;
                case "go west":
                    System.out.println("going west");
                    break;
                case "go":
                    System.out.println("Where do you want to go?");
                    System.out.println("Please type something like 'go east' or 'go north'");
                    break;
                case "help":
                    helpMenu();
                    break;
                default:
                    System.out.println("Invalid input");

            }

        }System.out.println("Thank you for playing Subnautica by Thomas & Theodor");
    }

    public static void main(String[] args) {

        Adventure prg = new Adventure();
        Rooms room1 = new Rooms("Room 1", "This is the first room");
        Rooms room2 = new Rooms("Room 2", "This is the second room");
        Rooms room3 = new Rooms("Room 3", "This is the third room");
        Rooms room4 = new Rooms("Room 4", "This is the fourth room");
        Rooms room5 = new Rooms("Room 5", "This is the fifth room");
        Rooms room6 = new Rooms("Room 6", "This is the sixth room");
        Rooms room7 = new Rooms("Room 7", "This is the seventh room");
        Rooms room8 = new Rooms("Room 8", "This is the eight room");
        Rooms room9 = new Rooms("Room 9", "This is the ninth room");

        prg.game();


    }
}
