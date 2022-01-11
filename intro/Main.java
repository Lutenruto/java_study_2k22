import java.util.*;

import Classes.Actor;
import Classes.Movie;
import Classes.Character;

public class Main{

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
        String revenue = sc.nextLine();

        Movie movie3 = new Movie(title, Integer.parseInt(year), Integer.parseInt(episodeNumber), Float.parseFloat(cost), Float.parseFloat(revenue));

        List<Movie> trilogie = new ArrayList<Movie>(Arrays.asList(movie1, movie2, movie3));

        afficherInformationsTrilogie(trilogie);

        Character padmeAmidala = new Character("Padmé", "Amidala");
        Actor nataliePortman = new Actor("Natalie", "Portman", new ArrayList<Character>(Arrays.asList(padmeAmidala)));

        Character hanSolo = new Character("Han", "Solo");
        Character indianaJones = new Character("Indiana", "Jones");
        List<Character> personnagesHarrisonFord = new ArrayList<Character>();
        personnagesHarrisonFord.add(hanSolo);
        personnagesHarrisonFord.add(indianaJones);
        Actor harrisonFord = new Actor("Harrison", "Ford", personnagesHarrisonFord);
        System.out.println("Le nombre de personnage incarnés par " + harrisonFord.getFirstName() + " " + harrisonFord.getLastName() + " est de : " + harrisonFord.nbPersonnages());

        movie1.addActor(harrisonFord);
        movie1.addActor(nataliePortman);
        movie1.tri();
        System.out.println("Liste des acteurs après tri" + movie1.getListActeursByName());

        Map<Integer, Movie> dicoFilms = new HashMap<Integer, Movie>();
        for (Movie film : trilogie) {
            dicoFilms.put(film.getYear(), film);
        }
        makeBackUp(dicoFilms);

    }

    public static void afficherInformationsTrilogie(List<Movie> trilogie) {
        for (Movie film : trilogie) {
            System.out.println(film.toString());
        }
    }

    public static void makeBackUp (Map<Integer, Movie> dictionnaireFilms) {
        for (Map.Entry<Integer, Movie> entry : dictionnaireFilms.entrySet()) {
            if (entry.getValue().calculBenefice().get("isBeneficiary").equals(true)) {
                System.out.println(entry.getKey() + " - " + entry.getValue().getTitle() + " - " + entry.getValue().calculBenefice().get("Benefice"));
            } else {
                System.out.println(entry.getKey() + " - " + entry.getValue().getTitle() + " - " + entry.getValue().calculBenefice().get("Déficit"));
            }
        }
    }

}