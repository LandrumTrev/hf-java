// SAMPLE CLASS CONSTRUCTION OF A SOURCE CODE .java FILE
// COMPILE: $ javac MyFirstApp.java
// RUN: $ java MyFirstApp

// public means everyone can access it
public class MyFirstApp {

  // a Java program needs at least one class with a "main" method
  // in order start the program and access all other classes

  // "void" means method does not return a value
  // "main" is this method's name...the class's "main" method
  // method expects an array of Strings and will call it "args"
  public static void main(String[] args) {

    // print this out to the CLI
    System.out.println("I Rule!");
    System.out.println("The World.");

    // declarations, assignments, method calls, etc
    int x = 3;
    String name = "Dirk";
    x = x * 17;
    System.out.print("x is " + x + "\n");
    // double d = Math.random();

    // while loop
    while (x > 12) {
      x = x - 1;
    }

    // for loop
    for (int y = 0; y < 10; y = y + 1) {
      System.out.print("y is now " + y + "\n");
    }

    // if/else conditional tests
    if (x == 10) {
      System.out.print("x must be 10\n");
    } else {
      System.out.print("x isn't 10\n");
    }

    if ((x < 3) & (name.equals("Dirk"))) {
      System.out.print(name + "Gently\n");
    }

    System.out.print("this line runs no matter what\n");

  }

}