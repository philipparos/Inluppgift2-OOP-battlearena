package battlearena.test;

import battlearena.characters.Fighter;
import battlearena.characters.Hunter;
import battlearena.characters.Mage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HunterTest {
    private Fighter hunter;
    private Fighter mage;

    @BeforeEach
    void setUp() {
        hunter = new Hunter();
        mage = new Mage();
    }

    @Test
    void hunterAttackShouldDamageMage() {
        int hpBeforeAttack = mage.getHp();

        int damage = hunter.attackDamageRoll();
        mage.setHp(hpBeforeAttack - damage);

        assertTrue(mage.getHp() < hpBeforeAttack);
    }

    @Test
    void hunterAttackShouldDamageBetween5and15() {
        int damage = hunter.attackDamageRoll();

        assertTrue(damage >= 5);
        assertTrue(damage <= 15);
    }

    @Test
    void hunterShouldBeAliveAtStart() {

        assertTrue(hunter.isAlive());
    }
}
