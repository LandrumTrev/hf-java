// fix the source file if broken
// TestDrive file okay as-is, Clock needed a fix

class ClockTestDrive {

  public static void main(String[] args) {

    Clock c = new Clock();

    c.setTime("1245");

    String tod = c.getTime();

    System.out.println("time: " + tod);

  }
}