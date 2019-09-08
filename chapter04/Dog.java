// intro to relationships between methods and instance variables

class Dog {

  int size;
  String name;

  void bark() {

    if (size > 60) {
      System.out.println("Wooof! Wooof!");
    } else if (size > 14) {
      System.out.println("Ruff! Ruff!");
    } else {
      System.out.println("Yip! Yip!");
    }

  }

  void barks(int numOfBarks) {

    while (numOfBarks > 0) {
      System.out.println("ruff!");
      numOfBarks = numOfBarks - 1;
    }

  }

}