// TESTING MODULE for SimpleDotCom class

// pseudocode:
// instantiate a SimpleDotCom object
// assign it a location (array of 3 consecutive ints, like {2,3,4})
// create a String to represent a user guess ("2","0","X","marbles", etc)
// invoke checkYourself() method, passing it the test userGuess value
// print out the result to see if it is valid (pass/fail)

// write this test BEFORE writing the code that it will test,
// so that you know what inputs your code should take in,
// and what results your code should return based on those inputs.

public class SimpleDotComTestDrive {

  public static void main(String[] args) {

    // instantiate a SimpleDotCom object
    SimpleDotCom dot = new SimpleDotCom();

    // hard-code an int[] array of 3 consecutive numbers from 0-6
    int[] locations = { 2, 3, 4 };

    // invoke setter method to set the var holding current location cells
    dot.setLocationCells(locations);

    // hard-code a fake test userGuess,
    // which is a number that is in the locations array (should return a "hit")
    String userGuess = "2";

    // variable to hold the result of passing userGuess to checkYourself() method
    String result = dot.checkYourself(userGuess);

    // set the default state of the test as "failed"
    String testResult = "failed";

    // but if the value of "result" returns as "hit"
    // note: uses .equals() method instead of == comparison
    if (result.equals("hit")) {
      // then change value of testResult to "passed"
      testResult = "passed";
    }

    // then print the test results to the CLI
    System.out.println(testResult);

  }
}