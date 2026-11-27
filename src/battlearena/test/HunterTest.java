package battlearena.test;

import battlearena.characters.Fighter;
import battlearena.characters.Hunter;
import battlearena.characters.Mage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HunterTest {
    private Hunter hunter;
    private Fighter mage;
    @BeforeEach
    void setUp(){
        hunter = new Hunter();
        mage = new Mage();
    }

    @Test
    void hunterAttackDamageShouldDamageMage(){
        int hpBeforeAttack = mage.getHp();
        int hunterAttackDamage = hunter.attackDamageRoll();

        int actualDamage = mage.takeDamage(hunterAttackDamage);

        assertEquals(hpBeforeAttack - actualDamage, mage.getHp());
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
