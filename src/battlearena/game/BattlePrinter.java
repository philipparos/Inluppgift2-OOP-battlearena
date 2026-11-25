package battlearena.game;

import battlearena.characters.Fighter;
import battlearena.characters.Hunter;
import battlearena.characters.Mage;
import battlearena.characters.Warrior;

public class BattlePrinter {


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
        System.out.println(attacker.getSPECIAL_ATTACK_NAME() + " has been used! ");

        switch (attacker) {
            case Warrior warrior:
                System.out.println(
                        warrior.getFIGHTER_NAME()
                                + " blocks "
                                + warrior.getDefendPercentage()
                                + " % incoming damage! "
                                + warrior.getFIGHTER_NAME()
                                + " has "
                                + warrior.getHp()
                                + "hp");
                break;

            case Mage mage:
                if (specialAbility == 0) {
                    System.out.println(
                            mage.getFIGHTER_NAME()
                                    + " tried to heal but is already at full health!");
                } else {
                    System.out.println(
                            mage.getFIGHTER_NAME()
                                    + " heals "
                                    + specialAbility
                                    + " hp! "
                                    + mage.getFIGHTER_NAME()
                                    + " has "
                                    + mage.getHp()
                                    + " hp");
                }
                break;

            case Hunter hunter:
                System.out.println(
                        hunter.getFIGHTER_NAME()
                                + " makes "
                                + specialAbility
                                + " damage! "
                                + defender.getFIGHTER_NAME()
                                + " has "
                                + defender.getHp()
                                + "hp");
                break;

            default:
                System.out.println("Unexpected output");
        }
    }

    public String printResultClient(Player human, CPUPlayer CPU) { // heta printResult bara, döpa om printResult till matchConclusion
//        int round = 0;
//        int CpuWinCounter = 0;
//        int PlayerWinCounter = 0;
        String winAnnouncer;
        while (true) {
//            round++;
            if (human.getFighter().getHp() == 0) {
                winAnnouncer = CPU.getName();
//                CpuWinCounter++;
                break;
            } else {
                winAnnouncer = human.getName();
//                PlayerWinCounter++;
                break;
            }
        } return "Round" + "\n" + human + "\n" + CPU + "\n" + winAnnouncer + "won!\n Player win counter " +  "\n Computer win counter ";
    }

    public void printResults(Fighter winner, Fighter loser) {
        System.out.println(loser.getFIGHTER_NAME() + " died!");
        System.out.println(winner.getFIGHTER_NAME() + " wins!");
    }
}
