// given answer to Puzzle4b / Puzzle4 code has a Type error

class Puzzle4b {

  int ivar;

  public int doStuff(int factor) {

    if (ivar > 100) {

      return ivar * factor;

    } else {

      return ivar * (5 - factor);
    }
  }
}