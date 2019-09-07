// fix the code so that it will compile and run correctly

class Hobbits {

  // instance variable: all nasty Hobbitses cans haves his nameses
  String name;

  public static void main(String[] args) {

    // variable "h" can (and does) contain an array of 3 Hobbits
    Hobbits[] h = new Hobbits[3];

    // iterator for while loop starts at 0
    // which is also the first index number of the array
    int z = 0;

    // FIX: change z < 4 to z < 3 (to equal .length of Hobbits[] array)
    // OR just make it:
    // while (z < Hobbits.length) {...}
    while (z < 3) {

      // on every loop iteration, create a Hobbit at index [z]
      h[z] = new Hobbits();

      // and .name every new Hobbit "bilbo"...
      h[z].name = "bilbo";

      // but then if [z] is 1, re .name the new Hobbit "frodo"...
      if (z == 1) {
        h[z].name = "frodo";
      }

      // or if [z] is 2, re .name the new Hobbit "sam"
      if (z == 2) {
        h[z].name = "sam";
      }

      // then at the end of each loop, print out message
      // containing the name of the Hobbit created with the current loop
      System.out.print(h[z].name + " is a ");
      System.out.println("good Hobbit name.");

      // increment the iterator to the next loop
      // FIX: move this to the end of the while loop code
      // instead of having it at the beginning
      z = z + 1;

    }

  }

}