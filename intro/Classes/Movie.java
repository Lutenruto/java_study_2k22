package Classes;

import java.util.Collection;

public class Movie{
    private String title;
    private int year;
    private int episodeNumber;
    private float cost;
    private float revenue;
    private Collection<Actor> actors;

    public Movie(String title, int year, int episodeNumber, float cost, float revenue) {
        this.title = title;
        this.year = year;
        this.episodeNumber = episodeNumber;
        this.cost = cost;
        this.revenue = revenue;
    }

    public Movie(String title, int year, int episodeNumber, float cost, float revenue, Collection<Actor> actors) {
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
//        this.actors = new Collection<Actor>;
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

    public void setRecipe(float revenue) {
        this.revenue = revenue;
    }

    public Collection<Actor> getActors() {
        return actors;
    }

    public void setActors(Collection<Actor> actors) {
        this.actors = actors;
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