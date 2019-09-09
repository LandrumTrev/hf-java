// testing the default values of uninitialized instance variables

public class PoorDogTestDrive {

  public static void main(String[] args) {

    PoorDog one = new PoorDog();

    // what values will these return, since no values have been set?
    System.out.println("Dog size is " + one.getSize()); // 0
    System.out.println("Dog name is " + one.getName()); // null

  }
}