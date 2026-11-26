package battlearena.test;

import battlearena.characters.Mage;
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
    void mageShouldHave112Hp() {

        assertEquals(112, mage.getMaxHp());

    }

    @Test
    void mageShouldBeAliveAtStart() {

        assertTrue(mage.isAlive());
    }
}
