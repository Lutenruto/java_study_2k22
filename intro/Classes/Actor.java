package Classes;

import java.util.Collection;

public class Actor{
    private String lastName;
    private String firstName;
    private Collection<Character> characters;

    public Actor(String lastName, String firstName, Collection<Character> characters) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.characters = characters;
    }

    public Actor(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public Actor(){
        this.lastName = new String();
        this.firstName = new String();
        this.characters = new Collection<Character>;
    }

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

    public Collection<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(Collection<Character> characters) {
        this.characters = characters;
    }

    public int nbCharacters(){
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