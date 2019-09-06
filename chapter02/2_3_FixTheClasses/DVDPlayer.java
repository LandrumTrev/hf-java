// exercise: fix this class so that it will compile and output

// add "public" to make class available to test class (and any other class)
public class DVDPlayer {

  boolean canRecord = false;

  void recordDVD() {
    System.out.println("DVD recording");
  }

  // add the "playDVD" method called in the test class
  void playDVD() {
    System.out.println("DVD playing");
  }

}