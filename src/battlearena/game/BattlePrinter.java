package battlearena.game;

import battlearena.characters.Fighter;
import battlearena.characters.Hunter;
import battlearena.characters.Mage;
import battlearena.characters.Warrior;

public class BattlePrinter {


    public void printAttack (Fighter attacker, Fighter defender, int firstDamage) {
        System.out.println( "BATTLE PRINTER !!!! " + attacker.getFIGHTER_NAME() + " makes " + firstDamage + " damage!" + defender.getFIGHTER_NAME() + " has " + defender.getHp() + " hp");
    }

    public void printSpecialAction(Fighter attacker, Fighter defender, int specialAmount) {
        switch (attacker) {
            case Warrior warrior:
                System.out.println(getSPECIAL_ATTACK_NAME() + " has been used!");
                System.out.println("nånting annar");
                break;

            case Mage mage:
                System.out.println(getSPECIAL_ATTACK_NAME() + " has been used!");
                System.out.println(" sno från fighgerchecker");
                break;

            case Hunter hunter:
                System.out.println(getSPECIAL_ATTACK_NAME() + " has been used!");
                System.out.println(" sno från fighgerchecker");
                break;

                default:
                    System.out.println("Unexpected output");
        }

    }

    public void printMageSpecial (){
        //System.out.println(getSPECIAL_ATTACK_NAME() + " has been used!");
        System.out.println();
    }

    public void printHunterSpecial(){
        System.out.println();
    }
    public void printWarriorSpecial(){
        System.out.println();
    }

    public void printResults(Fighter winner, Fighter loser) {
        System.out.println(loser.getFIGHTER_NAME() + " died!");
        System.out.println(winner.getFIGHTER_NAME() + " wins!");
    }
}
