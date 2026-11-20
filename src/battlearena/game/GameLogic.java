package battlearena.game;
import battlearena.characters.Fighter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameLogic {
    private GameUtility gameUtility = new GameUtility();
    private final Random randomObject = new Random();
    //private List<Fighter> characters = new ArrayList<>();
//    Fighter player;
//    Fighter cpu;

    public void startBattle(Fighter player1, Fighter player2) {
        boolean isPlayerTurn = randomObject.nextBoolean();// slumpar vem som börjar, vid true börjar spelaren
        int firstActionDamage;

        while (player1.isAlive() && player2.isAlive()) { // så länge båda lever körs battle
            if (isPlayerTurn) { //true

                    // Philippas
                    firstActionDamage = player1.actualAttackDamage(player2);
                player2.setHp(player2.getHp() - firstActionDamage);

                if (!player2.isAlive()) {
                    System.out.println("!!!!!!" + player1.getFIGHTER_NAME() + " does " + firstActionDamage + " damage! " + player2.getFIGHTER_NAME() + " died!");
                    break;

                }
                    System.out.println("!!!!!1" + player1.getFIGHTER_NAME() + " does " + firstActionDamage + " damage! " + player2.getFIGHTER_NAME() + " current hp: " + player2.getHp()); //


                gameUtility.secondAction(player1, player2);

            } else {
                // datorns tur
                firstActionDamage = player2.actualAttackDamage(player1);
                player1.setHp(player1.getHp() - firstActionDamage);
                if (!player1.isAlive()) {
                    System.out.println("!!!!!!" + player1.getFIGHTER_NAME() + " does " + firstActionDamage + " damage! " + player2.getFIGHTER_NAME() + " died!");// kanske onödigt om mage healar sig själv
                    break;

                }
                System.out.println("!!!!!1" + player1.getFIGHTER_NAME() + " does " + firstActionDamage + " damage! " + player2.getFIGHTER_NAME() + " current hp: " + player2.getHp());



                gameUtility.secondAction(player2, player1);

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
