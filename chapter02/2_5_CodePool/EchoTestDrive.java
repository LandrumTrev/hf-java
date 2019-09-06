// exercise: select code snippets from a pool and MadLib them into the blanks
// where the program outputs:

// helloooo...
// helloooo...
// helloooo...
// helloooo...
// 10

public class EchoTestDrive {

  public static void main(String[] args) {

    Echo e1 = new Echo();
    Echo e2 = new Echo();
    // or Echo e2 = e1; // the bonus answer

    int x = 0;

    // loops x == 0,1,2,3
    while (x < 4) {

      // println a "helloooo..."
      e1.hello();

      // increment e1's internal counter by 1
      e1.count = e1.count + 1;
      // e1.count 1,2,3,4

      // only on the 4th while loop iteration (0,1,2,3)
      if (x == 3) {
        // System.out.println(e2.count); // from 3rd loop, value is 5
        e2.count = e2.count + 1;
        // System.out.println(e2.count); // on 4th final loop, increment to 6
      }

      // on the first loop, does nothing (since x == 0),
      // but on 2nd, 3rd, and 4th loops...
      if (x > 0) {
        // make e2's internal counter value itself + e1's counter value
        e2.count = e2.count + e1.count;
        // e1.count 1,2,3,4
        // e2.count 0,2,6,10 -- incremented from 5 to 6 above, before adding 6 to 4
      }

      x = x + 1;
      // when x == 4, loop breaks, and System.out.println below fires
    }

    // value is 10 when loop breaks at x == 4
    System.out.println(e2.count);

  }

}