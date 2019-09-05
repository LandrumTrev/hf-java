// chapter2.1 : making and testing Objects
// 2.1a : Object creator class

// create a Class which will create Movie Objects
class Movie {

  // NOTE: NO "main" method in the Movie Object template Class

  // undefined variables for properties that every Movie will have
  String title;
  String genre;
  int rating;

  // a method that every Movie object will have
  void playIt() {
    System.out.println("Playing movie " + title + "...playing...playing...");
  }

}
