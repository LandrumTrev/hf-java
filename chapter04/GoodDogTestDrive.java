// introducing encapsulation: making instance variables private,
// and using Getters and Setters to access them

class GoodDogTestDrive {

  public static void main(String[] args) {

    GoodDog one = new GoodDog();
    // requires the one.setSize(70) method, instead of
    // one.size = 70;
    one.setSize(70);

    GoodDog two = new GoodDog();
    two.setSize(8);

    // requires one.getSize() to read the value of size, instead of
    // one.size
    System.out.println("Dog one: " + one.getSize());
    System.out.println("Dog two: " + two.getSize());

    // but the public .bark() methods can still be accessed directly
    one.bark();
    two.bark();

  }
}