package battlearena.game;
import battlearena.characters.Fighter;

import java.util.Random;

public class GameLogic {
    private GameUtility gameUtility = new GameUtility();
    private final Random randomObject = new Random();
    private BattlePrinter battlePrinter = new BattlePrinter();
    //private List<Fighter> characters = new ArrayList<>();
//    Fighter player;
//    Fighter cpu;

    public void startBattle(Fighter player1, Fighter player2) {
        boolean isPlayerTurn = randomObject.nextBoolean();// slumpar vem som börjar, vid true börjar spelaren

        player1.resetHp();
        player2.resetHp();

        int firstDamage;
        //int extraDamage;

        while (player1.isAlive() && player2.isAlive()) { // så länge båda lever körs battle
            if (isPlayerTurn) { //true

                firstDamage = gameUtility.firstAttack(player1, player2);

                if (!player2.isAlive()) {
                    battlePrinter.printResults(player1, player2);
                    break;
                } else {
                    battlePrinter.printAttack(player1, player2, firstDamage);

                }
                gameUtility.secondAction(player1, player2);

                if (!player2.isAlive()) {
                    battlePrinter.printResults(player1, player2);
                    break;
                } else {
                 //   second action - behöver metod
                }
//


                // datorns tur
            } else {
                firstDamage = gameUtility.firstAttack(player2, player1);

                if (!player1.isAlive()) {
                    battlePrinter.printResults(player2, player1);
                    break;
                } else {
                    battlePrinter.printAttack(player2, player1, firstDamage);
                }

                gameUtility.secondAction(player2, player1);

                if (!player1.isAlive()) {
                    battlePrinter.printResults(player2, player1);
                    break;
                } else {
             // second action - behöver metod
                }
            }
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }

                    isPlayerTurn = !isPlayerTurn;
                }
            }
        }




