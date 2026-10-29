package battlearena;

import battlearena.game.InputHandler;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        InputHandler inputHandler = new InputHandler(new Scanner(System.in));
        String namn = inputHandler.askForName();

        int siffra = inputHandler.menuNumberChoice();
        System.out.println(siffra);
    }

    //whileloop-metod för running program?

}
