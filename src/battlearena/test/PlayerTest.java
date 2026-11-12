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
        player = playerCreator.createPlayer("Leifi", hunter);

        assertNotNull(player);
    }

    @Test
    void shouldCreatePlayerWithName(){
        player = playerCreator.createPlayer("Kurtan", mage);

        assertEquals("Kurtan", player.getName());
    }

    @Test
    void shouldCreatePlayerWithFighter(){
        player = playerCreator.createPlayer("Olof Palme", warrior);

        assertEquals("Warrior", player.getFighter().getCHARACTER_NAME());
        assertEquals("Olof Palme", player.getName());
    }
}
