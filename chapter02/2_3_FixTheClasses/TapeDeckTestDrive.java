// exercise: fix this class so that it will compile and output

// added "public" to make class accessible to other classes
public class TapeDeckTestDrive {

  public static void main(String[] args) {

    // instantiate new instance variable using TapeDeck Class as a variable Type
    // so "t" is now a named variable of the Type "TapeDeck",
    // but it's value is still undefined
    TapeDeck t;

    // now change "t" value from undefined to that of a new TapeDeck object
    // where the Class TapeDeck() is called as a method (function)
    t = new TapeDeck();

    t.canRecord = true;
    t.playTape();

    if (t.canRecord == true) {

      t.recordTape();
    }
  }
}