package se.lexicon.AhmadAbdou;

import data.People;
import data.PersonSequencer;
import data.TodoItems;
import model.Person;
import model.Todo;

import java.util.Arrays;

public class App
{
    public static void main( String[] args )
    {

        People p  = new People();
        Person p1 = new Person("Mehrdad","Javan");
        Person p2 = new Person("ahmad","abdou");
        Person p3 = new Person("Simon","Jackson");
        p.addingPerson(p1);
        p.addingPerson(p2);
        p.addingPerson(p3);
        System.out.println("Size "+p.size());
        System.out.println("Find by ID "+p.findById(1));
        System.out.println("Find All "+p.findAll());
        System.out.println("Next person ID "+PersonSequencer.nextPersonId());
        System.out.println("Size after Reset "+PersonSequencer.reset());

        System.out.println("--------------------------------------------------------");
        TodoItems todoitems = new TodoItems();
        Todo todo1 = new Todo("Banana",true,p1);
        Todo todo2 = new Todo("Apple",false,p2);
        Todo todo3 = new Todo("Orange",true,p3);
        Todo todo4 = new Todo("Carrot",false);
        todoitems.addingTodo(todo1);
        todoitems.addingTodo(todo2);
        todoitems.addingTodo(todo3);
        todoitems.addingTodo(todo4);
        System.out.println("Size "+todoitems.size());
        System.out.println("Find by ID "+todoitems.findById(1));
        System.out.println("Find All "+todoitems.findAll());
        System.out.println("Finding by status "+ todoitems.findByDoneStatus(true));
        System.out.println("Find by assignee todoID "+ todoitems.findByAssignee(1));
        System.out.println("Find by assignee Person "+ todoitems.findByAssignee(p2));
        System.out.println("Find by unassigned Person "+ todoitems.findUnassignedTodoItems());


    }
}
