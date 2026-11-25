package battlearena.test;

import battlearena.characters.Fighter;
import battlearena.characters.Hunter;
import battlearena.characters.Mage;
import battlearena.characters.Warrior;
import battlearena.game.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PlayerTest {

    //TDD

    Player player;
    Player playerCreator;
    Fighter warrior = new Warrior();
    Fighter mage = new Mage();
    Fighter hunter = new Hunter();

    @BeforeEach
        void setUP() {
        playerCreator = new Player();
    }

    @Test
    void shouldCreatePlayer(){
        Player player = new Player("Leifi", hunter);

        assertNotNull(player);
    }

    @Test
    void shouldCreatePlayerWithName(){
        Player player = new Player("Kurtan", mage);

        assertEquals("Kurtan", player.getName());
    }

    @Test
    void shouldCreatePlayerWithFighter(){
        Player player = new Player("Olof Palme", warrior);

        assertEquals("Warrior", player.getFighter().getFIGHTER_NAME());
        assertEquals("Olof Palme", player.getName());
    }
}
