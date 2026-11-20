package battlearena.game;

import battlearena.characters.Fighter;

public class BattlePrinter {

    public void printAttack (Fighter attacker, Fighter defender, int firstDamage) {
        System.out.println( "BATTLE PRINTER !!!! " + attacker.getFIGHTER_NAME() + " makes " + firstDamage + " damage!" + defender.getFIGHTER_NAME() + " has " + defender.getHp() + " hp");
    }

    public void printSecondAction (){
        // kolla om det är attack eller special action
    }

    public void printDeath(Fighter winner, Fighter loser) {
        System.out.println(loser.getFIGHTER_NAME() + " died!");
        System.out.println(winner.getFIGHTER_NAME() + " wins!");
    }
}
