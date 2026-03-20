import java.nio.file.*;
import java.io.IOException;
import java.util.List;

public class FileUtility {

    // 1. CREATE & WRITE
    public static void writeToFile(String filePath, String content) throws IOException {
        Files.writeString(Path.of(filePath), content);
        System.out.println(">>> File created/written successfully.");
    }

    // 2. READ
    public static void readFromFile(String filePath) throws IOException {
        String content = Files.readString(Path.of(filePath));
        System.out.println(">>> File Content:\n" + content);
    }

    // 3. MODIFY (Append)
    public static void appendToFile(String filePath, String extraText) throws IOException {
        Files.writeString(Path.of(filePath), System.lineSeparator() + extraText, StandardOpenOption.APPEND);
        System.out.println(">>> File modified (text added).");
    }

    public static void main(String[] args) {
        String fileName = "my_task.txt";

        try {
            System.out.println("--- Starting File Operations ---");
            
            // Task: Write
            writeToFile(fileName, "Internship Task 1: File Handling Utility");

            // Task: Modify
            appendToFile(fileName, "This is the modify section.");

            // Task: Read
            readFromFile(fileName);

        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
