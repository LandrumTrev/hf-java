// exercise: fix the code so that it will compile

public class Exercise1a {

  public static void main(String[] args) {

    int x = 1;

    while (x < 10) {

      // fixed: while loop did not have an iterator to move it forward
      x = x + 1;

      if (x > 3) {
        System.out.println("big x is " + x);
      }

    }

  }

}