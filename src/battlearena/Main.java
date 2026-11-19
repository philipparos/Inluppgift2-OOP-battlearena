package battlearena;
import battlearena.game.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        InputHandler inputHandler = new InputHandler(new Scanner(System.in));
        GameLogic gameLogic = new GameLogic();
        ListHandler listHandler = new ListHandler();
        GameSetUp gameSetUp = new GameSetUp();

        GameUtility.welcomeMessage();

        Player player = gameSetUp.createPlayer(inputHandler, listHandler);

        System.out.println(player.getName() + " picked " + player.getFighter().getFIGHTER_NAME());

        CPUPlayer cpuPlayer = gameSetUp.createCPUPlayer(listHandler);

        System.out.println(cpuPlayer.getName() + " picked " + cpuPlayer.getFighter().getFIGHTER_NAME());
        System.out.println("Let the battle begin!");


        gameLogic.startBattle(player.getFighter(), cpuPlayer.getFighter());


        //System.out.println(player.getName() +" picked " + player.getFighter().getFIGHTER_NAME());
        //System.out.println(gameSetUp.createPlayer(inputHandler, listHandler));


        // listHandler.printFighterTypes();
        // int fighterChoice = inputHandler.menuNumberChoice();
        // String namn = inputHandler.askForName();




    }
}
