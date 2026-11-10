package battlearena.game;
import battlearena.characters.Fighter;
import battlearena.characters.Hunter;
import battlearena.characters.Mage;
import battlearena.characters.Warrior;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {
    private GameUtility gameUtility = new GameUtility();
    private final Random randomObject = new Random();
    private List<Fighter> characters = new ArrayList<>();
//    Fighter player;
//    Fighter cpu;

    public void startBattle(Fighter player1, Fighter player2) {
        boolean isPlayerTurn = randomObject.nextBoolean(); // slumpar vem som börjar, vid true börjar spelaren

        while (player1.isAlive() && player2.isAlive()) { // så länge båda lever körs battle
            if (isPlayerTurn) { //true
                gameUtility.firstAttack(player1, player2);

                // andra attacken

                gameUtility.secondAction(player1, player2);

            } else {
                // datorns tur
                int cpuDamage = player2.attackDamage();
                player1.setHp(player2.getHp() - cpuDamage);

                System.out.println("The computer makes " + cpuDamage + " damage");
            }
            isPlayerTurn = !isPlayerTurn;
        }
    }

    public int makeActions(Fighter fighterOne, Fighter fighterTwo){
        for(int turnCounter = 0; turnCounter <= 1; turnCounter++){

        }
        // ta in två fighters. rolla för actiontype, if-elsesats för o kolla vad det blev, utföra metoden
        //specialattack eller attack genom o kalla på den, ta reda på vad jag ens ska returnera i metoden


        return 0;
    }

    //randomize attack
}
