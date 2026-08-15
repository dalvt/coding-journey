public class Task {
    
    private int id;
    private String description;
    private String state;

    public Task(String description, int id, String state) {
        this.id = id;
        this.description = description;
        this.state = state;
    }

    public void changeDescription(String newDescription) {
        this.description = newDescription;
    }

    public int getId() {
        return this.id;
    }

    public String getDescription() {
        return this.description;
    }

    public String getStatus() {
        return this.state;
    }

    public void inProgress() {
        this.state = "In progress";
    }

    public void done() {
        this.state = "Done";
    }    

    public String toJson() {
        return String.format(
            "{\"id\": %d, \"description\": \"%s\", \"status\": \"%s\"}",
            this.id, this.description, this.state
        );
    }
    
}
