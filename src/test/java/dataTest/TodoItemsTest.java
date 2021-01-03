package dataTest;

import data.People;
import model.Person;
import org.junit.Assert;
import org.junit.Test;

public class TodoItemsTest {
    @Test
    public void test_size(){
        People people = new People();
        int expected = 5;
        int actual = people.size();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test_findAll(){
        Person[] expected = new Person[1];
        Person[] actual = new Person[1];
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void test_findById(){
    }
    @Test
    public void addingPerson(){
    }
    @Test
    public void test_clear_true(){
        People p = new People();
        int expected = 0;
        p.clear();
        int actual = p.size();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void findByDoneStatus(boolean doneStatus){

    }
    @Test
    public void findByAssignee(int personId){

    }
    @Test
    public void findByAssignee(Person assignee){

    }
    @Test
    public void findUnassignedTodoItems(){

    }
}
