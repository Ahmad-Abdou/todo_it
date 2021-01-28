package data;

import model.Person;

import java.util.ArrayList;
import java.util.List;

public class TodoItemsANDPeople {


    public List remove(int index) {
        Person p1 = new Person("Mehrdad","Javan");
        Person p2 = new Person("ahmad","abdou");
        Person p3 = new Person("Simon","Jackson");


        List<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        for(Person p : list){
            if(index == p.getPersonId()){
                list.remove(p);
            }
        }
             return list;
    }

}
