// controlling a pack of Dogs with an array

class Dog {

  // every Dog needs a .name
  String name;

  public static void main(String[] args) {

    // make a Dog object
    Dog dog1 = new Dog();
    // and give dog1 a name
    dog1.name = "Bart";
    // make it bark (separate method, below main)
    dog1.bark();

    // make a Dog array that can hold 3 Dogs
    Dog[] myDogs = new Dog[3];
    // put some dogs in it
    myDogs[0] = new Dog();
    myDogs[1] = new Dog();
    // including dog1, already created above
    myDogs[2] = dog1;

    // give the two new dogs names
    myDogs[0].name = "Fred";
    myDogs[1].name = "Marge";

    // wait, what's myDogs[2].name?
    System.out.print("last dog's name is ");
    System.out.println(myDogs[2].name);

    // now make all the Dogs bark!
    int x = 0; // set an iterator, start with array position [0]
    // base while loop number of iterations on length of myDogs array
    while (x < myDogs.length) {
      // access dog at myDogs[index] based on current value of x
      myDogs[x].bark();
      myDogs[x].eat();
      myDogs[x].chaseCat();
      // increment iterator to next loop and next dog
      x = x + 1;
    }

  } // end main

  // method so that all Dogs can bark
  public void bark() {
    System.out.println(name + " says Ruff!");
  }

  // method so that all Dogs can chow down
  public void eat() {
    System.out.println(name + " chows down on some kibble.");
  }

  // method so that all Dogs can chase Cats
  public void chaseCat() {
    System.out.println(name + " chases kitty! Chases kitty!");
  }

} // end class