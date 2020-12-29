package se.lexicon.AhmadAbdou;

import data.PersonSequencer;

public class App
{
    public static void main( String[] args )
    {
        System.out.println(PersonSequencer.nextPersonId(2));
        System.out.println(PersonSequencer.reset());

    }
}
