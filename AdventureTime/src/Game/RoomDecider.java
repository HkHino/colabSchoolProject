package Game;

public class RoomDecider {
  int dice;

  public void chooseRoom(RandomGenerator randomGenerator) {
    dice = returnDice(randomGenerator);
  }

  public int returnDice(RandomGenerator randomGenerator) {
    return randomGenerator.callRoomDice();
  }

  Room forest(Room currentRoom) {
    if (currentRoom.getNorth() != null) {
      return currentRoom.getNorth();
    } else {
      return currentRoom;
    }
  }

  Room forest2(Room currentRoom) {
    return currentRoom.getSouth();
  }

  Room meadows(Room currentRoom) {
    return currentRoom.getEast();
  }

  Room meadows2(Room currentRoom) {
    return currentRoom.getWest();
  }
}

