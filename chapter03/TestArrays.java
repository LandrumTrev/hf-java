// exercise: rearrange code snippets to make a functioning program
// output:
// island = Fiji
// island = Cozumel
// island = Bermuda
// island = Azores

class TestArrays {

  public static void main(String[] args) {

    // variable "islands" holds an array of 4 String elements
    String[] islands = new String[4];

    // populate the 4 empty indexes in the "islands" array
    islands[0] = "Bermuda";
    islands[1] = "Fiji";
    islands[2] = "Azores";
    islands[3] = "Cozumel";

    // variable "index" holds an array of 4 integers
    int[] index = new int[4];

    // populate the "index" array
    index[0] = 1;
    index[1] = 3;
    index[2] = 0;
    index[3] = 2;

    // set an iterator counter for the while loop
    int y = 0;

    // declare "ref" variable to assign it an ordering number from "index" array
    int ref;

    // OR: while (y < islands.length)
    // OR: while (y < index.length)
    while (y < 4) {

      // set value of "ref" to integer at index[y]: 1,3,0,2
      ref = index[y];

      // use .print to start first part of line, then .println to finish line with a newline
      System.out.print("island = ");
      // and use the number in "ref" to get an indexed element in "islands" array
      System.out.println(islands[ref]);

      // increment the while loop counter
      y = y + 1;
    }

  }
}