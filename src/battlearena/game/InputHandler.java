package battlearena.game;

import battlearena.characters.Fighter;
import battlearena.characters.Hunter;
import battlearena.characters.Mage;
import battlearena.characters.Warrior;

import java.util.Scanner;

public class InputHandler {
    private Scanner scanner;

    public InputHandler() {
        this.scanner = new Scanner(System.in);
    }

    public String showMenu() {
        System.out.println("Welcome to the Battle Arena game");
        String name = askForName();
        int figherChoice = chooseFighter();
        return figherChoice + "," + name;
    }

    public void inputSplit(){

    }

    public String askForName() {
        System.out.println("Write your name");
        String name = scanner.nextLine();
        return name;
    }

    public Fighter chooseFighter() {
        System.out.println("Choose your fighter");
        int fighter = scanner.nextInt();

        switch (fighter) {
            case 1 -> {
                Fighter warrior = new Warrior();
                return warrior;
            }
            case 2 -> {
                Fighter mage = new Mage();
                return mage;
            }
            case 3 -> {
                Fighter hunter = new Hunter();
                return hunter;
            }
            default -> {
                System.out.println("Invalid choice");
                return null;
            }
        }
    }
}
