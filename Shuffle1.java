// EXERCISE: rearrange and fix the code into a working program to output:
// a-b c-d

public class Shuffle1 {

  public static void main(String[] args) {

    // declare variables first
    int x = 3;

    // start the while loop to run the action
    while (x > 0) {

      // x is currently greater than 2, so first print "a"
      if (x > 2) {
        System.out.print("a");
      }

      // then reduce x by 1 to now equal 2
      x = x - 1;

      // now print a "-"
      System.out.print("-");

      // since x is now 2, print "b c"
      if (x == 2) {
        System.out.print("b c");
      }

      // then reduce x by 1 again to now equal 1
      x = x - 1;

      // now print another "-"
      System.out.print("-");

      // check to make sure x is now 1, and if so, print "d" with a newline "\n"
      if (x == 1) {
        System.out.print("d\n");
        // and then reduce x by 1 to 0, stopping the while loop
        x = x - 1;
      }

    } // end while loop
  } // end main method
} // end Shuffle1 class