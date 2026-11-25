package battlearena.game;

import battlearena.characters.Fighter;

public class CPUPlayer extends Player {

    static final String CPU_NAME_CONSTANT = "Computer";

    public CPUPlayer(Fighter fighter) {
        super(CPU_NAME_CONSTANT, fighter);
    }
}



