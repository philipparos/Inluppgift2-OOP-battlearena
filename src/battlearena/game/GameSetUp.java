package battlearena.game;

import battlearena.characters.Fighter;

import java.util.List;
import java.util.Random;


public class GameSetUp {

    Player player;
    CPUPlayer CPUPlayer;
    ListHandler listHandler = new ListHandler();

    private Fighter chosenPlayerFighter;

    public ListHandler getListHandler() {
        return listHandler;
    }

    public Player createPlayer(InputHandler inputHandler, ListHandler listHandler) {
        String name = inputHandler.askForName();
        listHandler.printFighterTypes();
        int choice = inputHandler.menuNumberChoice();

        Fighter chosenPlayerFighter = listHandler.getFighters().get(choice - 1);
        setChosenPlayerFighter(chosenPlayerFighter);

        return new Player(name, chosenPlayerFighter);

    }


    public void setChosenPlayerFighter(Fighter chosenPlayerFighter) {
        this.chosenPlayerFighter = chosenPlayerFighter;
    }

    public CPUPlayer createCPUPlayer(ListHandler listHandler) {
        List<Fighter> copiedList = listHandler.availableFighters();
        List<Fighter> shorterList = listHandler.removePlayerChoice(copiedList,chosenPlayerFighter);

        Random random = new Random();
        int randomIndex = random.nextInt(shorterList.size());
        Fighter CPUfighter = shorterList.get(randomIndex);
        return new CPUPlayer(CPUfighter);


    }

 //System.out.println(player.getName() + " picked " + player.getFighter().getFIGHTER_NAME());
}

