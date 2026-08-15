import java.util.ArrayList;

public class TaskManager {
    private int ID = 0;
    private ArrayList<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(String description) {
        ID++;
        Task task = new Task(description, ID, "TODO");
        tasks.add(task);
    }

    public void deleteTask(int id) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId() == id) {
                tasks.remove(i);
                break;
            }
        }
    }

    public void updateTask(String newDescription, int id) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId() == id) {
                tasks.get(i).changeDescription(newDescription);
            }
        }
    }

    public void markInProgress(int id) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId() == id) {
                tasks.get(i).inProgress();
            }
        }
    }

    public void markDone(int id) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId() == id) {
                tasks.get(i).done();
            }
        }
    }

    public void list() {
        for (Task s : tasks) {
            System.out.print(s.getDescription() + " ");
        }
    }

    public void listTodo() {
        ArrayList<Task> tasksTodo  = new ArrayList<>();
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getStatus().equals("TODO")) {
                tasksTodo.add(tasks.get(i));
            }
            
        }
        for (Task s : tasksTodo) {
            System.out.print(s.getDescription() + " ");
        }
    }

    public void listDone() {
        ArrayList<Task> tasksDone  = new ArrayList<>();
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getStatus().equals("Done")) {
                tasksDone.add(tasks.get(i));
            }
            
        }
        for (Task s : tasksDone) {
            System.out.print(s.getDescription() + " ");
        }
    }

    public void listInProgress() {
        ArrayList<Task> tasksInProgress  = new ArrayList<>();
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getStatus().equals("In progress")) {
                tasksInProgress.add(tasks.get(i));
            }
            
        }
        for (Task s : tasksInProgress) {
            System.out.print(s.getDescription() + " ");
        }
    }
    
}