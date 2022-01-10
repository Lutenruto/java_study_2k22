import java.util.Scanner;
import java.util.*;
import Classes.*;

public class Main{

    ArrayList<Movie> listFilm = new ArrayList<Movie>();

    Scanner sc = new Scanner(System.in);

    Movie movie1 = new Movie("A new hope", 1977, 4, 10000000, 453000000);
    Movie movie2 = new Movie("The empire strikes back", 1980, 5, 15000000, 425000000);

    System.out.println("Veuillez saisir les informations du film que vous souhaitez rentrer");
    System.out.println("---");

    System.out.println("Titre :");
    String title = sc.nextLine();

    System.out.println("Année :");
    String year = sc.nextLine();

    System.out.println("Épisode numéro :");
    String episodeNumber = sc.nextLine();

    System.out.println("Coût :");
    String cost = sc.nextLine();

    System.out.println("Recette :");
    String recipe = sc.nextLine();

    Movie movie3 = new Movie(title, year, episodeNumber, cost, recipe);

    Character character1 = new Character("Skywalker", "Anakin");
    Character character2 = new Character("Skywalker", "Luke");
    Character character3 = new Character("Palpatine", "Sheev");

    listFilm.add(movie1,movie2,movie3);
    printAll(listFilm);

    public static void printAll(Movie[] all){
        for(int i = 0; i < all.length; i++ ){
            System.out.println(all[i]);
        }
    }
}