// exercise: fill in the code blanks with given fragments to output:
// a noise
// annoys
// an oyster

// anyone who writes code like this 
// will be forced to cut down the largest tree in the forest with... a herring.

class PoolPuzzleOne {

  public static void main(String[] args) {

    int x = 0;

    while (x < 4) {

      System.out.print("a");

      if (x < 1) {
        System.out.print(" ");
      }

      System.out.print("n");

      if (x > 1) {
        System.out.print(" oyster");
        x = x + 2;
      }

      if (x == 1) {
        System.out.print("noys");
      }

      if ( x < 1 ) {
        System.out.print("oise");
      }

      System.out.println("");

      x = x + 1;

    }
  }
}