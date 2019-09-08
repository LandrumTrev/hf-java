// puzzle: fill in the blanks with snippet from the code pool
// output:
// triangle 0, area 4.0
// triangle 1, area 10.0
// triangle 2, area 18.0
// triangle 3, area 28.0
// y = 4, t5 area = 343.0

class Triangle {

  // decimal number variable for "area"
  double area;

  // whole number integer variables for height and length
  int height;
  int length;

  public static void main(String[] args) {
    // main method

    // counter iterator for the while loop
    int x = 0;

    // "ta" is an array with 4 slots for references to Triangle objects
    Triangle[] ta = new Triangle[4];

    // while x is less than the length of the "ta" array of Triangles,
    while (x < 4) {

      // create a new Triangle at index [x] in the "ta" array,
      ta[x] = new Triangle();

      // set that Triangle's .height using [x] as a calculation variable
      ta[x].height = (x + 1) * 2;
      // and also set it's .length using [x] as a calculation variable
      ta[x].length = x + 4;
      // and then use it's setArea() method to both calculate and set it's .area value
      ta[x].setArea();

      // then for that loop's Triangle, print out it's index number and .area property
      System.out.print("triangle " + x + ", area");
      System.out.println(" = " + ta[x].area);

      // and increment the loop
      x = x + 1;
    }

    // THEN AFTER ALL LOOPS OF while ARE FINISHED...

    // set "y" as the final value of "x" (which will be 4)
    int y = x;

    // then change the value of x to 27, for no apparent reason
    // note that the value of y remains 4 (the value of x when it was set)
    // but y's value does not remain linked to x,
    // because they are independent Primitive values, NOT references (not object
    // reference values)
    x = 27;

    // create a named variable reference "t5" for the array Triangle at index [2],
    // which is: triangle 2, area 18.0
    Triangle t5 = ta[2];

    // and then just for fun, change the area of triangle 2 from 18.0 to 343
    ta[2].area = 343;

    // then print out the value of y
    // (to see that it didn't change to 27 when x changed)
    // primitive value variables (independent of each other,
    // NOT references to same primitive value)
    System.out.print("y = " + y);
    // and print out the .area of t5, to see it is the same as the .area of ta[2]
    // object reference variable (same object pointed to)
    System.out.println(", t5 area = " + t5.area);
  }

  // helper method of Triangle to calculate and set .area property value
  void setArea() {
    area = (height * length) / 2;
  }
}