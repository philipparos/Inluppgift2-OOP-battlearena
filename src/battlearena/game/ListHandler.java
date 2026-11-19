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

    public static Fighter getFighterByIndex(int i) {
        return fighters.get(i);
    }


    public List<Fighter> getFighters() {
        return fighters;
    }

    public static List<Fighter> removePlayerChoice(List<Fighter> availableFighters, Fighter humanfighter) {
        for (Fighter fighter : availableFighters) {
            if (humanfighter.equals(fighter)) {
                availableFighters.remove(fighter);
                return availableFighters;
            }
        }
        return null;
    }

    public void printFighterTypes() {
        int counter = 1;
        for (Fighter fighter : fighters) {
            System.out.println(counter + ". " + fighter.getFIGHTER_NAME());
            counter++;
        }
    }

}
