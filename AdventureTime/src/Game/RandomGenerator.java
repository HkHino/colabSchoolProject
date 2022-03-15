package Game;

import java.util.Random;

  public class RandomGenerator {
    Random rollDice = new Random();
    private int dice;

/*
    public int faceValue() {
      roll();
      return dice;

    }
*/

    public int callRoomDice() {
      rollForRoom();
      return dice;
    }
/*
    public void roll() {
      dice = rollDice.nextInt(20) + 1;
    }
*/
    public void rollForRoom() {
      dice = rollDice.nextInt(4) + 1;
    }

  }

