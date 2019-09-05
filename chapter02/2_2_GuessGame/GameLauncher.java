// simple trigger class used to start the GuessGame class

public class GameLauncher {

  public static void main(String[] args) {

    // create a new GuessGame object called "game"
    // by calling the GuessGame() class like a method/function
    GuessGame game = new GuessGame();

    // then invoke the new "game" object's startGame() method to run game
    game.startGame();
  }
}