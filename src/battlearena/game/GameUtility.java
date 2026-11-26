package battlearena.game;

import battlearena.characters.Fighter;
import battlearena.characters.Hunter;
import battlearena.characters.Mage;
import battlearena.characters.Warrior;

import java.util.Random;

public class GameUtility {
    BattlePrinter battlePrinter = new BattlePrinter();

    public void firstAttack(Fighter attacker, Fighter defender) {
        int firstDamageRoll = attacker.attackDamageRoll();
        defender.takeDamage(firstDamageRoll);
        battlePrinter.printAttack(attacker, defender, firstDamageRoll);
    }

    public void secondAction(Fighter attacker, Fighter defender) {
        ActionTypes extraAction = rollActionType(null);// slumpar fram ATTACK eller SPECIAL, null eftersom metoden har parametrar

        if (extraAction == ActionTypes.ATTACK) {
            int extraDamageRoll = attacker.attackDamageRoll();
            defender.takeDamage(extraDamageRoll);
            battlePrinter.printAttack(attacker, defender, extraDamageRoll);
        } else {
            fighterChecker(attacker, defender);
        }
    }

    public ActionTypes rollActionType(ActionTypes actionType) {
        ActionTypes[] actionsArray = ActionTypes.values();
        Random randomObject = new Random();
        return actionsArray[randomObject.nextInt(actionsArray.length)];
    }

    public void fighterChecker(Fighter fighter, Fighter defender) {
        int specialAbility = 0;
        switch (fighter) {
            case Warrior warrior:
                warrior.useSpecialAction();
                battlePrinter.printSpecialAction(fighter, defender, warrior.getDefendPercentage());
                break;

            case Mage mage:
                specialAbility = mage.heal();
                mage.setHp(mage.getHp() + specialAbility);
                battlePrinter.printSpecialAction(fighter, defender, specialAbility);
                break;

            case Hunter hunter:
                specialAbility = hunter.actualSpecialDamage(defender);
                defender.takeDamage(specialAbility);
                battlePrinter.printSpecialAction(fighter, defender, specialAbility);
                break;

            default:
                System.out.println("Unexpected output");
        }
    }
}