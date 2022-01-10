public class Actor{
    public String title;
    public int year;
    public int episodeNumber;
    public float cost;
    public float recipe;

    public Actor(String title, int year, int episodeNumber, float cost, float recipe){
        this.title = title;
        this.year = year;
        this.episodeNumber = episodeNumber;
        this.cost = cost;
        this.recipe = recipe;
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

}