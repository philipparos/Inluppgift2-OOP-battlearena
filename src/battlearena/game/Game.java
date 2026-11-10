package battlearena.game;

import battlearena.characters.Fighter;
import battlearena.characters.Hunter;
import battlearena.characters.Mage;
import battlearena.characters.Warrior;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {
    private final Random randomObject = new Random();
//    Fighter player;
//    Fighter cpu;

    private List<Fighter> characters = new ArrayList<>();

    public void addCharacters() {
        characters.add(new Warrior());
        characters.add(new Mage());
        characters.add(new Hunter());
    }

    public ArrayList<Fighter> getFightersList() {
        return new ArrayList<Fighter>(characters);
    }

    public static List<Fighter> removePlayerChoice(List<Fighter> list, Fighter humanfighter) {
        for (Fighter fighter:  list) {
            if (humanfighter.equals(fighter)) {
                list.remove(fighter);
                return list;
            }
        }
        return null;

    }

    public List<Fighter> getCharacters() {
        return characters;
    }

    public void printCharacterName() {
        int counter = 1;
        for (Fighter fighter : characters) {
            System.out.println(counter + ". " + fighter.getCHARACTER_NAME());
            counter++;
        }
    }

    public void startBattle(Fighter player, Fighter cpu) {
        boolean isPlayerTurn = randomObject.nextBoolean(); // slumpar vem som börjar, vid true börjar spelaren

        while (player.isAlive() && cpu.isAlive()) { // så länge båda lever körs battle
            if (isPlayerTurn) { //true
                // första attacken
                int firstDamage = player.attackDamage();
                cpu.setHp(cpu.getHp() - firstDamage);
                System.out.println("Player makes " + firstDamage + " damage!");

                // andra attacken
                ActionTypes extraAction = rollActionType(null);// slumpar fram ATTACK eller SPECIAL, null eftersom metoden har parametrar

                if (extraAction == ActionTypes.ATTACK) {
                    int extraDamage = player.attackDamage();
                    cpu.setHp(cpu.getHp() - extraDamage);
                    System.out.println("Player makes " + extraDamage + " damage!");
                } else {
                    int specialDamage = player.specialAttack();
                    cpu.setHp(cpu.getHp() - specialDamage);
                    System.out.println("Player makes " + specialDamage + " damage!");
                }
                // behövs kanske läggas i en metod för att inte behöva upprepa för datorns tur.

                // om vi ska ha en utskrift för specialattack kommer vi behöva en if-sats eller liknande för att kunna kolla
                // vilken specialattack i koppling till vilken karaktär. alla specialattacker gör ju inte damage
                // eventuellt får vi bryta ut dom och skapa en tredje handling??
                // attack är ju alltid attack men specialattack kan ju vara 3 olika
                // vi får nog kika på metoderna i subklasserna ev lägga till
                // annan tanke vore om vi har kvar ATTACK och SPECIAL som enums och lägger till en tredje handling
                // ev en metod i varje subklass
                // interfacet håller ju metoder men man kanske även behöver ha egna metoder för heal, defend osv

            } else {
                // datorns tur
                int cpuDamage = cpu.attackDamage();
                player.setHp(player.getHp() - cpuDamage);

                System.out.println("The computer makes " + cpuDamage + " damage");
            }
            isPlayerTurn = !isPlayerTurn;
        }
    }

    public int makeActions(Fighter fighterOne, Fighter fighterTwo){
        for(int turnCounter = 0; turnCounter <= 1; turnCounter++){

        }
        // ta in två fighters. rolla för actiontype, if-elsesats för o kolla vad det blev, utföra metoden
        //specialattack eller attack genom o kalla på den, ta reda på vad jag ens ska returnera i metoden


        return 0;
    }

    public ActionTypes rollActionType(ActionTypes actionType) {
        ActionTypes[] actionsArray = ActionTypes.values();
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


    //randomize attack
}
