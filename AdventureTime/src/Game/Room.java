package Game;

public class Room {

    private final int number;
    private final String description;
    private Room north;
    private Room south;
    private Room east;
    private Room west;

    //constructor
    public Room(int number, String description) {
      this.number = number;
      this.description = description;
    }

    public void setNorth(Room north) {
      this.north = north;
    }
    public void setSouth(Room south) {
      this.south = south;
    }

    public void setEast(Room east) {
      this.east = east;
    }

    public void setWest(Room west) {
      this.west = west;
    }

    Room getNorth() {
      return north;
    }

    Room getSouth() {
      return south;
    }

    Room getEast() {
      return east;
    }

    Room getWest() {
      return west;
    }


    String getDescription() {
      return description;
    }

    int getNumber() {
      return number;
    }

  }

