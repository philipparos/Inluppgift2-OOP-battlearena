package battlearena.characters;

import battlearena.game.ActionType;

public abstract class Fighter implements ActionType {
    private final String FIGHTER_NAME;
    private int maxHp;
    private int currentHp;
    //private int MIN_HP;
    private final String SPECIAL_ATTACK_NAME;

    public Fighter(String FIGHTER_NAME, int maxHp, String SPECIAL_ATTACK_NAME) {
        this.FIGHTER_NAME = FIGHTER_NAME;
        this.maxHp = maxHp;
        this.currentHp = maxHp;
        this.SPECIAL_ATTACK_NAME = SPECIAL_ATTACK_NAME;
    }

    public String getFIGHTER_NAME() {
        return FIGHTER_NAME;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setHp(int currentHp) {
        this.currentHp = currentHp;
    }

    public int getHp() {
        return currentHp;
    }

    public String getSPECIAL_ATTACK_NAME() {
        return SPECIAL_ATTACK_NAME;
    }


    public boolean isAlive() {
        int MIN_HP = 0;
        return currentHp > MIN_HP;
    }

    public void resetHp() {
        currentHp = maxHp;
    }

    public int takeDamage(int damage) {
        int damageAfterDefense = adjustIncomingDamage(damage);
        int actualDamage = Math.min(damageAfterDefense, currentHp);
        currentHp -= actualDamage;
        return actualDamage;
    }

    protected int adjustIncomingDamage(int damage) {
        return damage; // Vanliga fighters tar full skada
    }
}


