package battlearena.game;

import battlearena.characters.Fighter;
import battlearena.characters.Hunter;
import battlearena.characters.Mage;
import battlearena.characters.Warrior;

import java.util.Random;

public class GameUtility {
    BattlePrinter battlePrinter = new BattlePrinter();

    public static void welcomeMessage() {
        System.out.println("Welcome to the Battle Arena game"); // skriver ut detta i början av programmet
    }

    public int firstAttack(Fighter attacker, Fighter defender) {
        int firstDamage = attacker.actualAttackDamage(defender);
        defender.setHp(defender.getHp() - firstDamage);
        return firstDamage;
    }
        //System.out.println(attacker.getFIGHTER_NAME() + " makes " + firstDamage + " damage!" + defender.getFIGHTER_NAME() + " has " + defender.getHp() + " hp" );

    public int secondAction(Fighter attacker, Fighter defender) {
        ActionTypes extraAction = rollActionType(null);// slumpar fram ATTACK eller SPECIAL, null eftersom metoden har parametrar

        if (extraAction == ActionTypes.ATTACK) {
            int extraDamage = attacker.actualAttackDamage(defender);
            defender.setHp(defender.getHp() - extraDamage);
            battlePrinter.printAttack(attacker, defender, extraDamage);
            return extraDamage;

        } else {
            fighterChecker(attacker, defender);
        }
        return 0;
    }

    public ActionTypes rollActionType(ActionTypes actionType) {
        ActionTypes[] actionsArray = ActionTypes.values();
        Random randomObject = new Random();
        return actionsArray[randomObject.nextInt(actionsArray.length)];
    }

    public void actionTypeRollChecker(ActionTypes actionTypeRoll, Fighter fighter) {
        if (actionTypeRoll == ActionTypes.ATTACK) {
            fighter.attackDamageRoll();//kalla på attackmetoden från fighter
        } else if (actionTypeRoll == ActionTypes.SPECIAL) {
            // kalla på specialmetoden från fighter
        }
    }

    public void fighterChecker(Fighter fighter, Fighter defender) {
        int specialAbility = 0;
        switch (fighter) {
            case Warrior warrior:
                warrior.defendPercentageCalculator();
                System.out.println(fighter.getFIGHTER_NAME() + " blocks " + specialAbility + " damage!");
                break;

            case Mage mage:
                specialAbility =  mage.heal();
                mage.setHp(mage.getHp() + specialAbility);
                System.out.println(fighter.getFIGHTER_NAME() + " heals " + specialAbility + " HP!");
                break;

            case Hunter hunter:
                specialAbility = hunter.actualSpecialDamage(defender);
                defender.setHp(defender.getHp() - specialAbility);
                System.out.println(fighter.getFIGHTER_NAME() + " makes " + specialAbility + " damage!");
                break;

            default:
                System.out.println("Unexpected output");
        }
    }
}