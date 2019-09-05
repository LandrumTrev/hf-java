// chapter2.1 : making and testing Objects
// 2.1b : Object test class

// create a Class to TEST the Movie Objects
public class MovieTestDrive {

  // NOTE: the TestDrive Class DOES have a "main" method, in order to:
  // 1. test the object creation class, and
  // 2. run the Java application
  public static void main(String[] args) {

    // make a new Movie called "one" with the Movie object factory class
    Movie one = new Movie();
    // populate the new Movie "one" with unique properties
    one.title = "Gone with the Stock";
    one.genre = "Tragic";
    one.rating = -2;

    // make another Movie and give it a name and property values
    Movie two = new Movie();
    two.title = "Lost in Cubicle Space";
    two.genre = "Comedy";
    two.rating = 5;
    // AND PLAY Movie "two" to test it's playIt() method
    two.playIt();

    // and then make a third Movie
    Movie three = new Movie();
    three.title = "Byte Club";
    three.genre = "Tragic but ultimately uplifting";
    three.rating = 127;

  }

}

// Java (OO, Object Oriented) applications 
// are just objects talking to other objects,
// by calling methods (functions) on one another