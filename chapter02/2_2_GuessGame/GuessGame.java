// this is the game code itself,
// run is started by the GameLauncher class,
// and GuessGame uses the Player class

public class GuessGame {

  // declare three variables using the Player class as a Type
  Player p1;
  Player p2;
  Player p3;

  // and the rest is a single method to call that contains the game
  public void startGame() {

    // assign new Player objects to the declared Player variables
    p1 = new Player();
    p2 = new Player();
    p3 = new Player();

    // declare a variable to hold the guess of each Player object
    // and give them all an initial value of 0
    int guessp1 = 0;
    int guessp2 = 0;
    int guessp3 = 0;

    // declare a Boolean variable for each Player
    // to record whether the Player's guess was correct
    // and give them all an initial value of false
    boolean p1isRight = false;
    boolean p2isRight = false;
    boolean p3isRight = false;

    // generate a number (integer) 0-9 to be the target number to guess
    int targetNumber = (int) (Math.random() * 10);
    // and print out to the CLI that the game has guessed a number
    System.out.println("I'm thinking of a number between 1 and 9...");
    // placement here keeps the number the same for all game rounds
    // until at least one Player guesses the number
    // (so, number does not change every game round; only with a new game)

    // now that all the necessary game elements are created
    // and set to their initial values, the WHILE loop now runs the game
    // CAREFUL: while (true) will run indefinitely (infinite loop);
    // something else other than this conditional must end the game
    while (true) {

      // print out to the CLI the number that the game has guessed
      System.out.println("Number to guess is " + targetNumber);

      // invoke the guess() method of each Player object
      // which will generate a random number AND set that number
      // as the value of the .number property on each Player object
      p1.guess();
      p2.guess();
      p3.guess();

      // change the value of the guessp1 variable from 0
      // to the value now held in p1's .number property
      guessp1 = p1.number;
      // and print out to the CLI that Player p1 has guessed a number
      System.out.println("Player One guessed " + guessp1);
      // rinse and repeat for Players Two and Three
      guessp2 = p2.number;
      System.out.println("Player Two guessed " + guessp2);
      guessp3 = p3.number;
      System.out.println("Player Three guessed " + guessp3);

      // compare each Player's guessed number to the targetNumber,
      // and change their guess boolean value from false to true
      // if they guess correctly
      if (guessp1 == targetNumber) {
        p1isRight = true;
      }
      if (guessp2 == targetNumber) {
        p2isRight = true;
      }
      if (guessp3 == targetNumber) {
        p3isRight = true;
      }

      // ...and then if Player One OR Two OR Three's boolean is now TRUE...
      if (p1isRight || p2isRight || p3isRight) {
        System.out.println("We have a winner!");
        // and write out a very primitive results tally, which displays
        // the boolean value for all Players if at least one is right:
        System.out.println("Player One got it right? " + p1isRight);
        System.out.println("Player Two got it right? " + p2isRight);
        System.out.println("Player Three got it right? " + p3isRight);
        System.out.println("Game is over!");
        // and now "break" ends the while(true) loop if a correct guess was made
        break;
      } else {
        // otherwise, the while(true) loop goes again,
        // starting over and generates new player guesses
        System.out.println("Players will have to try again!");
      } // end if/else
    } // end while(true) loop
  } // end StartGame() method
} // end GuessGame class