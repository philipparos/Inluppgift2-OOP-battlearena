package battlearena;
import battlearena.characters.Fighter;
import battlearena.game.Game;
import battlearena.game.GameUtility;
import battlearena.game.InputHandler;
import battlearena.game.ListHandler;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        InputHandler inputHandler = new InputHandler(new Scanner(System.in));

        GameUtility.welcomeMessage();

        String namn = inputHandler.askForName();

        Game game = new Game();
        ListHandler listHandler = new ListHandler();
        listHandler.addCharacters();
        listHandler.printCharacterName();

        int fighterChoice = inputHandler.menuNumberChoice();

        System.out.println(inputHandler.menuNumberChoice());

    }
}
