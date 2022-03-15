package Game;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class EnvironmentGenerator {
  Path forest = Path.of("Rooms\\forest.txt");
  Path deepForest = Path.of("Rooms\\deepForest.txt");
  Path cave = Path.of("Rooms\\cave.txt");
  Path lake = Path.of("Rooms\\lake.txt");
  Path meadows = Path.of("Rooms\\meadows.txt");
  Path mountains = Path.of("Rooms\\mountains.txt");
  Path village = Path.of("Rooms\\village.txt");
  Path theVoid = Path.of("Rooms\\theVoid.txt");

  public String theVoid() throws IOException {
    //the void
    return Files.readString(theVoid);
  }

  public String forest() throws IOException {
    //boar
    return Files.readString(forest);
  }

  public String deepForest() throws IOException {
    //big ass spider
    return Files.readString(deepForest);
  }

  public String cave() throws IOException {
    //white dragon
    return Files.readString(cave);
  }

  public String meadow() throws IOException {
    return Files.readString(meadows);
  }

  public String mountains() throws IOException {
    //yeti
    return Files.readString(mountains);
  }

  public String abandonedVillage() throws IOException {
    return Files.readString(village);
  }

  public String lake() throws IOException {
    //Nessie
    return Files.readString(lake);
  }

}
