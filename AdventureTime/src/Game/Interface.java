package Game;


import java.util.Scanner;

public class Interface {
  Scanner input = new Scanner(System.in);
  String in;

  public void greetPlayer() throws InterruptedException {
    System.out.println("""
        Welcome to the adventure game!
        Are you ready to play?""");
    callUserInput();
    checkForReady();
  }


  public String getUserInput() {
    return input.nextLine();
  }

  public void callUserInput() {
    in = getUserInput();
  }

  public void checkForReady() throws InterruptedException {
    if (in.contains("y")) {
      System.out.println("Great, let's get started!");
      Thread.sleep(1500);
      System.out.println("""
                    
                    
                    
                    
                    
                    
          """);
    } else {
      System.out.println("I'm sorry to hear that...");
      Thread.sleep(1500);
      greetPlayer();
    }
  }


  public void timeToMove() {
    chooseAction();
    travelOrExplore();
  }

  public void chooseAction() {
    System.out.println("What do you want to do?");
    //System.out.println("Explore");
    System.out.println("Travel");
    //System.out.println("Rest");
    callUserInput();
  }

  public void travelOrExplore() {
    if (in.equals("Travel")) {
      chooseDirection();
    }
  }

  public void chooseDirection() {
    System.out.println("""
        In which direction do you want to travel?
        North
        South
        East
        West
        """);
  }

  Room goNorth(Room currentRoom) {
    if (currentRoom.getNorth() != null) {
      return currentRoom.getNorth();
    } else {
      System.out.println("You cant go that way!");
      return currentRoom;
    }
  }

  Room goSouth(Room currentRoom) {
    if (currentRoom.getSouth() != null) {
      return currentRoom.getSouth();
    } else {
      System.out.println("You cant go that way!");
      return currentRoom;
    }
  }

  Room goEast(Room currentRoom) {
    if (currentRoom.getEast() != null) {
      return currentRoom.getEast();
    } else {
      System.out.println("You cant go that way!");
      return currentRoom;
    }
  }

  Room goWest(Room currentRoom) {
    if (currentRoom.getWest() != null) {
      return currentRoom.getWest();
    } else {
      System.out.println("You cant go that way!");
      return currentRoom;
    }
  }
}

