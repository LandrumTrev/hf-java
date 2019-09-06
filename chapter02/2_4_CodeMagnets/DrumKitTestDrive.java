// exercise: take scrambled lines of code and rearrange them 
// into a functioning program which outputs:
// bang bang ba-bang
// ding ding da-ding

public class DrumKitTestDrive {

  public static void main(String[] args) {

    DrumKit d = new DrumKit();

    d.playSnare();
    d.playTopHat();

    d.snare = false;

    if (d.snare == true) {
      d.playSnare();
    } else {
      System.out.println("snare set to FALSE (muted)");
    }

  }
}