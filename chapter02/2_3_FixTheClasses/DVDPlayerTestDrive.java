// exercise: fix this class so that it will compile and output

// add "public" to class to be able to run this class' main method
public class DVDPlayerTestDrive {

  public static void main(String[] args) {

    // create "d" instance variable as a DVDPlayer TYPE,
    // and set its value to be a new object of the CLASS DVDPlayer()
    DVDPlayer d = new DVDPlayer();
    
    // change the default canRecord value of FALSE to TRUE
    d.canRecord = true;

    // test the (added) playDVD() METHOD of the DVDPlayer CLASS
    d.playDVD();

    // and if canRecord's value was successfully changed to TRUE,
    if (d.canRecord == true) {
      // then test run the recordDVD() method 
      d.recordDVD();
    }
  }
}