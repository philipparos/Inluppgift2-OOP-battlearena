package battlearena.test;

import battlearena.characters.Fighter;
import battlearena.characters.Mage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FighterTest {

    private Fighter fighter;

    @BeforeEach
    void setUp(){
        fighter = new Mage();
    }


    @Test
    void isAliveAsLongAsHpIsNotZero(){
        //Arrange
        fighter.setHp(0);

        //Act
        fighter.isAlive();

        //Assert
//        assertTrue(fighter.getHp() > 0);
//        assertTrue(fighter.getHp() > 120);
//        assertTrue(fighter.getHp() == 0);
//        assertTrue(fighter.getHp() < 0);
//        assertTrue(fighter.getHp())
    }
}