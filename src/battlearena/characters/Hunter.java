package battlearena.characters;

public class Hunter extends Fighter {
    private static int hp = 115;
    private static final String SPECIAL_ATTACK_NAME = "Double attack";
    private static final String CHARACTER_NAME = "Hunter";

    //public Hunter() {}

    public Hunter() {
        super(CHARACTER_NAME, hp, SPECIAL_ATTACK_NAME);
    }

    @Override
    public int attackDamage() {
        return (int)(Math.random() * 11) + 5;
    }

    public int specialAttack() {
        return (int)(Math.random() * 8) + 15;
    }
}
