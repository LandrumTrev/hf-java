// output the "Bottles of Beer" song

// outer wrapper: "public" accessible, a "class", and it's name
public class BeerSong {

  // the class's "main" method, "void" because no return value
  public static void main(String[] args) {

    int beerNum = 99;
    String word = "bottles";

    // while loop runs from 99 down to 0
    while (beerNum > 0) {

      // when beerNum gets to 1, change "bottles" to "bottle"
      if (beerNum == 1) {
        word = "bottle";
      }

      // main song verse, uses current values of beerNum and word
      System.out.println("+++++++++++++++++++++++++");
      System.out.println(beerNum + " " + word + " of beer on the wall,");
      System.out.println(beerNum + " " + "bottles of beer...");
      System.out.println("take one down,");
      System.out.println("pass it around...");

      // iterate the while loop by subtracting 1 from beerNum value
      beerNum = beerNum - 1;

      // finish the verse with the new number of bottles on the wall
      // and conditional test to see if there are any more bottles in beerNum
      if (beerNum > 1) {
        System.out.println(beerNum + " " + word + " of beer on the wall!");
      } else if (beerNum == 1) {
        System.out.println("1 bottle of beer on the wall!");
      } else {
        System.out.println("No more bottles of beer on the wall!");
      } // end if/else
    } // end while loop
  } // end main method
} // end class