// testing the default values of uninitialized instance variables

class PoorDog {

  // instance variables declared but not initialized with values
  private int size;
  private String name;

  // what values will these getters return?
  // since no setters are defined...
  public int getSize() {
    return size;
  }

  public String getName() {
    return name;
  }

}