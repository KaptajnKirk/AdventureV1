package com.company;

public class Map {



  //Create all rooms needed
  private Rooms room1 = new Rooms("Captains quarters", " a room partly on fire. Small pieces of debris is falling from holes in the ceiling.\nAround you are scattered furniture, displaced in the crash. A work table, some vials on the floor,\nand a Alterra poster on the wall with a picture of the newest model of Alterra excavation machine.\nYou are slightly confused, and the last thing you remember is dropping to the planet surface in the Alterra Space cruiser.");
  private Rooms room2 = new Rooms("Mess Hall", " the massive mess hall, made to feed the 240 workers aboard the Alterra Starliner Aurora.\nOnly a few of the bright fluorecent lights, light up the grey and white walls of the mess hall,\nand reflect in the water that is slowly filling the room. Once filled with perfectly formed lines of long-tables and benches,\nthe room is now a chaos of floating furniture and patches of fire.");
  private Rooms room3 = new Rooms("Armory", " a medium sized room, with water reaching to your knees. The room is tightly packed with shelves that are now partly empty,\nas the crates that once occupied them are now all around you. Contrary to its name, you dont see any actual weapons,\nbut mostly tools used for excavation and research. The room is slightly dark, as your only light-source is a standing lamp,\nnow tipped over and lying submerged in water, scattering the light.");
  private Rooms room4 = new Rooms("Garage ", " the giant garage, with cars, excavation-machines and boats are hanging from the ceiling.\nSome of the bigger vehicles have fallen to the ground, but somehow the garage is weirdly intact.\nA small electric fire obscures one of the exits. There is a giant gate at the end of the room, for getting the vehicles out,\nonce on planet-side. You know it leads to the Auroras stern ramp.\nThe gates is slowly leaking water through the crack where to two doors meet. You see a toolbox on the floor");
  private Rooms room5 = new Rooms("Reactor Room", " the massive reactor room, onto the bridge. The bridge is suspended in the middle of the massive room,\noverlooking the abyss that is now the almost filled reactor room. The water almost reaches the bridge.\nFour pillars stretches from the ceiling way above you, and disappear into the depths below.\nWhen you look closely, you can see the shadow of something big, slithering around in the water below you,\nbut you cant quite make out what it is.");
  private Rooms room6 = new Rooms("Engine Room", ", what you instantly recognize as the engine room, since this is where you used to work.\nIts a low hanging ceiling, and you have to duck some places to get around,\nbecause of the interwoven tubes that go from the engines to the sub-engines. The room is mostly intact,\nwith the exception of small fires here and there, and one of the sub-engines leaking coolant.");
  private Rooms room7 = new Rooms("Sleeping Quarters", " the sleeping quarters. This is just one room of the many that makes up the crew quarters.\nSmall fires are scattered across the room, and a medium sizes hole has been made in the southern wall,\nmaking the neighbour room visible. As Alterra doesnt allow many personal items to bring along on excavation voyages,\nthe only things floating around in the ankle high water are small tools, hygiene items, papers, etc.");
  private Rooms room8 = new Rooms("Science Lab", " a small room, with a single, one-person submarine suspended from the ceiling in the middle of the room.\nYou have never visited the lab prior, since it has always been off limits. Glass shards from vials fills the floor,\nand microscopes and other research tools, are scattered amongst the flipped worktables and whiteboards.\nYou can see equations etched onto the wall-embedded worktables.\nThe ceiling lights are weirdly still fully functioning, covering the lab in a bright defused, white light.");
  private Rooms room9 = new Rooms("Submarine Bay", " a massive hall, with Alterra's signature expedition submarine, 'The Cyclops' taking up most of the hall.\nThe submarine has fallen out of its ceiling mount, and now partly blocks the entrance pool below it.\nOn the bottom of the entrance pool, there is a gate that opens up, as an exit for submarines.\nAround the room, there are one-man submarines socketed into the walls, where they used to charge.\nSome of them fell out during the crash, and now partly occupy the bay floor.\nYou should be able to take a one-man submarine through the gate, provided you can get it open.");
  private Container toolbox = new Container("toolbox");
  private Food nutritionBlock = new Food("nutrition block", 20);
  private Food rottenApple = new Food("rotten apple",-50);
  private RangedWeapon laserGun = new RangedWeapon("lasergun", 50, 5);
  private MeleeWeapon sword = new MeleeWeapon("sword", 20);
  private Food poison = new Food("poison", -100);
  private Item mag = new Item("mag");
  private Container infected1Corpse = new Container("corpse");
  private Enemy infected1 = new Enemy("infected crewmember", "former crewmember, who died in the crash. His lifeless corpse is now controlled by what seems to be a native fungi species to planet 4546B", 200, sword, infected1Corpse);


  private Rooms currentRoom;


  public Map() {
    //Linking rooms
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

    room4.addChest(toolbox);

    //adding items to rooms and containers in rooms
    room1.addItems(nutritionBlock);
    room1.addItems(mag);
    room1.addItems(laserGun);
    room3.addItems(rottenApple);
    room5.addItems(rottenApple);
    toolbox.addItems(rottenApple);
    toolbox.addItems(laserGun);
    room9.addItems(sword);
    room1.addItems(poison);
    infected1Corpse.addItems(sword);

    room1.addEnemy(infected1);
    room2.addEnemy(infected1);
     }

  //Get Starting room
  public Rooms getRoom1() {
    return room1;
  }

  public void setCurrentRoom(Rooms currentRoom){
    this.currentRoom = currentRoom;
  }

}
