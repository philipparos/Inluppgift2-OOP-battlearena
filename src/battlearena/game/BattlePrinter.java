package battlearena.game;

import battlearena.characters.Fighter;
import battlearena.characters.Hunter;
import battlearena.characters.Mage;
import battlearena.characters.Warrior;

public class BattlePrinter {

    public static void welcomeMessage() {
        System.out.println("\u001B[34m=================================");
        System.out.println("Welcome to the Battle Arena game");
        System.out.println("=================================\u001B[0m");
    }

    public void printFighterChoice(Player player){
        System.out.println(player.getName()
                + " picked "
                + player.getFighter().getFighterName());
    }

    public void printBattleStart(Fighter player, Fighter cpuPlayer, boolean isPlayerTurn) {
        System.out.println(player.getFighterName() + " starts with " + player.getMaxHp() + " hp");
        System.out.println(cpuPlayer.getFighterName() + " starts with " + cpuPlayer.getMaxHp() + " hp");
        System.out.println((isPlayerTurn ? player.getFighterName() : cpuPlayer.getFighterName()) + " starts!");
        printBlankLine();
        System.out.println("************************************");
        printBlankLine();
    }

    public void printBlankLine() {
        System.out.println();
    }


    public void printAttack(Fighter attacker, Fighter defender, int firstDamage) {
        System.out.println(
                        attacker.getFighterName()
                        + " makes "
                        + firstDamage
                        + " damage! "
                        + defender.getFighterName()
                        + " has "
                        + defender.getHp()
                        + " hp");
    }

    public void printSpecialAction(Fighter attacker, Fighter defender, int specialAbility) {
        System.out.println("\u001B[34m" + attacker.getSpecialActionName() + " has been used!\u001B[0m");

        switch (attacker) {
            case Warrior warrior:
                System.out.println("\u001B[35m" +
                        warrior.getFighterName()
                                + " blocks "
                                + warrior.getDefendPercentage()
                                + " % incoming damage! "
                                + warrior.getFighterName()
                                + " has "
                                + warrior.getHp()
                                + " hp\u001B[0m");
                break;

            case Mage mage:
                if (specialAbility == 0) {
                    System.out.println(
                            mage.getFighterName()
                                    + " tried to heal but is already at full health!");
                } else {
                    System.out.println("\u001B[32m" +
                            mage.getFighterName()
                                    + " heals "
                                    + specialAbility
                                    + " hp! "
                                    + mage.getFighterName()
                                    + " has "
                                    + mage.getHp()
                                    + " hp\u001B[0m");
                }
                break;

            case Hunter hunter:
                System.out.println("\u001B[38;5;208m" +
                        hunter.getFighterName()
                                + " makes "
                                + specialAbility
                                + " damage! "
                                + defender.getFighterName()
                                + " has "
                                + defender.getHp()
                                + " hp\u001B[0m");
                break;

            default:
                System.out.println("Unexpected output");
        }
    }

    public String resultClient(Player human, CPUPlayer CPU) {
        return human + "#" + CPU + "#";
    }

    public void matchConclusion(Fighter winner, Fighter loser) {
        System.out.println("=================================");
        System.out.println("\uD83D\uDC80 " + "\u001B[31m" + loser.getFighterName() + " died!\u001B[0m" + " \uD83D\uDC80" );
        System.out.println("\uD83C\uDF89 " + "\u001B[33m" + winner.getFighterName() + " wins!\u001B[0m" + " \uD83C\uDF89");
        System.out.println("================================="); // skriver till terminalen
    }
    public String buildMatchConclusion(Fighter winner, Fighter loser) {
        return winner.getFighterName() + " wins! #" + loser.getFighterName() + " died!";

    }
}


