
public class PhraseOMatic {

  public static void main(String[] args) {

    // make three sets of words to choose from, each as an array of strings
    String[] wordListOne = { "24/7", "multi-tier", "10,000 foot", "B2B", "win-win", "frontend", "web-based",
        "pervasive", "smart", "Six Sigma", "mission critical", "dynamic" };

    String[] wordListTwo = { "empowered", "sticky", "value-added", "oriented", "centric", "distributed", "clustered",
        "branded", "outside the box", "positioned", "networked", "focused", "leveraged", "alinged", "targeted",
        "shared", "cooperative", "accelerated" };

    String[] wordListThree = { "process", "tipping point", "solution", "architecture", "core competency", "strategy",
        "mindshare", "portal", "space", "vision", "paradigm", "mission" };

    // get a count of the number of words in each array
    int oneLength = wordListOne.length;
    int twoLength = wordListTwo.length;
    int threeLength = wordListThree.length;

    // generate random numbers based on the length of each array
    int rand1 = (int) (Math.random() * oneLength);
    int rand2 = (int) (Math.random() * twoLength);
    int rand3 = (int) (Math.random() * threeLength);

    // build corporate gibberish phrase with random word from each array
    String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

    // print out a sentence using the generated phrase to the CLI
    System.out.println("What we need is a " + phrase);

  }
}