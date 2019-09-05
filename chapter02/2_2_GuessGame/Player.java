// used by the GuessGame class to create Player objects

public class Player {

  // property (instance variable) to hold a Players guess,
  // intitally set at 0
  int number = 0;

  // method to run which makes Player object guess a number
  public void guess() {
    // generate a random number 0-9, and round it to an integer
    // this redefines the .number property from it's 0 value
    // to a new randomly generated number (integer) from 0-9
    number = (int) (Math.random() * 10);
    // print out the random number guess to the CLI
    // for testing only; redundant with functionality in GuessGame itself
    // System.out.println("I'm guessing " + number);
  }
}