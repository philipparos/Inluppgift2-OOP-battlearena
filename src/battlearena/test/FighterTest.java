package battlearena.test;

import battlearena.characters.Fighter;
import battlearena.characters.Hunter;
import battlearena.characters.Mage;
import battlearena.characters.Warrior;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FighterTest {

    private Fighter fighter;

    @BeforeEach
    void setUp(){
        fighter = new Hunter();
    }


    @Test
    void shouldNotBeAliveWhenHpIsZero(){
        //Arrange
        fighter.setHp(0);

        //Act
        fighter.isAlive();

        //Assert
        assertFalse(fighter.isAlive());
    }

    @Test
    void shouldBeAliveWhenHpIsAboveZero(){
        fighter.setHp(1);

        assertTrue(fighter.isAlive());
    }

    @Test
    void notAliveWhenHpBelowZero(){
        fighter.setHp(-5);

        assertFalse(fighter.isAlive());
    }

    // TDD
    @Test
    void shouldResetHpToMaxHp(){
        fighter.setHp(7);
        fighter.resetHp();
        assertEquals(fighter.getMaxHp(), fighter.getHp());
    }
}