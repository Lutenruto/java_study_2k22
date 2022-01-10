public class Movie{
    public String title;
    public int year;
    public int episodeNumber;
    public float cost;
    public float recipe;

    public Movie(String title, int year, int episodeNumber, float cost, float recipe){
        this.title = title;
        this.year = year;
        this.episodeNumber = episodeNumber;
        this.cost = cost;
        this.recipe = recipe;
    }

    public Movie(){
        this.title = new String();
        this.year = new Integer();
        this.episodeNumber = new Integer();
        this.cost = new Float();
        this.recipe = new Float();
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getEpisodeNumber() {
        return this.episodeNumber;
    }

    public void setEpisodeNumber(int episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    public float getCost() {
        return this.cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public float getRecipe() {
        return this.recipe;
    }

    public void setRecipe(float recipe) {
        this.recipe = recipe;
    }

    public String toString() {
        return "Movie | Title : " + this.title + ", Year : " + this.year + ", Episode number : " + this.episodeNumber + ", Cost : " + this.cost + ", Recipe : " + this.recipe;
    }

}