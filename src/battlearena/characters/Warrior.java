package battlearena.characters;

public class Warrior extends Fighter {
    private static int DEFEND_CONSTANT = 2;
    private static int hp = 120;
    private static final String SPECIAL_ATTACK_NAME = "Defend";
    private static final String CHARACTER_NAME = "Warrior";

    public Warrior() {
        super(CHARACTER_NAME, hp, SPECIAL_ATTACK_NAME);
    }

    @Override
    public int attackDamage() {
       return (int)(Math.random() * 11) + 8;
    }

    public int specialAttack() {
        int defend = (int)(Math.random() * 8) + 20;
        return defend/DEFEND_CONSTANT;
    }
}
