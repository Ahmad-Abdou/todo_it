package data;

import model.Person;

public class TodoItems {
    private static Person[]  person = new Person [2];

    public TodoItems() {
    }

    public int size(){
        int arr []= new int [5];
        int length = arr.length;
        return length;
    }
    public Person[] findAll(){
        Person [] person2 = new Person[1];
        return person2;
    }
    public Person findById(int personId){
        Person p = new Person();
        Person[] personarr = new Person[2];
        personarr[0] = new Person(1, "Simon","carlsson");
        personarr[1] = new Person(2, "Jim","jimsson");

        if(personId == 1){
            p = personarr[0];

        }
        else if(personId == 2){
            p = personarr[1];
        }
        return p;
    }
    public Person addingPerson(Person p2){

        return p2;
    }
    public void clear (){


    }

}
