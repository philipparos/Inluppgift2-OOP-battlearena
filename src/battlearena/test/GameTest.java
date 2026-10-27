package battlearena.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GameTest {

    int hp;

    @Test
    void hpNeverNegative() {
        int hp = 10;
        int attack = 15;

        int result = hp - attack;

        assertEquals(0, result);

    }

}

//Vad du bör göra
//Din rotmapp tests är nästan rätt idé. Gör så här:
//Högerklicka på den i IntelliJ > Mark Directory as > Test Sources Root. Då blir den grön.
//Flytta FighterTest och GameTest dit, under battlearena/characters och battlearena/game, och ändra deras package-rader så de matchar (package battlearena.characters;).
//Ta bort src/battlearena/tests.