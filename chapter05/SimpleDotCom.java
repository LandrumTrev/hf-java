// start with pseudocode (prep code)

class SimpleDotCom {

  // declare array to hold the DotCom's 3 location cells
  int[] locationCells;

  // declare an int to hold the number of hits scored, set to 0
  int numOfHits;

  // declare a method with a parameter that takes the user's guess String,
  // checks it, and returns either HIT, MISS, or KILL

  // method takes in the user guess as the String parameter ("guess")
  String checkYourself(String stringGuess) {

    // PARSE "stringGuess" String value into an integer
    int guess = Integer.parseInt(stringGuess);

    // create a "result" variable to hold the String value the method will return,
    // and set its default value as "miss" (only changes if "hit" or "kill")
    String result = "miss";

    // FOR EACH LOOP element ("cell") in the locationCells array...
    for (int cell : locationCells) {

      // COMPARE "guess" to the current loop's locationCell,
      // and if "guess" value equals the value in this loop's "cell"...
      if (guess == cell) {

        // needs to call a setter method to update value of a "hit" cell
        // in the locationCells array so that cell cannot be hit again (and again)
        // and different IF conditional test in IF below this one

        // then update the value of "result" from "miss" to "hit",
        result = "hit";

        // and INCREMENT the number of hits by 1,
        numOfHits++;

        // and break out of the FOR EACH loop, into the remaining code below
        break;
      } // end IF

    } // end LOOP

    // the length of the locationCells array is 3 (elements),
    // so if 3 is also the value of numOfHits (all 3 cells have been hit),
    if (numOfHits == locationCells.length) {
      // then update "result" value from "hit" to "kill".
      result = "kill";
      // NOTE: BAD CODE, since you could just hit the same cell 3 times for a kill;
      // use setter method in previous IF and different IF test in this IF conditional
    } // end IF

    // print the final resulting value of "result" to the CLI
    System.out.println(result);

    // and return the value of "result" as the value of calling this method
    return result;

  } // end METHOD

  // declare a Setter method to set the locationCells int[] array,
  // which takes in an int[] array which has three consecutive ints
  void setLocationCells(int[] cellLocations) {
    // GET cellLocations as an int[] array parameter

    // ASSIGN (SET) the cellLocations param to the locationCells Instance Variable

  }

} // end METHOD