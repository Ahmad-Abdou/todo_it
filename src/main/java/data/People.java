package data;

import model.Person;

import java.util.Arrays;

public class People {
    private static Person []  person = new Person [2];

    public People() {
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

          if(personId==1){
              return  personarr[0];
          }
        if(personId==2){
            return personarr[1];
        }

      return p;
    }
    public Person addingPerson(Person p2){

        return p2;
    }
    public void clear (){


    }
}
