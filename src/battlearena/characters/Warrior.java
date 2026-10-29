package battlearena.characters;

import battlearena.game.actionType;

public class Warrior extends Fighter implements actionType {
    int DEFEND_CONSTANT = 2;
    int hp = 120;

    @Override
    public int attackDamage() {
       return (int)(Math.random() * 11) + 8;
    }

    public int specialAttack() {
        int defend = (int)(Math.random() * 8) + 20;
        return defend/DEFEND_CONSTANT;
    }
}
