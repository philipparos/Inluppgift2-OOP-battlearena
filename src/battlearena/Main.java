package battlearena;
import battlearena.game.Game;
import battlearena.game.InputHandler;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        InputHandler inputHandler = new InputHandler(new Scanner(System.in));
        String namn = inputHandler.askForName();

        Game game = new Game();
        game.addCharacters();
        game.printCharacterName();

        int siffra = inputHandler.menuNumberChoice();
        System.out.println(siffra);

    }
    //whileloop-metod för running program?

}
