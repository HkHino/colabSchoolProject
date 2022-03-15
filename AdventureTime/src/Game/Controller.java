package Game;

import java.io.IOException;

public class Controller {
  Interface userInterface = new Interface();
  RoomController roomController = new RoomController();
  RoomDecider roomDecider = new RoomDecider();
  RandomGenerator randomGenerator = new RandomGenerator();

  boolean isRunning = true;

  public Controller() throws IOException {
  }

  public void run() throws InterruptedException {
    roomController.createMap();
    userInterface.greetPlayer();
    roomDecider.chooseRoom(randomGenerator);
    startingRoom(roomController.currentRoom);
    System.out.println(roomController.currentRoom.getDescription());
    while (isRunning) {
      userInterface.timeToMove();
      travel(roomController.currentRoom);
      System.out.println(roomController.currentRoom.getDescription());
    }
  }

  public void travel(Room currentRoom) {

    userInterface.callUserInput();
    switch (userInterface.in) {
      case "North", "N" -> roomController.currentRoom = userInterface.goNorth(currentRoom);
      case "South", "S" -> roomController.currentRoom = userInterface.goSouth(currentRoom);
      case "West", "W" -> roomController.currentRoom = userInterface.goWest(currentRoom);
      case "East", "E" -> roomController.currentRoom = userInterface.goEast(currentRoom);
    }
  }

  public void startingRoom(Room currentRoom) {
    roomDecider.chooseRoom(randomGenerator);
    switch (roomDecider.dice) {
      case 4 -> roomController.currentRoom = roomDecider.meadows2(currentRoom);
      case 3 -> roomController.currentRoom = roomDecider.meadows(currentRoom);
      case 2 -> roomController.currentRoom = roomDecider.forest2(currentRoom);
      case 1 -> roomController.currentRoom = roomDecider.forest(currentRoom);
    }

  }
}