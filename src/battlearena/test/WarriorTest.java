package battlearena.test;

import battlearena.characters.Warrior;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WarriorTest {
    private Warrior warrior;

    @BeforeEach
    void setUp() {
        warrior = new Warrior();
    }

    @Test
    void warriorShouldHave120Hp() {

        assertEquals(120, warrior.getMaxHp());
    }

    @Test
    void warriorShouldBeAliveAtStart() {

        assertTrue(warrior.isAlive());
    }
}
