package battlearena.characters;

public class Hunter extends Fighter {
    private static final int MAX_HP = 115;
    private static final String SPECIAL_ATTACK_NAME = "Double attack";
    private static final String CHARACTER_NAME = "Hunter";

    public Hunter() {
        super(CHARACTER_NAME, MAX_HP, SPECIAL_ATTACK_NAME);
    }

    @Override
    public int attackDamageRoll() {
        return (int) (Math.random() * 11) + 5;
    }

    @Override
    public int specialActionRoll() {
        return (int) (Math.random() * 8) + 15;
    }

    @Override
    public int actualAttackDamage(Fighter defender) {
        return Math.min(attackDamageRoll(), defender.getHp());
    }

    public int actualSpecialDamage(Fighter defender) {
        return Math.min(specialActionRoll(), defender.getHp());
    }
}
