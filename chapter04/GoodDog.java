// introducing encapsulation: making instance variables private,
// and using Getters and Setters to access them

class GoodDog {

  // this instance variable is private; requires getter/setter to read/write its
  // value
  private int size;

  // the value of "size" must be read with the public getSize() getter;
  // cannot be read directly (note that int is required to Type the return value)
  public int getSize() {
    return size;
  }

  // public setter needed to set the value of "size" (void needed because no
  // return value)
  public void setSize(int s) {
    size = s;
  }

  // this method public (default/unmarked) because its just output
  // based on a conditional test; does not write state values (no security risk)
  void bark() {

    if (size > 60) {
      System.out.println("Wooof! Wooof!");
    } else if (size > 14) {
      System.out.println("Ruff! Ruff!");
    } else {
      System.out.println("Yip! Yip!");
    }

  }

}