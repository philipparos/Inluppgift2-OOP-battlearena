package battlearena.characters;

public class Warrior extends Fighter {
    private static int DEFEND_CONSTANT = 2;
    private static final int MAX_HP = 120;
    private static final String SPECIAL_ATTACK_NAME = "Defend";
    private static final String CHARACTER_NAME = "Warrior";

    public Warrior() {
        super(CHARACTER_NAME, MAX_HP, SPECIAL_ATTACK_NAME);
    }

    @Override
    public int attackDamageRoll() {
       return (int)(Math.random() * 11) + 8;
    }

    @Override
    public int specialAttackRoll() {
        int defend = (int)(Math.random() * 8) + 20;
        return defend/DEFEND_CONSTANT;
    }

    @Override
    public int attackDamage() {
        return 0;
    }

    @Override
    public int specialAttack() {
        return 0;
    }
}
