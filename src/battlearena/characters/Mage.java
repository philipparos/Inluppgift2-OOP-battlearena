package battlearena.characters;

public class Mage extends Fighter {

    private static final int MAX_HP = 112;
    private static final String SPECIAL_ACTION_NAME = "Healing Surge";
    private static final String CHARACTER_NAME = "Mage";


    public Mage() {
        super(CHARACTER_NAME, MAX_HP, SPECIAL_ACTION_NAME);
    }

    @Override
    public int attackDamageRoll() {
        return (int)(Math.random() * 11) + 6;
    }

    @Override
    public int specialActionRoll() {
        return (int)(Math.random() * 8) + 18;
    }


    public int heal() {
        int healAmount = specialActionRoll();
        return Math.min(healAmount, getMaxHp() - getHp());
    }

    public int getMaxHp() {
        return MAX_HP;
    }
}
