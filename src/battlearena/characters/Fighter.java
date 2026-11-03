package battlearena.characters;

import battlearena.game.ActionType;

import java.util.ArrayList;
import java.util.List;

public abstract class Fighter implements ActionType {
    private List<Fighter> characters = new ArrayList<>();
    private final String CHARACTER_NAME;
    private static int MAX_HP;
    private int newHp;
    private final String SPECIAL_ATTACK_NAME;

    private void addCharacters() {
        characters.add(new Warrior());
        characters.add(new Mage());
        characters.add(new Hunter());
    }

    public Fighter(String CHARACTER_NAME, int MAX_HP, String SPECIAL_ATTACK_NAME) {
        this.CHARACTER_NAME = CHARACTER_NAME;
        this.newHp = MAX_HP;
        this.SPECIAL_ATTACK_NAME = SPECIAL_ATTACK_NAME;
    }

    public String getCHARACTER_NAME() {
        return CHARACTER_NAME;
    }

    public int getMAX_HP() {
        return MAX_HP;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getSPECIAL_ATTACK_NAME() {
        return SPECIAL_ATTACK_NAME;
    }


    public boolean isAlive() {
        if (hp < 0) {
            setHp(0);
            return false;
        }
        return hp > 0;
    }
}
// useSpecial() för attack
// kommentar
