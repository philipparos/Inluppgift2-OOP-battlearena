package battlearena.test;

import battlearena.characters.Fighter;
import battlearena.characters.Hunter;
import battlearena.characters.Mage;
import battlearena.characters.Warrior;
import battlearena.game.ListHandler;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GameSetUpTest {
    //ändring/komplettering av tidigare TDD

    @Test
    void getFighterByIndexShouldReturnWarriorWhenIndexIsZero(){
        Fighter fighter = ListHandler.getFighterByIndex(0);

        assertTrue(fighter instanceof Warrior);
    }

    @Test
    void getFighterByIndexShouldReturnMageWhenIndexIsOne(){
        Fighter fighter = ListHandler.getFighterByIndex(1);

        assertTrue(fighter instanceof Mage);
    }

    @Test
    void getFighterByIndexShouldReturnHunterWhenIndexIsTwo(){
        Fighter fighter = ListHandler.getFighterByIndex(2);

        assertTrue(fighter instanceof Hunter);
    }
}
