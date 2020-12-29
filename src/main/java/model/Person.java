package model;

public class Person {
    final int personId;
    String firstName;
    String LastName;

    public Person(int personId, String firstName, String lastName) {
        this.personId = personId;
        this.firstName = firstName;
        LastName = lastName;
    }

    public int getPersonId() {
        return personId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }
}
