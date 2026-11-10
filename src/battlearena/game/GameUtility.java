package battlearena.game;

import battlearena.characters.Fighter;

import java.util.Random;

public class GameUtility {

    public static void welcomeMessage() {
        System.out.println("Welcome to the Battle Arena game"); // skriver ut detta i början av programmet
    }

    public void firstAttack(Fighter attacker, Fighter defender) {
        int firstDamage = attacker.attackDamage();
        defender.setHp(defender.getHp() - firstDamage);
        System.out.println(attacker.getCHARACTER_NAME() + " makes " + firstDamage + " damage!");
        System.out.println(defender.getCHARACTER_NAME() + " has " + defender.getHp() + " hp");
    }

    public void secondAction(Fighter attacker, Fighter defender) {
        ActionTypes extraAction = rollActionType(null);// slumpar fram ATTACK eller SPECIAL, null eftersom metoden har parametrar

        if (extraAction == ActionTypes.ATTACK) {
            int extraDamage = attacker.attackDamage();
            defender.setHp(defender.getHp() - extraDamage);
            System.out.println("Player makes " + extraDamage + " damage!");
        } else {
            int specialDamage = attacker.specialAttack();
            defender.setHp(defender.getHp() - specialDamage);
            System.out.println("Player makes " + specialDamage + " damage!");
        }
    }

    public ActionTypes rollActionType(ActionTypes actionType) {
        ActionTypes[] actionsArray = ActionTypes.values();
        Random randomObject = new Random();
        return actionsArray[randomObject.nextInt(actionsArray.length)];
    }

    public void actionTypeRollChecker(ActionTypes actionTypeRoll, Fighter fighter) {
        if(actionTypeRoll == ActionTypes.ATTACK) {
            fighter.attackDamageRoll();//kalla på attackmetoden från fighter
        }
        else if(actionTypeRoll == ActionTypes.SPECIAL){
            // kalla på specialmetoden från fighter
        }
    }
}
