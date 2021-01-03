package data;

import model.Person;
import model.Todo;

import java.util.Arrays;

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
    public Todo[] findByDoneStatus(boolean doneStatus){
        Todo [] trueArr = new Todo[2];
        Todo trueOutput = new Todo();
        trueArr[0] = new Todo(1 , "done");
        trueArr[1] = new Todo(2 , "done");

        Todo [] falseArr = new Todo[2];
        Todo falseOutput = new Todo();
        falseArr[0] = new Todo(1,"Not done");
        falseArr[0] = new Todo(2,"Not done");

            if(doneStatus == true){
                for(int i = 0 ; i < trueArr.length; i++){
                    trueOutput =  trueArr[i];
                }
            return trueArr;
        }
        else if(doneStatus == false){
                for(int i = 0 ; i < falseArr.length; i++){
                    falseOutput =  falseArr[i];
                }
            return falseArr;
        }

        return  falseArr;
    }
    public Todo[] findByAssignee(int personId)   {

        return new Todo[0];
    }

    public Todo[] findByAssignee(Person assignee){

        return new Todo[0];
    }
    public Todo[] findUnassignedTodoItems(){

        return new Todo[0];
    }




}
