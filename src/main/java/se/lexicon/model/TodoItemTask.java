package se.lexicon.model;

public class TodoItemTask {

    private int id;

    private boolean assigned;

    private TodoItem todoItem;

    private Person assignee;

    public TodoItemTask(int id, TodoItem todoItem, Person assignee) {
        if (todoItem == null) {
            throw new IllegalArgumentException("TodoItem cannot be null");
        }

        this.id = id;
        this.todoItem = todoItem;
        this.assignee = assignee;
        this.assigned = (assignee != null);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAssigned() {
        return assigned;
    }

    private void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }

    public TodoItem getTodoItem() {
        return todoItem;
    }

    public void setTodoItem(TodoItem todoItem) {
        if (todoItem == null) {
            throw new IllegalArgumentException("TodoItem cannot be null");
        }
        this.todoItem = todoItem;
    }

    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee) {
        this.assignee = assignee;
        setAssigned(assignee != null);
    }

    // Method to get a summary of the TodoItemTask
    public String getSummary() {
        String summary = "TodoItemTask ID: " + id + ", " +
                "Assigned: " + assigned + ", " +
                "TodoItem: " + (todoItem != null ? todoItem.getSummary() : "None") + ", " +
                "Assignee: " + (assignee != null ? (assignee.getFristName() + " " + assignee.getLastName()) : "None");
        return summary;
    }
}
