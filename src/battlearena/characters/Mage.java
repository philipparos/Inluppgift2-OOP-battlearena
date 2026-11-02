package battlearena.characters;

public class Mage extends Fighter {
    private static final int MAX_HP = 112;
    private static final String SPECIAL_ATTACK_NAME = "Heal";
    private static final String CHARACTER_NAME = "Mage";


    public Mage() {
        super(CHARACTER_NAME, MAX_HP, SPECIAL_ATTACK_NAME);
    }

    @Override
    public int attackDamage() {
        return (int)(Math.random() * 11) + 6;
    }

    public int specialAttack() {
        return (int)(Math.random() * 8) + 20;
    }
}
