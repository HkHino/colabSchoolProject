package Game;

import java.io.IOException;

public class RoomController {

  EnvironmentGenerator environmentGenerator = new EnvironmentGenerator();

  Room forest = new Room(1, environmentGenerator.forest());
  Room deepForest = new Room(2, environmentGenerator.deepForest());
  Room forest2 = new Room(3, environmentGenerator.forest());
  Room lake = new Room(4, environmentGenerator.lake());
  Room village = new Room(6, environmentGenerator.abandonedVillage());
  Room cave = new Room(5, environmentGenerator.cave());
  Room meadows = new Room(7, environmentGenerator.meadow());
  Room mountains = new Room(8, environmentGenerator.mountains());
  Room meadows2 = new Room(9, environmentGenerator.meadow());
  Room preSpawn = new Room(10, environmentGenerator.theVoid());

  Room currentRoom = preSpawn;

  public RoomController() throws IOException {
  }

  public void createMap() {
    //Room1
    forest.setEast(deepForest);
    forest.setSouth(lake);
    //Room2
    deepForest.setEast(forest2);
    deepForest.setWest(forest);
    //Room3
    forest2.setSouth(village);
    forest2.setWest(deepForest);
    //Room4
    lake.setNorth(forest);
    lake.setSouth(meadows);
    //Room5
    village.setSouth(mountains);
    //Room6
    cave.setNorth(forest2);
    //cave.setEast(null);
    cave.setSouth(meadows2);
    //Room7
    meadows.setNorth(lake);
    meadows.setEast(mountains);
    //Room8
    mountains.setNorth(cave);
    mountains.setEast(meadows2);
    mountains.setWest(meadows);
    //Room9
    meadows2.setNorth(village);
    meadows2.setWest(mountains);
    //Room10
    preSpawn.setNorth(forest);
    preSpawn.setSouth(forest2);
    preSpawn.setEast(meadows);
    preSpawn.setWest(meadows2);
  }


}
