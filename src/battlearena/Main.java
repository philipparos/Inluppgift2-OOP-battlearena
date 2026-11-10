package battlearena;
import battlearena.characters.Fighter;
import battlearena.game.Game;
import battlearena.game.InputHandler;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        InputHandler inputHandler = new InputHandler(new Scanner(System.in));

        InputHandler.welcomeMessage(); // la till ett välkomsmeddelande

        String namn = inputHandler.askForName();

        Game game = new Game();
        game.addCharacters();
        game.printCharacterName();

        int siffra = inputHandler.menuNumberChoice();

        // göra till en metod som skriver ut vad player & CPU har valt för karaktär
        // public void printCharacterChoises() {
        System.out.println("You chose " + game.getCharacters().get(siffra - 1).getCHARACTER_NAME());
        //System.out.println("CPU chose " + Game.removePlayerChoice());
        // inte löst hur jag ska göra med CPU
    }
}

    //whileloop-metod för running program?
