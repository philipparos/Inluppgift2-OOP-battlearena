package battlearena.test;

import battlearena.characters.Mage;
import battlearena.characters.Warrior;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MageTest {

    private Mage mage;

    @BeforeEach
    void setUp() {
        mage = new Mage();
    }

    @Test
    void mageShouldHave120Hp() {

        assertEquals(120, mage.getMAX_HP());
        //Output: testet går inte igenom, Expected: 120 Actual: 0
        //Hp sätts till 0 i Fighter - bör ändras till private int hp;??
    }

    @Test
    void mageShouldBeAliveAtStart() {

        assertTrue(mage.isAlive());
    }
}
