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

        GameUtility.welcomeMessage(); // la till ett välkomsmeddelande

        String namn = inputHandler.askForName();

        Game game = new Game();
        ListHandler listHandler = new ListHandler();
        listHandler.addCharacters();
        listHandler.printCharacterName();

        Fighter fighter = inputHandler.menuNumberChoice();

        // göra till en metod som skriver ut vad player & CPU har valt för karaktär
        // public void printCharacterChoises() {

        System.out.println(inputHandler.menuNumberChoice());


        //System.out.println("CPU chose " + Game.removePlayerChoice());
        // inte löst hur jag ska göra med CPU

        //game.startBattle();


    }

}

    //whileloop-metod för running program?
