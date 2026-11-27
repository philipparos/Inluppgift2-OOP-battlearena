package battlearena.game;

import battlearena.serverclient.FileHandler;
import java.util.Scanner;
import java.util.regex.Pattern;

public class InputHandler {

    private final Scanner scanner;
    private final String nameRegex = "^(?!.* {2})[a-zA-ZåäöÅÄÖéÉ0-9 _\\-]{2,16}$";
    private final String menuNumberRegex = "^[1-3]$";
    String menuNumberInput;
    FileHandler fileHandler = new FileHandler();


    public InputHandler(Scanner scanner) {
        this.scanner = scanner;
    }

    public String askForName() {
        System.out.println("Write your name");
        while(true){
            String nameInput = scanner.nextLine().trim();
            if(nameInput.matches(nameRegex)){
                return nameInput;
        }
            System.out.println("Wrong input, try again!");
        }
    }

    public int menuNumberChoice() {
        System.out.println("Pick a fighter: ");
        while (true) {
            menuNumberInput = scanner.nextLine().trim();
            if (menuNumberInput.matches(menuNumberRegex)) {
                return Integer.parseInt(menuNumberInput);
            }
            System.out.println("You can only pick a character between 1-3!");
        }
    }

    public boolean menu(){
        while (true) {
            System.out.println("1. Play again?");
            System.out.println("2. Show match results");
            System.out.println("3. Quit?");
            String choice = scanner.nextLine().trim();
            switch (choice){
                case "1":
                    return true;
                case "2":
                    fileHandler.file();
                    break;
                case "3":
                    System.out.println("Bye!");
                    scanner.close();
                    return false;
                default:
                    System.out.println("Invalid input, please try again");
            }
        }
    }
}
