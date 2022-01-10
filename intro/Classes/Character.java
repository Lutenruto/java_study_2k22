package Classes;

public class Character{
    public String lastName;
    public String firstName;

    public Character(String lastName, String firstName){
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public Character(){
        this.lastName = new String();
        this.firstName = new String();
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

    public String toString() {
        return "Character | Last name : " + this.lastName + ", First name : " + this.firstName;
    }
}