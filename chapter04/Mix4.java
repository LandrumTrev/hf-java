// insert missing proper code sections to get the correct output

public class Mix4 {

  int counter = 0;

  public static void main(String[] args) {

    // every new Mix4 object starts with a "count" value of 0
    int count = 0;

    // m4a is an array which has 20 slots to hold Mix4 objects
    Mix4[] m4a = new Mix4[20];

    // while loop iterator
    int x = 0;

    // while x is less than...
    while (x < 9) { // 14 1

      // create a new Mix4 object at index# (x's value) of m4a array
      m4a[x] = new Mix4();

      // and increment the .counter value of that new Mix4 object by 1
      m4a[x].counter = m4a[x].counter + 1;

      // and increment main's "count" var by 1
      count = count + 1;

      // then set count to itself plus the maybeNew(x) value of the new Mix4 object
      count = count + m4a[x].maybeNew(x);

      // and increment the while loop iterator by 1
      x = x + 1;

    }
    // when while loop finishes, print the "count" value, AND
    // the .counter value of the 2nd object in m4a array
    System.out.println(count + " " + m4a[1].counter);

  } // end main

  // called at second to last while loop line,
  // argument passed to (index) is index# of Mix4 object in m4a array
  public int maybeNew(int index) {

    // if index is less than...
    if (index < 5) { // 14 1

      // m4 is a new Mix4 object
      Mix4 m4 = new Mix4();

      // and m4's counter is incremented by 1
      m4.counter = m4.counter + 1;

      // return 1 as the value of maybeNew()
      return 1;

    }
    // otherwise (else) return 0 as value of maybeNew()
    return 0;

  } // end maybeNew

}