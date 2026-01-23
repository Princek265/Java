import java.util.Scanner;
@SuppressWarnings("unused")

public class Game{
    public static void main(String args[]){

        // MAD LIBS GAME

        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print("Enter an adjective (decription): ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter a noun (animal oe person): ");
        noun1 = scanner.nextLine();
        System.out.print("Enter an adjective (decription): ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter a verb end with -ing (action): ");
        verb1 = scanner.nextLine();
        System.out.print("Enter an adjective (decription): ");
        adjective3 = scanner.nextLine();


        System.out.println("Today I went to a " + adjective1 + " zoo.");
        System.out.println("In an exhibit, I saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I was " + adjective3 + "!");
    }
}