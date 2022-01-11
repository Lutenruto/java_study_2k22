package Classes;

import java.util.*;

public class Movie{
    private String title;
    private int year;
    private int episodeNumber;
    private float cost;
    private float revenue;
    private List<Actor> actors;

    public Movie(String title, int year, int episodeNumber, float cost, float revenue) {
        this.title = title;
        this.year = year;
        this.episodeNumber = episodeNumber;
        this.cost = cost;
        this.revenue = revenue;
    }

    public Movie(String title, int year, int episodeNumber, float cost, float revenue, List<Actor> actors) {
        this.title = title;
        this.year = year;
        this.episodeNumber = episodeNumber;
        this.cost = cost;
        this.revenue = revenue;
        this.actors = actors;
    }

//    public Movie(){
//        this.title = "";
//        this.year = new Integer();
//        this.episodeNumber = new Integer();
//        this.cost = new Float();
//        this.revenue = new Float();
//        this.actors = new List<Actor>;
//    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public void setEpisodeNumber(int episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public float getRevenue() {
        return revenue;
    }

    public void setRevenue(float revenue) {
        this.revenue = revenue;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    public int nbActeurs() {
        return this.actors.size();
    }

    public int nbPersonnages() {
        int nbPersonnages = 0;
        for (Actor acteur : this.actors) {
            nbPersonnages = nbPersonnages + acteur.getCharacters().size();
        }
        return nbPersonnages;
    }

    public void addActor (List<Actor> listeActeurs) {
        this.actors.addAll(listeActeurs);
    }

    public void addActor (Actor acteur) {
        this.actors.add(acteur);
    }

    public Map<String, Object> calculBenefice() {
        Map<String, Object> duetBenefice = new HashMap<String, Object>();

        long benefice = (long) (this.getRevenue() - this.getCost());
        if (benefice > 0) {
            duetBenefice.put("isBeneficiary", true);
            duetBenefice.put("Benefice", benefice);
        } else {
            duetBenefice.put("isBeneficiary", false);
            duetBenefice.put("Déficit", benefice);
        }
        return duetBenefice;
    }

    public List<String> getListActeursByName() {
        List<String> listActeursByName = new ArrayList<String>();
        actors.forEach((acteur) -> {
            listActeursByName.add(acteur.getFirstName() + " " + acteur.getLastName());
        });
        return listActeursByName;
    }

    public boolean isBefore(int annee) {
        return this.year < annee;
    }

    public void tri() {
        Comparator<Actor> alphabeticalComparator = new Comparator<Actor>() {
            public int compare(Actor o1, Actor o2) {
                String fullnameActor1 = o1.getFirstName() + " " + o1.getLastName();
                String fullnameActor2 = o2.getFirstName() + " " + o2.getLastName();
                return fullnameActor1.compareTo(fullnameActor2);
            }
        };
        this.actors.sort(alphabeticalComparator);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", episodeNumber=" + episodeNumber +
                ", cost=" + cost +
                ", revenue=" + revenue +
                ", actors=" + actors +
                '}';
    }

}