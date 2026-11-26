package battlearena.game;

import battlearena.characters.Fighter;
import battlearena.serverclient.Client;

import java.util.Random;
import java.util.Scanner;

public class GameLogic {
    private GameUtility gameUtility = new GameUtility();
    private final Random randomObject = new Random();
    private BattlePrinter battlePrinter = new BattlePrinter();
    private GameSetUp gameSetUp = new GameSetUp();
    ListHandler listHandler = new ListHandler();
    InputHandler inputHandler = new InputHandler(new Scanner(System.in));

    public void startGameLoop() {
        BattlePrinter.welcomeMessage();
        boolean playAgain = true;
        while(playAgain){
            Player humanPlayer = gameSetUp.createHumanPlayer(inputHandler, listHandler);
            CPUPlayer cpuPlayer = gameSetUp.createCPUPlayer(listHandler);
            battlePrinter.printFighterChoice(humanPlayer);
            battlePrinter.printFighterChoice(cpuPlayer);
            startBattle(humanPlayer.getFighter(), cpuPlayer.getFighter());
            playAgain = inputHandler.askToPlayAgain();
        }
    }

    public void startBattle(Fighter player1, Fighter player2) {
        boolean isPlayerTurn = randomObject.nextBoolean();
        player1.resetHp();
        player2.resetHp();


        battlePrinter.printBattleStart(player1, player2, isPlayerTurn);
        while (player1.isAlive() && player2.isAlive()) {

            Fighter attacker = isPlayerTurn ? player1 : player2;
            Fighter defender = isPlayerTurn ? player2 : player1;

           gameUtility.firstAttack(attacker, defender);

            if (!defender.isAlive()) {
                battlePrinter.printResults(attacker, defender);
                break;
            }

            gameUtility.secondAction(attacker, defender);

            if (!defender.isAlive()) {
                battlePrinter.printResults(attacker, defender);
                break;
            }

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }

            isPlayerTurn = !isPlayerTurn;
        }
    }
}