// start with pseudocode (prep code)

class SimpleDotCom {

  // declare array to hold the DotCom's 3 location cells
  int[] locationCells;

  // declare an int to hold the number of hits scored, set to 0
  int numOfHits;

  // declare a method with a parameter that takes the user's guess String,
  // checks it, and returns either HIT, MISS, or KILL
  String checkYourself(String userGuess) {
    // GET the user guess as the String parameter ("guess")

    // CONVERT the "userGuess" from String to int

    // REPEAT (LOOP) THE FOLLOWING for each of the locationCells in the int[] array:

      // COMPARE "userGuess" to the locationCell

      // IF the "userGuess" matches any remaining locationCell,

        // INCREMENT the number of hits,

        // and FIND OUT if it is the last locationCell remaining

        // IF the numOfHits is 3, RETURN "kill"

        // ELSE (if not a "kill"), RETURN "hit"

      // ELSE (if "userGuess" does not match any remaining locationCell), RETURN "miss"
      
      // end IF

    // end LOOP

  } // end METHOD

  
  // declare a Setter method to set the locationCells int[] array,
  // which takes in an int[] array which has three consecutive ints
  void setLocationCells(int[] cellLocations) {
    // GET cellLocations as an int[] array parameter

    // ASSIGN (SET) the cellLocations param to the locationCells Instance Variable

  }

} // end METHOD