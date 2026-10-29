package battlearena.game;

import battlearena.characters.Fighter;

public class CPUPlayer extends Player {

   private static final String CPU_NAME_CONSTANT = "Computer";


    public CPUPlayer() {
        super(CPU_NAME_CONSTANT);

    }
    private int generateFighterNumber() {
        return (int)(Math.random() * 3) + 1;

    }
}
