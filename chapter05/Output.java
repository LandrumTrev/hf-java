// determine the output of the JVM

// result prints:
// 13 15 x = 6

class Output {

  public static void main(String[] args) {
    Output o = new Output();
    o.go();
  }

  void go() {
    int y = 7;
    // 7 loops (x less than 8)
    for (int x = 1; x < 8; x++) {
      y++; // 8,9,10,11,12,13,14
      if (x > 4) {
        // if x == 5, y is: 12
        // then increment y by 1 (to 13)
        System.out.print(++y + " ");
        // so, print out 13 on first pass,
        // then y gets incremented twice on x == 6, to 15
        // print out 15 on second pass
      }
      if (y > 14) {
        // on second pass (x == 6) y is now greater than 14
        // so then print out that x is 6
        System.out.println(" x = " + x);
        // and then break out of the loop (loops x == 7 and 8 never fire)
        break;
      }
    }
  }
}