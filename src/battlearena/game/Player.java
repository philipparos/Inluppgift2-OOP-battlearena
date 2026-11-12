package battlearena.game;

import battlearena.characters.Fighter;
import battlearena.characters.Warrior;

public class Player {
    private String name;
    private Fighter fighter;

    // Fighterchoice


    public Player() {
    }

    public Player(String name, Fighter fighter) {
        this.name = name;
        this.fighter = fighter;
    }

    public Player createPlayer(String name, Fighter fighter){
        return new Player(name, fighter);
    }

    public String getName() {
        return name;
    }


    public Fighter getFighter() {
        return fighter;
    }
}