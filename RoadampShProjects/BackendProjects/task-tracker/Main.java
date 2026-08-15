import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: task-cli <action> [arguments]");
            return;
        }

        TaskManager manager = new TaskManager();
        String action = args[0];

        if (action.equals("add")) {
            if (args.length < 2) {
                System.out.println("The input is not correct");
                return;
            }
            String description = String.join(" ", Arrays.copyOfRange(args, 1, args.length));
            manager.addTask(description);

        } else if (action.equals("update") || action.equals("delete")
                || action.equals("mark-in-progress") || action.equals("mark-done")) {

            if (args.length < 2) {
                System.out.println("The input is not correct");
                return;
            }

            int id;
            try {
                id = Integer.parseInt(args[1]);
            } catch (NumberFormatException e) {
                System.out.println("The input is not correct");
                return;
            }

            if (action.equals("update")) {
                if (args.length < 3) {
                    System.out.println("The input is not correct");
                    return;
                }
                String newDescription = String.join(" ", Arrays.copyOfRange(args, 2, args.length));
                manager.updateTask(newDescription, id);
            } else if (action.equals("delete")) {
                manager.deleteTask(id);
            } else if (action.equals("mark-in-progress")) {
                manager.markInProgress(id);
            } else {
                manager.markDone(id);
            }

        } else if (action.equals("list")) {
            if (args.length == 1) {
                manager.list();
            } else if (args[1].equals("done")) {
                manager.listDone();
            } else if (args[1].equals("todo")) {
                manager.listTodo();
            } else if (args[1].equals("in-progress")) {
                manager.listInProgress();
            } else {
                System.out.println("The input is not correct");
            }

        } else {
            System.out.println("The input is not correct");
        }
    }
}