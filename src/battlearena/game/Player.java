package battlearena.game;

import battlearena.characters.Fighter;

public class Player {
    private String name;
    private Fighter fighter;


    public Player() {
    }

    public Player(String name, Fighter fighter) {
        this.name = name;
        this.fighter = fighter;
    }

    public String getName() {
        return name;
    }

    public Fighter getFighter() {
        return fighter;
    }
}