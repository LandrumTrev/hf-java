// exercise: fill in the missing code block to get various numerical outputs

class Test {

  public static void main(String[] args) {

    // start with both values as 0
    int x = 0;
    int y = 0;

    // while x is less than 5, run loop
    while (x < 5) {

      // if no additional code added, outputs: 00 10 20 30 40
      // START MISSING CODE

      // solution1, outputs: 00 11 21 32 42
      // x: 0, 1, 2, 3, 4
      // y: 0 - 0 = 0, 1 - 0 = 1, 2 - 1 = 1, 3 - 1 = 2, 4 - 2 = 2
      // y = x - y;

      // solution2, outputs: 00 11 23 36 410
      // x: 0, 1, 2, 3, 4
      // y: 0 + 0 = 0, 0 + 1 = 1, 1 + 2 = 3, 3 + 3 = 6, 6 + 4 = 10
      // y = y + x;

      // solution3, outputs: 02 14 25 36 47
      // x: 0, 1, 2, 3, 4
      // y: 0 + 2 = 2, 2 + 2 = 4, 4 + 2 - 1 = 5, 5 + 2 - 1 = 6, 6 + 2 - 1 = 7
      // y = y + 2;
      // if (y > 4) {
      // y = y - 1;
      // }

      // solution4, outputs: 11 34 59
      // x: 0 + 1 = 1, 2 + 1 = 3, 4 + 1 = 5
      // y: 0 + 1 = 1, 3 + 1 = 4, 4 + 5 = 9
      // x = x + 1;
      // y = y + x;

      // solution5, outputs: 02 14 36 48
      if (y < 5) {
        x = x + 1; // x: 1, 2, 3, 4
        if (y < 3) {
          x = x - 1; // x: 0, 1, 3, 4
        }
      }
      y = y + 2; // y: 2, 4, 6, 8

      // END MISSING CODE

      // concatenate a number which is xy and print,
      // followed by a space
      System.out.print(x + "" + y + " ");

      // iterate the loop by incrementing x by 1
      x = x + 1;
    }
  }
}