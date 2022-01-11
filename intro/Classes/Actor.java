package Classes;

import java.util.List;

public class Actor{
    private String lastName;
    private String firstName;
    private List<Character> characters;

    public Actor(String lastName, String firstName, List<Character> characters) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.characters = characters;
    }

    public Actor(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

//    public Actor(){
//        this.lastName = "";
//        this.firstName = "";
//        this.characters = new Collection<Character>;
//    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public List<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(List<Character> characters) {
        this.characters = characters;
    }

    public int nbCharacters(){
        return this.characters.size();
    }

    public int nbPersonnages() {
        return this.characters.size();
    }

    @Override
    public String toString() {
        return "Actor{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", characters=" + characters +
                '}';
    }
}