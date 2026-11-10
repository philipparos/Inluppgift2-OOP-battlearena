package battlearena.game;
import battlearena.characters.Fighter;
import battlearena.characters.Hunter;
import battlearena.characters.Mage;
import battlearena.characters.Warrior;
import java.util.ArrayList;
import java.util.List;

public class ListHandler {

    static List<Fighter> characters = new ArrayList<>();

    public void addCharacters() {
        characters.add(new Warrior());
        characters.add(new Mage());
        characters.add(new Hunter());
    }

    public ArrayList<Fighter> getFightersList() {
        return new ArrayList<Fighter>(characters);
    }


    public List<Fighter> getCharacters() {
        return characters;
    }

    public static List<Fighter> removePlayerChoice(List<Fighter> list, Fighter humanfighter) {
        for (Fighter fighter : list) {
            if (humanfighter.equals(fighter)) {
                list.remove(fighter);
                return list;
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
