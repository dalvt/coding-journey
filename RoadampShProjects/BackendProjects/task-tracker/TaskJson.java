import java.io.File;
import java.io.FileWriter;

public class TaskJson {
    File file = new File("tasks.json");

    if (!file.exists("tasks.json")) {
        FileWriter writer = new FileWriter(file);
        writer.write("[]");
        writer.close();
    }

    
}
