package battlearena.characters;

public class Warrior extends Fighter {

    private int defendPercentage;
    private static final int MAX_HP = 120;
    private static final String SPECIAL_ACTION_NAME = "Defend";
    private static final String CHARACTER_NAME = "Warrior";

    public Warrior() {
        super(CHARACTER_NAME, MAX_HP, SPECIAL_ACTION_NAME);
    }

    @Override
    public int attackDamageRoll() {
       return (int)(Math.random() * 11) + 8;
    }

    @Override
    public int specialActionRoll() {
        return (int)(Math.random() * 31) + 20; // 20-50%
    }

    @Override
    protected int adjustIncomingDamage(int damage) {
        if (defendPercentage == 0) {
            return damage;
        }

        int reducedDamage = damage * (100 - defendPercentage) / 100;
        defendPercentage = 0;
        return reducedDamage;
    }

    public void useSpecialAction() {
        setDefendPercentage(specialActionRoll());
    }

    public int getDefendPercentage() {
        return defendPercentage;
    }

    private void setDefendPercentage(int defendPercentage) {
        this.defendPercentage = defendPercentage;
    }
}

