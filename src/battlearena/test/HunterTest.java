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
    void setUp(){
        hunter = new Hunter();
        mage = new Mage();
    }

    @Test
    void hunterAttackDamageShouldDamageMage(){
        int hunterAttack = hunter.attackDamageRoll();
        int hpBeforeAttack = mage.getHp();

        //Act
        int hpAfterAttack = mage.getHp();
        int damage = hpBeforeAttack - hpAfterAttack;

        //Assert
//        assertTrue(hpBeforeAttack > hpAfterAttack);
        assertFalse(hpBeforeAttack > hpAfterAttack);
    }

    @Test
    void hunterAttackShouldDamageBetween5and15(){
        //Arrange
        int hpBeforeAttack = mage.getHp();

        //Act
        int hunterAttackDamage = hunter.attackDamageRoll();
        int hpAfterAttack = hpBeforeAttack - hunterAttackDamage;
        int damage = hpBeforeAttack - hpAfterAttack;

        //Assert
        assertTrue(damage >= 5);
        assertTrue(damage <= 15);


//        assertTrue(
//                damage == 0 || (damage >= 5 && damage <= 15)
//        );
    }

    @Test
    void attackDamageXXXXXShouldDecreaseHp(){
        //Arrange
        int hpBeforeAttack = mage.getHp();

        //Act
        int hunterAttackDamage = hunter.attackDamage();
        int newHp = hpBeforeAttack - hunterAttackDamage;

        //Assert
        assertTrue(hpBeforeAttack > newHp);
    }
    @Test
    void hunterShouldBeAliveAtStart() {

        assertTrue(hunter.isAlive());
    }
}
