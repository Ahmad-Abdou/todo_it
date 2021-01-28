package model;

import data.TodoSequencer;

import java.util.Objects;

public class Todo {
    final int todoId;
    String description;
    boolean done;
    Person assignee;

    public Todo(String description, boolean done, Person assignee) {
        this.todoId = TodoSequencer.nextPersonId2();
        this.description = description;
        this.done = done;
        this.assignee = assignee;
    }

    public Todo() {
        todoId = TodoSequencer.nextPersonId2();
    }

    public Todo(String description, boolean done) {
        this.description = description;
        this.done = done;
        todoId = TodoSequencer.nextPersonId2();
    }

    public int getTodoId() {
        return todoId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee) {
        this.assignee = assignee;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "todoId=" + todoId +
                ", description='" + description + '\'' +
                ", done=" + done +
                ", assignee=" + assignee +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Todo todo = (Todo) o;
        return todoId == todo.todoId && done == todo.done && Objects.equals(description, todo.description) && Objects.equals(assignee, todo.assignee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(todoId, description, done, assignee);
    }

}
