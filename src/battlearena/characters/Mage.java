package battlearena.characters;

import battlearena.game.actionType;

public class Mage extends Fighter implements actionType {
    int hp = 112;

    @Override
    public int attackDamage() {
        return (int)(Math.random() * 11) + 6;
    }

    public int specialAttack() {
        return (int)(Math.random() * 8) + 20;
    }
}
