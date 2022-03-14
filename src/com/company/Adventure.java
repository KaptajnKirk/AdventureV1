package com.company;

import java.util.Scanner;

public class Adventure {

    Scanner scanner = new Scanner(System.in);

    Rooms room1 = new Rooms("Room 1", "This is the first room");
    Rooms room2 = new Rooms("Room 2", "This is the second room");
    Rooms room3 = new Rooms("Room 3", "This is the third room");
    Rooms room4 = new Rooms("Room 4", "This is the fourth room");
    Rooms room5 = new Rooms("Room 5", "This is the fifth room");
    Rooms room6 = new Rooms("Room 6", "This is the sixth room");
    Rooms room7 = new Rooms("Room 7", "This is the seventh room");
    Rooms room8 = new Rooms("Room 8", "This is the eight room");
    Rooms room9 = new Rooms("Room 9", "This is the ninth room");

    Rooms currentLocation = room1;

    public void roomRoutes () {
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


    public void currentRooms () {
        System.out.println(currentLocation.getDescription());
        System.out.println(currentLocation.getName());
    }


    public void helpMenu(){
        System.out.println("exit\t- Exit the game");
        System.out.println("look\t- Get the description of current room");
        System.out.println("go\t\t- Go in the direction you wish by typing 'go' followed by the direction. (ex. go north)");
        System.out.println("help\t- Get this help menu");
    }

    public void game(){
        System.out.println("Welcome to Subnautica");
        System.out.println("\n Press ENTER to continue");
        roomRoutes();
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
                    currentRooms();
                    break;
                case "go north":
                    System.out.println("going north");
                    if (currentLocation.getNorth() == null)
                        System.out.println("You cannot go this way");
                    else
                        currentLocation = currentLocation.getNorth();
                    currentRooms();
                    break;
                case "go south":
                    System.out.println("going South");
                    if (currentLocation.getSouth() == null){
                        System.out.println("You cannot go this way");
                    }
                    else
                        currentLocation = currentLocation.getSouth();
                    currentRooms();
                    break;
                case "go east":
                    System.out.println("going east");
                    if (currentLocation.getEast() == null) {
                        System.out.println("You cannot go this way");
                    }
                    else
                        currentLocation = currentLocation.getEast();
                    currentRooms();
                    break;
                case "go west":
                    System.out.println("going west");
                    if (currentLocation.getWest() == null){
                        System.out.println("You cannot go this way");
                    }
                    else
                        currentLocation = currentLocation.getWest();
                    currentRooms();
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

        prg.game();


    }
}
