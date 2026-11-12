package battlearena.game;
import battlearena.characters.Fighter;
import battlearena.characters.Hunter;
import battlearena.characters.Mage;
import battlearena.characters.Warrior;
import java.util.ArrayList;
import java.util.List;

public class ListHandler {

    static List<Fighter> characters = List.of(
            new Warrior(),
            new Mage(),
            new Hunter()
    );

    public ArrayList<Fighter> avaliableFighters = new ArrayList<Fighter>(characters);

    public static Fighter getFighterByIndex(int i) {
        return characters.get(i);
    }


    public List<Fighter> getCharacters() {
        return characters;
    }

    public static List<Fighter> removePlayerChoice(List<Fighter> avaliableFighters, Fighter humanfighter) {
        for (Fighter fighter : avaliableFighters) {
            if (humanfighter.equals(fighter)) {
                avaliableFighters.remove(fighter);
                return avaliableFighters;
            }
        }
        return null;
    }

    public void printCharacterName() {
        int counter = 1;
        for (Fighter fighter : characters) {
            System.out.println(counter + ". " + fighter.getCHARACTER_NAME());
            counter++;
        }
    }

}
