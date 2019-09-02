// exercise: fix the code so it compiles correctly

public class Exercise1c {

  // fixed: class did not have a main method wrapping its code
  public static void main(String[] args) {

    int x = 5;

    while (x > 1) {

      x = x - 1;

      if (x < 3) {
        System.out.println("small x is " + x);
      }

    }

  }
  
}