package Console;

import java.io.Console;
public class ConsolePassword {

    public void passwordExample() {        
        Console console = System.console();
        if (console == null) {
            System.out.println("Couldn't get Console instance");
            System.exit(0);
        }

        console.printf("Testing password%n");
        char[] passwordArray = console.readPassword("Enter your secret password: ");
        char[] secondPasswordArray = console.readPassword("Enter your secret password again: ");
        
        if((new String(passwordArray)).equals(new String(secondPasswordArray))) {
            System.out.println("ingreso la contrase�a de forma correcta");
        }else {
            System.err.println("error! debe coincidir las contrase�as");
        }
        

    }

    public static void main(String[] args) {
        new ConsolePassword().passwordExample();
    }
}