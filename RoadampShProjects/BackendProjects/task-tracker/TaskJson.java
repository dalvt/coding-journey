import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class TaskJson {

    private static final String FILE_NAME = "tasks.json";

    public static ArrayList<Task> load() {
        ArrayList<Task> tasks = new ArrayList<>();
        File file = new File(FILE_NAME);

        if (!file.exists()) {
            createEmptyFile(file);
            return tasks;
        }

        String content = readFile(file);
        content = content.trim();

        if (content.isEmpty() || content.equals("[]")) {
            return tasks;
        }

        String inner = content.substring(1, content.length() - 1);
        String[] parts = inner.split("\\},\\s*\\{");

        for (int i = 0; i < parts.length; i++) {
            String part = parts[i];
            if (i > 0) {
                part = "{" + part;
            }
            if (i < parts.length - 1) {
                part = part + "}";
            }

            int id = Integer.parseInt(extractValue("id", part));
            String description = extractValue("description", part);
            String status = extractValue("status", part);

            tasks.add(new Task(description, id, status));
        }

        return tasks;
    }

    public static void save(ArrayList<Task> tasks) {
        StringBuilder json = new StringBuilder("[");

        for (int i = 0; i < tasks.size(); i++) {
            if (i > 0) {
                json.append(", ");
            }
            json.append(tasks.get(i).toJson());
        }

        json.append("]");

        try (FileWriter writer = new FileWriter(FILE_NAME)) {
            writer.write(json.toString());
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }

    private static void createEmptyFile(File file) {
        try (FileWriter writer = new FileWriter(file)) {
            writer.write("[]");
        } catch (IOException e) {
            System.out.println("Error al crear el archivo: " + e.getMessage());
        }
    }

    private static String readFile(File file) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        return content.toString();
    }

    private static String extractValue(String key, String json) {
        String keyPattern = "\"" + key + "\"";
        int keyIndex = json.indexOf(keyPattern);
        if (keyIndex == -1) {
            return "";
        }

        int colonIndex = json.indexOf(":", keyIndex);
        int valueStart = colonIndex + 1;

        while (valueStart < json.length() && json.charAt(valueStart) == ' ') {
            valueStart++;
        }

        if (json.charAt(valueStart) == '"') {
            StringBuilder value = new StringBuilder();
            int i = valueStart + 1;
            while (i < json.length()) {
                char c = json.charAt(i);
                if (c == '\\' && i + 1 < json.length()) {
                    value.append(json.charAt(i + 1));
                    i += 2;
                } else if (c == '"') {
                    break;
                } else {
                    value.append(c);
                    i++;
                }
            }
            return value.toString();
        }

        int end = valueStart;
        while (end < json.length() && json.charAt(end) != ',' && json.charAt(end) != '}') {
            end++;
        }
        return json.substring(valueStart, end).trim();
    }

}