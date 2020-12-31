package se.lexicon.AhmadAbdou;

import data.People;
import data.PersonSequencer;
import model.Person;

public class App
{
    public static void main( String[] args )
    {
        System.out.println(PersonSequencer.nextPersonId(2));
        System.out.println(PersonSequencer.reset());
        People people = new People();
        int arr [] = {1,3,5,7,9};
        System.out.println(people.size());
        System.out.println(people.findById(1));




    }
}
