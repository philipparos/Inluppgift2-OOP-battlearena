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
        boolean isPlayerTurn = randomObject.nextBoolean(); // slumpar vem som börjar, vid true börjar spelaren

        while (player1.isAlive() && player2.isAlive()) { // så länge båda lever körs battle
            if (isPlayerTurn) { //true
                gameUtility.firstAttack(player1, player2);
                    if (!player2.isAlive()){ // kanske onödigt om mage healar sig själv
                        break;
                    }

                gameUtility.secondAction(player1, player2);

            } else {
                // datorns tur
                gameUtility.firstAttack(player2, player1);
                if (!player1.isAlive()){ // kanske onödigt om mage healar sig själv
                    break;
                }

                gameUtility.secondAction(player2, player1);

            }
            isPlayerTurn = !isPlayerTurn;
        }
    }
}
