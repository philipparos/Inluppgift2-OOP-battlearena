package battlearena.characters;

import battlearena.game.actionType;

public class Hunter extends Fighter implements actionType {
    int hp = 115;


    @Override
    public int attackDamage() {
        return (int)(Math.random() * 11) + 5;
    }

    public int specialAttack() {
        return (int)(Math.random() * 8) + 15;
    }
}
