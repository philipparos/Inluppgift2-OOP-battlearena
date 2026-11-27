package battlearena.game;
import battlearena.characters.Fighter;
import battlearena.characters.Hunter;
import battlearena.characters.Mage;
import battlearena.characters.Warrior;
import java.util.ArrayList;
import java.util.List;

public class ListHandler {

    static List<Fighter> fighters = List.of(
            new Warrior(),
            new Mage(),
            new Hunter()
    );

    public ArrayList<Fighter> availableFighters() {
        return new ArrayList<Fighter>(fighters);
    }


    public List<Fighter> getFighters() {
        return fighters;
    }

    public static List<Fighter> removePlayerChoice(List<Fighter> availableFighters, Fighter humanFighter) {
        for (Fighter fighter : availableFighters) {
            if (humanFighter.equals(fighter)) {
                availableFighters.remove(fighter);
                return availableFighters;
            }
        }
        return null;
    }

    public void printFighterTypes() {
        int counter = 1;
        for (Fighter fighter : fighters) {
            System.out.println(counter + ". " + fighter.getFighterName());
            counter++;
        }
    }
}
