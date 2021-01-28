package data;

import model.Person;
import model.Todo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TodoItems {
    private static Todo[] todo = new Todo[0];

    public TodoItems() {
    }


    public int size() {
        return todo.length;
    }

    public Todo[] findAll() {

        return todo;
    }

    public Todo findById(int todoId) {
        for (Todo done : todo) {
            if (todoId == done.getTodoId()) {
                return done;
            }
        }
        return null;
    }

    public Todo addingTodo(Todo to2) {
        Todo[] todoarr = Arrays.copyOf(todo, todo.length + 1);
        todoarr[todoarr.length - 1] = to2;
        todo = todoarr;
        return to2;
    }

    public void clear() {
        todo = new Todo[0];
    }

    public List<Todo> findByDoneStatus(boolean doneStatus) {
        List<Todo> todos = new ArrayList<>();
        for (Todo done : todo) {
            if (doneStatus == done.isDone()) {
                todos.add(done);
            }
        }
        return todos;

    }

    public List<Todo> findByAssignee(int todoId) {
        List<Todo> todos = new ArrayList<>();
        for (Todo done : todo) {
            if (todoId == done.getTodoId()) {
                todos.add(done);
            }
        }
        return todos;
    }

    public List<Todo> findByAssignee(Person assignee) {
        List<Todo> todos = new ArrayList<>();
        for (Todo done : todo) {
            if (assignee == done.getAssignee()) {
                todos.add(done);
            }
        }
        return todos;
    }

    public List<Todo> findUnassignedTodoItems() {
        List<Todo> todos = new ArrayList<>();
        for (Todo done : todo) {
            if (done.getAssignee() == null) {
                todos.add(done);
            }
        }
        return todos;
    }

}
