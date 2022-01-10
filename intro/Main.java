import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;

import Classes.*;

public class Main{

    public static void printAllMovies(Collection<Movie> movies){
        movies.forEach(System.out::println);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Movie movie1 = new Movie("A new hope", 1977, 4, 10000000, 453000000);
        Movie movie2 = new Movie("The empire strikes back", 1980, 5, 15000000, 425000000);

        System.out.println("Veuillez saisir les informations du film que vous souhaitez rentrer");
        System.out.println("---");

        System.out.println("Titre :");
        String title = sc.nextLine();

        System.out.println("Année :");
        String year = sc.nextLine();

        System.out.println("N° épisode :");
        String episodeNumber = sc.nextLine();

        System.out.println("Coût :");
        String cost = sc.nextLine();

        System.out.println("Recette :");
        String recipe = sc.nextLine();

        Movie movie3 = new Movie(title, Integer.parseInt(year), Integer.parseInt(episodeNumber), Float.parseFloat(cost), Float.parseFloat(recipe));

        Actor actor1 = new Actor("Christensen", "Hayden");
        Actor actor2 = new Actor("Hamill", "Mark");
        Actor actor3 = new Actor("McDiarmid", "Ian");

        Collection<Character> characters = new ArrayList<Character>();

        Character character1 = new Character("Skywalker", "Anakin");
        Character character2 = new Character("Skywalker", "Luke");
        Character character3 = new Character("Palpatine", "Sheev");

        characters.add(character1);
        characters.add(character2);
        characters.add(character3);

        actor1.setCharacters(character1);
        actor2.setCharacters(character2);
        actor3.setCharacters(character3);

        Collection<Actor> actors = new ArrayList<Actor>();
        actors.add(actor1);

        movie1.setActors(actors);
        movie2.setActors(actors);
        movie3.setActors(actors);

        Collection<Movie> listFilm = new ArrayList<Movie>();
        listFilm.add(movie1);
        listFilm.add(movie2);
        listFilm.add(movie3);

        printAllMovies(listFilm);
    }

}