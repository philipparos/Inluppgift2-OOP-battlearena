package battlearena.test;

import battlearena.characters.Fighter;
import battlearena.characters.Hunter;
import battlearena.characters.Mage;
import battlearena.characters.Warrior;
import battlearena.game.ListHandler;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GameLogicSetUpTest {
    //ändring/komplettering av tidigare TDD

    @Test
    void shouldReturnWarriorWhenIndexIsZero() {
        Fighter fighter = ListHandler.getFighterByIndex(0);

        assertTrue(fighter instanceof Warrior);
    }

    @Test
    void shouldReturnMageWhenIndexIsOne() {
        Fighter fighter = ListHandler.getFighterByIndex(1);

        assertTrue(fighter instanceof Mage);
    }

    @Test
    void shouldReturnHunterWhenIndexIsTwo() {
        Fighter fighter = ListHandler.getFighterByIndex(2);

        assertTrue(fighter instanceof Hunter);
    }

    @Test
    void shouldThrowExceptionWhenIndexDoesNotExist() {
        assertThrows(IndexOutOfBoundsException.class,
                () -> ListHandler.getFighterByIndex(99));
    }
}