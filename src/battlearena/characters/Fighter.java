package battlearena.characters;

import battlearena.game.ActionType;

public abstract class Fighter implements ActionType {
    private final String fighterName;
    private final int maxHp;
    private int currentHp;
    private final String specialActionName;

    public Fighter(String fighterName, int maxHp, String specialActionName) {
        this.fighterName = fighterName;
        this.maxHp = maxHp;
        this.currentHp = maxHp;
        this.specialActionName = specialActionName;
    }

    public String getFighterName() {
        return fighterName;
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

    public String getSpecialActionName() {
        return specialActionName;
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
        return damage;
    }

    @Override
    public String toString() {
        return getFighterName();
    }
}


