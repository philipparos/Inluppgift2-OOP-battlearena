package battlearena.test;

import battlearena.characters.Fighter;
import battlearena.characters.Hunter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FighterTest {

    private Fighter fighter;

    @BeforeEach
    void setUp() {
        fighter = new Hunter();
    }


    @Test
    void shouldNotBeAliveWhenHpIsZero() {
        fighter.setHp(0);

        assertFalse(fighter.isAlive());
    }

    @Test
    void shouldBeAliveWhenHpIsAboveZero() {
        fighter.setHp(1);

        assertTrue(fighter.isAlive());
    }

    @Test
    void shouldSetHpToZeroWhenHpIsNegative() {
        fighter.setHp(-5);

        assertFalse(fighter.isAlive());
        assertEquals(0, fighter.getHp());
    }
}