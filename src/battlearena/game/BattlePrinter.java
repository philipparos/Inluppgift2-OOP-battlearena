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
                + player.getFighter().getFIGHTER_NAME());
    }

    public void printBattleStart(Fighter player, Fighter cpuPlayer, boolean isPlayerTurn) {
        System.out.println(player.getFIGHTER_NAME() + " starts with " + player.getMaxHp() + " hp");
        System.out.println(cpuPlayer.getFIGHTER_NAME() + " starts with " + cpuPlayer.getMaxHp() + " hp");
        System.out.println((isPlayerTurn ? player.getFIGHTER_NAME() : cpuPlayer.getFIGHTER_NAME()) + " starts!");
        System.out.println("************************************");
    }


    public void printAttack(Fighter attacker, Fighter defender, int firstDamage) {
        System.out.println(
                        attacker.getFIGHTER_NAME()
                        + " makes "
                        + firstDamage
                        + " damage! "
                        + defender.getFIGHTER_NAME()
                        + " has "
                        + defender.getHp()
                        + " hp");
    }

    public void printSpecialAction(Fighter attacker, Fighter defender, int specialAbility) {
        System.out.println("\u001B[34m" + attacker.getSPECIAL_ATTACK_NAME() + " has been used!\u001B[0m");

        switch (attacker) {
            case Warrior warrior:
                System.out.println("\u001B[35m" +
                        warrior.getFIGHTER_NAME()
                                + " blocks "
                                + warrior.getDefendPercentage()
                                + " % incoming damage! "
                                + warrior.getFIGHTER_NAME()
                                + " has "
                                + warrior.getHp()
                                + "hp\u001B[0m");
                break;

            case Mage mage:
                if (specialAbility == 0) {
                    System.out.println(
                            mage.getFIGHTER_NAME()
                                    + " tried to heal but is already at full health!");
                } else {
                    System.out.println("\u001B[32m" +
                            mage.getFIGHTER_NAME()
                                    + " heals "
                                    + specialAbility
                                    + " hp! "
                                    + mage.getFIGHTER_NAME()
                                    + " has "
                                    + mage.getHp()
                                    + " hp\u001B[0m");
                }
                break;

            case Hunter hunter:
                System.out.println("\u001B[38;5;208m" +
                        hunter.getFIGHTER_NAME()
                                + " makes "
                                + specialAbility
                                + " damage! "
                                + defender.getFIGHTER_NAME()
                                + " has "
                                + defender.getHp()
                                + "hp\u001B[0m");
                break;

            default:
                System.out.println("Unexpected output");
        }

    }

    public void printResults(Fighter winner, Fighter loser) {
        System.out.println("=================================");
        System.out.println("\uD83D\uDC80 " + "\u001B[31m" + loser.getFIGHTER_NAME() + " died!\u001B[0m" + " \uD83D\uDC80" );
        System.out.println("\uD83C\uDF89 " + "\u001B[33m" + winner.getFIGHTER_NAME() + " wins!\u001B[0m" + " \uD83C\uDF89");
        System.out.println("=================================");
    }
}
