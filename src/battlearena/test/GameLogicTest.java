package battlearena.test;

import battlearena.characters.Fighter;
import battlearena.characters.Hunter;
import battlearena.characters.Mage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GameLogicTest {
    private Fighter hunter;
    private Fighter mage;

    @BeforeEach
    void setUp(){
        hunter = new Hunter();
        mage = new Mage();
    }

    @Test
    void attackShouldReduceTargetsHp() {
        int hpBefore = mage.getHp();

        mage.setHp(hpBefore - hunter.attackDamageRoll());
        assertTrue(mage.getHp() < hpBefore);
    }
}