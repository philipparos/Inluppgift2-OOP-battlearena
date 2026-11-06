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

        assertEquals(120, warrior.getMAX_HP());
        //Output: testet går inte igenom, Expected: 120 Actual: 0
        //Hp sätts till 0 i Fighter, bör ändras till private int hp;??
    }

    @Test
    void warriorShouldBeAliveAtStart() {

        assertTrue(warrior.isAlive());
    }
}
