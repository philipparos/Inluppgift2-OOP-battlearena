package battlearena.characters;

import battlearena.game.ActionType;

import java.util.ArrayList;
import java.util.List;

public abstract class Fighter implements ActionType {
    private List<Fighter> characters = new ArrayList<>();
    String CHARACTER_NAME;
    int hp;
    String SPECIAL_ATTACK_NAME;

    private void addCharacters() {
        characters.add(new Warrior());
        characters.add(new Mage());
        characters.add(new Hunter());
    }

    public Fighter(String CHARACTER_NAME, int hp, String SPECIAL_ATTACK_NAME) {
        this.CHARACTER_NAME = CHARACTER_NAME;
        this.hp = hp;
        this.SPECIAL_ATTACK_NAME = SPECIAL_ATTACK_NAME;
    }

    public String getCHARACTER_NAME() {
        return CHARACTER_NAME;
    }

    public int getHp() {
        return hp;
    }

    public String getSPECIAL_ATTACK_NAME() {
        return SPECIAL_ATTACK_NAME;
    }






    // useSpecial() för attack
}
