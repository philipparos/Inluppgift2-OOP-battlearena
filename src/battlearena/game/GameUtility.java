package battlearena.game;

import battlearena.characters.Fighter;
import battlearena.characters.Hunter;
import battlearena.characters.Mage;
import battlearena.characters.Warrior;

import java.util.Random;

public class GameUtility {
    BattlePrinter battlePrinter = new BattlePrinter();

    public int firstAttack(Fighter attacker, Fighter defender) {
        int firstDamageRoll = attacker.attackDamageRoll();
        return defender.takeDamage(firstDamageRoll);
    }

    public int secondAction(Fighter attacker, Fighter defender) {
        ActionTypes extraAction = rollActionType(null);// slumpar fram ATTACK eller SPECIAL, null eftersom metoden har parametrar

        if (extraAction == ActionTypes.ATTACK) {
            int extraDamageRoll = attacker.attackDamageRoll();
            return defender.takeDamage(defender.getHp() - extraDamageRoll);
        } else {
            return fighterChecker(attacker, defender);
        }
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
        }
    }

    public int fighterChecker(Fighter fighter, Fighter defender) {
        int specialAbility = 0;
        switch (fighter) {
            case Warrior warrior:
                warrior.useSpecialAction();
                battlePrinter.printSpecialAction(fighter, defender, warrior.getDefendPercentage());
                return warrior.getDefendPercentage();

            case Mage mage:
                specialAbility = mage.heal();
                mage.setHp(mage.getHp() + specialAbility);
                battlePrinter.printSpecialAction(fighter, defender, specialAbility);
                return specialAbility;

            case Hunter hunter:
                specialAbility = hunter.actualSpecialDamage(defender);
                defender.takeDamage(defender.getHp() - specialAbility);
                battlePrinter.printSpecialAction(fighter, defender, specialAbility);
                return specialAbility;

            default:
                System.out.println("Unexpected output");
        }
        return specialAbility;
    }
}