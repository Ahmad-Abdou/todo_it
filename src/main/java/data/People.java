package data;

import model.Person;

import java.util.Arrays;

public class People {
    private static Person[] person = new Person[0];


    public People() {
    }

    public int size() {

        return person.length;
    }

    public Person[] findAll() {

        return person;
    }

    public Person findById(int personId) {
        for (Person p2 : person) {
            if (personId == p2.getPersonId()) {
                return p2;
            }
        }
        return null;
    }

    public Person addingPerson(Person p2) {
        Person[] newarr = Arrays.copyOf(person, person.length + 1);
        newarr[newarr.length - 1] = p2;
        person = newarr;
        return p2;
    }
    public void clear (){

        person = new Person[0];
    }
}
