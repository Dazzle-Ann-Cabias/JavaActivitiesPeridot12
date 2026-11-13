import java.util.Scanner;

public class ope {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        PokemonCARD[] pokemons = {
            new PokemonCARD("Pikachu", "HP 100 | Attack 90", "Class A"),
            new PokemonCARD("Charmander", "HP 90 | Attack 95", "Class B"),
            new PokemonCARD("Bulbasaur", "HP 110 | Attack 85", "Class C")
        };

        System.out.println("Choose your Pokemon:");
        System.out.println("1. Pikachu");
        System.out.println("2. Charmander");
        System.out.println("3. Bulbasaur");
        System.out.print("Which Pokemon would you like to have? ");

        int choice = input.nextInt();

        if (
            System.out.println("\nYou chose:");
        } else {
            System.out.println("Invalid choice. Please pick a number from 1 to 3.");
        }

        input.close();
    }