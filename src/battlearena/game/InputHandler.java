package battlearena.game;

import battlearena.characters.Fighter;
import battlearena.characters.Hunter;
import battlearena.characters.Mage;
import battlearena.characters.Warrior;

import java.util.Scanner;

public class InputHandler {
    private final Scanner scanner;
    String menuNumberInput;

    public InputHandler(Scanner scanner) {
        this.scanner = scanner;
    }

    public String askForName() {
        System.out.println("Write your name");
        while(true){
            String nameInput = scanner.nextLine().trim();
            if(nameInput.matches("^(?!.* {2})[a-zA-ZåäöÅÄÖéÉ0-9 _\\-]{2,16}$")) {
                return nameInput;
        }
            System.out.println("Wrong input, try again!");
        }
    }

    public int menuNumberChoice() {
        System.out.println("Pick a fighter: ");// behöver skriva ut listan
        while (true) {
            menuNumberInput = scanner.nextLine().trim();
            if (menuNumberInput.matches("[1-3]")) {
                return Integer.parseInt(menuNumberInput);
            }
            System.out.println("You can only pick a character between 1-3!");
        }
    }

    public boolean askToPlayAgain() {
        while(true) {
            System.out.println("Play again? (y/n)");
            String answer = scanner.nextLine().trim();
            if (answer.equalsIgnoreCase("y")) {
                return true;
            }
            if (answer.equalsIgnoreCase("n")) {
                return false;
            }
            System.out.println("Invalid input");
        }
    }
}
