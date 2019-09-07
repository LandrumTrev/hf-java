// exercise: fix the file so it will compile

class BooksTestDrive {

  public static void main(String[] args) {

    // variable myBooks will hold an array of Books objects
    // and its value is a reference to an array of 3 empty Books object slots
    Books[] myBooks = new Books[4];

    // FIX: need to create new Books() objects before they can be assigned values
    myBooks[0] = new Books();
    myBooks[1] = new Books();
    myBooks[2] = new Books();
    myBooks[3] = new Books();

    // give each Books object in the array a .title and an .author property value
    myBooks[0].title = "The Grapes of Java";
    myBooks[1].title = "The Java Gatsby";
    myBooks[2].title = "The Java Cookbook";
    myBooks[3].title = "Meditations on Java";
    myBooks[0].author = "bob";
    myBooks[1].author = "sue";
    myBooks[2].author = "ian";
    myBooks[3].author = "Marcus Aurelius";

    // create an iterator for the while loop
    int x = 0;

    // run while loop 3 times
    // usually you would use myBooks.length instead
    while (x < myBooks.length) {
      System.out.print(myBooks[x].title);
      System.out.print(" by ");
      System.out.println(myBooks[x].author);
      x = x + 1;
    }
  }
}