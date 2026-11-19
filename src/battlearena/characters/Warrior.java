package battlearena.characters;

public class Warrior extends Fighter {
    private static int defendPercentage;
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
    public int specialActionRoll() {
        return (int)(Math.random() * 31) + 20; // 20-50%
    }

    @Override
    public int actualAttackDamage(Fighter defender) {
        return Math.min(attackDamageRoll(), defender.getHp());
    }
    public int defendPercentageCalculator() {
        return specialActionRoll() /100;
    }

//    public boolean defend() {
//        return defendPercentageCalculator(specialActionRoll());

    }

