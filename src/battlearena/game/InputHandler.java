package battlearena.game;

import battlearena.characters.Fighter;
import battlearena.characters.Hunter;
import battlearena.characters.Mage;
import battlearena.characters.Warrior;

import java.util.Scanner;

public class InputHandler {
    private final Scanner scanner;

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

    public Fighter menuNumberChoice() {
        System.out.println("Pick a fighter: ");// behöver skriva ut listan
        while(true){
            String menuNumberInput = scanner.nextLine().trim();
            if(menuNumberInput.matches("[1-3]")) {
                return ListHandler.characters.get(Integer.parseInt(menuNumberInput) -1);
            }
            System.out.println("You can only pick a character between 1-3!");
        }
    }

    public Fighter chooseFighter() {
        System.out.println("Choose your fighter");
        int fighter = scanner.nextInt();

        switch (fighter) {
            case 1 -> {
                return new Warrior();
            }
            case 2 -> {
                return new Mage();
            }
            case 3 -> {
                return new Hunter();
            }
            default -> {
                System.out.println("Invalid choice");
                return null;
            }
        }
    }
}
