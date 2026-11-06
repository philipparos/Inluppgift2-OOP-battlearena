package battlearena.test;

import battlearena.characters.Fighter;
import battlearena.characters.Hunter;
import battlearena.characters.Mage;
import battlearena.characters.Warrior;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GameTest {

    Fighter fighter = new Mage();

    @Test
    void shouldSetHpToZeroWhenHpIsNegative() {
        fighter.setHp(-5);
        fighter.isAlive();

        assertEquals(0, fighter.getHp());
    }

    @Test
    void shouldReturnWarriorWhenIndexIsZero() {
        List<Fighter> characters = new ArrayList<>();
        characters.add(new Warrior());
        characters.add(new Mage());
        characters.add(new Hunter());

        Fighter fighter = characters.get(0);

        assertEquals("Warrior", fighter.getCHARACTER_NAME());
    }
}

//Vad du bör göra
//Din rotmapp tests är nästan rätt idé. Gör så här:
//Högerklicka på den i IntelliJ > Mark Directory as > Test Sources Root. Då blir den grön.
//Flytta FighterTest och GameTest dit, under battlearena/characters och battlearena/game, och ändra deras package-rader så de matchar (package battlearena.characters;).
//Ta bort src/battlearena/tests.