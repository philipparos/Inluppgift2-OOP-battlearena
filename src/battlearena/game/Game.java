package battlearena.game;

import battlearena.characters.Fighter;

import javax.print.attribute.standard.RequestingUserName;
import java.util.Random;

public class Game {
    private final Random randomObject = new Random();

    public int makeActions(Fighter fighterOne, Fighter fighterTwo){
        for(int turnCounter = 0; turnCounter <= 1; turnCounter++){

        }
        // ta in två fighters. rolla för actiontype, if-elsesats för o kolla vad det blev, utföra metoden
        //specialattack eller attack genom o kalla på den, ta reda på vad jag ens ska returnera i metoden


        return 0;
    }

    public actionTypes rollActionType(actionTypes actionType) {
        actionTypes[] actionsArray = actionTypes.values();
        return actionsArray[randomObject.nextInt(actionsArray.length)];
    }

    public void actionTypeRollChecker(actionTypes actionTypeRoll, Fighter fighter) {
        if(actionTypeRoll == actionTypes.ATTACK) {
          fighter.attackDamage();  //kalla på attackmetoden från fighter
        }
        else if(actionTypeRoll == actionTypes.SPECIAL){
            // kalla på specialmetoden från fighter
        }
    }


    //randomize attack
}
