package model;

import data.PersonSequencer;

import java.util.Objects;

public class Person {
    final int personId;
    String firstName;
    String LastName;


    public Person(String firstName, String lastName) {
        this.personId = PersonSequencer.nextPersonId();
        this.firstName = firstName;
        this.LastName = lastName;
    }

    public Person() {
        personId = PersonSequencer.nextPersonId();
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

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return personId == person.personId && Objects.equals(firstName, person.firstName) && Objects.equals(LastName, person.LastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personId, firstName, LastName);
    }
}
