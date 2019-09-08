// determine which reference variables refer to which objects

class HeapQuiz {

  // every HeapQuiz object has an .id, initially set to 0
  int id = 0;

  public static void main(String[] args) {

    // set x as the while loop iterator
    int x = 0;

    // create "hq" as an array to hold references to 5 HeapQuiz objects
    HeapQuiz[] hq = new HeapQuiz[5];

    // only perform 3 while loops (while x == 0,1,2)
    while (x < 3) {

      // creates HeapQuiz objects at hq[0,1,2]
      // hq[4,5] indexes not populated
      hq[x] = new HeapQuiz();

      // set the 3 created HeapQuiz object's .id value to equal their index number
      hq[x].id = x;

      // increment x to iterate the while loop
      x = x + 1;

    } // end while loop

    // LET THE GAMES BEGIN!

    hq[3] = hq[1]; // hq[3] (empty) now points at id:1

    hq[4] = hq[1]; // hq[4] (empty) also points at id:1

    hq[3] = null; // hq[3] (id:1) now is empty again (null)

    hq[4] = hq[0]; // hq[4] (id:1) now points at id:0

    hq[0] = hq[3]; // hq[0] (id:0) now points at hq[3] (null), so is also now null

    hq[3] = hq[2]; // hq[3] (null) now points at id:2

    hq[2] = hq[0]; // hq[2] (id:2) now points at hq[0] (null), so is also now null

    // do stuff

  } // end main

} // end class