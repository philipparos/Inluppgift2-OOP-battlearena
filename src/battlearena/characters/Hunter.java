package battlearena.characters;

public class Hunter extends Fighter {
    private static final int MAX_HP = 115;
    private static final String SPECIAL_ATTACK_NAME = "Double attack";
    private static final String CHARACTER_NAME = "Hunter";

    //public Hunter() {}

    public Hunter() {
        super(CHARACTER_NAME, MAX_HP, SPECIAL_ATTACK_NAME);
    }

    @Override
    public int attackDamageRoll() {
        return (int)(Math.random() * 11) + 5;
    }
    @Override
    public int specialAttackRoll() {
        return (int)(Math.random() * 8) + 15;
    }

//    @Override
    public int attackDamageXXXXX(Fighter attacker, Fighter defender) {
       // if fighter == warrrior
           //     if warrior actiontypeRole == special (akta dig)
        //weakdamage = damage/2;
        //else
        int damage = attackDamageRoll();
        defender.setHp(defender.getHp() - damage);
        return defender.getHp();

    }

    @Override
    public int attackDamage() {
        return 0;
    }

    @Override
    public int specialAttack() {
        // fett mycket damage
        return 0;
    }
}
