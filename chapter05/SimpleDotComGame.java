// write (first with pseudocode) the actual game code
// which will use SimpleDotCom objects

public class SimpleDotComGame {

  public static void main(String[] args) {

    // HINT: declare an int InstVar to hold total number of user guesses
    // in order to give the player a final rating
    int numOfGuesses = 0;

    // REQUIRED: instantiate a SimpleDotCom object
    SimpleDotCom dot = new SimpleDotCom();

    // REQUIRED: give the DotCom a location of 3 consecutive cells on a row of 7

    // HINT: compute a random number 0-4 to be the starting cell
    int cellOne = (int) (Math.random() * 4);

    // and then define the next two following cells
    int cellTwo = cellOne++;
    int cellThree = cellTwo++;

    // create an array to hold the cell values generated
    int[] locations = { cellOne, cellTwo, cellThree };

    // and use the setter method to set the var holding current location cells
    dot.setLocationCells(locations);

    // declare a Boolean var representing the state of the game
    Boolean isAlive = true;

    // start a while loop that runs as long as isAlive's value is TRUE
    while (isAlive == true) {

      // instantiate a variable that will hold the value of the user input
      String userGuess;

      // TEST VALUE: HAVE THE COMPUTER PLAY ITSELF
      int rando = (int) (Math.random() * 7);
      // then convert that random number into a String
      userGuess = Integer.toString(rando);

      // REQUIRED: ask the user for a guess (CLI message that takes input)
      System.out.println("Enter a number (0-6) : " + userGuess);
      // how does Java accept input on the same line as the output?
      // set the value of userGuess to the user's guess input number

      // and then run the object's checkYourself method to determine miss/hit/kill
      // setting the returned value in a variable
      String guessResult = dot.checkYourself(userGuess);

      // increment the value of numOfGuesses by one
      numOfGuesses++;

      // if checkYourself() returns a final "kill" value,
      if (guessResult == "kill") {
        // then change isAlive from TRUE to FALSE
        isAlive = false;
        // and when the while loop terminates (when guessResult == "kill")
        System.out.println("You took " + numOfGuesses + " guesses to kill that DotCom.");
      } // end IF

    } // end WHILE

  } // end MAIN

} // end CLASS