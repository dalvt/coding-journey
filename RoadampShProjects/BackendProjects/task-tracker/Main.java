import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager manager = new TaskManager();

        String[] line = scanner.nextLine().split(" ");
        String action = line[1];

        if (action.equals("add")) {
            String description = String.join(" ", Arrays.copyOfRange(line, 2, line.length));
            manager.addTask(description);
        
        } else if (action.equals("update")) {
            int id = Integer.valueOf(line[2]);
            String newDescription = line[3];
            manager.updateTask(newDescription, id);

        } else if (action.equals("delete")) {
            int id = Integer.valueOf(line[2]);
            manager.deleteTask(id);
        
        } else if (action.equals("mark-in-progress")) {
            int id = Integer.valueOf(line[2]);
            manager.markInProgress(id); 


        } else if (action.equals("mark-done")) {
            int id = Integer.valueOf(line[2]);
            manager.markDone(id); 

        } else if (action.equals("list")) {
            if (line.length == 2) {
                manager.list();

            } else if (line[2].equals("done")) {
                manager.listDone();

            } else if (line[2].equals("todo")) {
                manager.listTodo();
            
            } else if (line[2].equals("in-progress")) {
                manager.listInProgress();
            }
        } else {
            System.out.println("The input is not correct");
        }
            


    }
}
