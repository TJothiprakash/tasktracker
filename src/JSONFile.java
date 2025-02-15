import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class JSONFile {
    public void updateJSONFile(TaskTracker taskTracker) {
        File file = new File("items.json");
        List<Task> tasks = taskTracker.getTaskList();
        List<String> existingTasks = new ArrayList<>();

        // Check if the file exists and read existing data
        if (file.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                StringBuilder existingJson = new StringBuilder();
                String line;
                while ((line = br.readLine()) != null) {
                    existingJson.append(line);
                }
                existingTasks = parseJsonArray(existingJson.toString()); // Convert JSON to List
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // Add new tasks to the existing list (avoid duplicates if needed)
        for (Task task : tasks) {
            if (!existingTasks.contains(task.toString())) { // Assuming Task has a proper toString method
                existingTasks.add(task.toString());
            }
        }

        // Convert updated list to JSON format
        StringBuilder json = new StringBuilder();
        json.append("[");
        for (int i = 0; i < existingTasks.size(); i++) {
            json.append("\"").append(existingTasks.get(i)).append("\"");
            if (i < existingTasks.size() - 1) {
                json.append(", ");
            }
        }
        json.append("]");

        // Write updated JSON to file
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(json.toString());
            System.out.println("JSON file updated successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private List<String> parseJsonArray(String json) {
        List<String> list = new ArrayList<>();
        json = json.trim();
        if (json.startsWith("[") && json.endsWith("]")) {
            json = json.substring(1, json.length() - 1); // Remove [ and ]
            String[] elements = json.split("\", \""); // Split items
            for (String element : elements) {
                list.add(element.replaceAll("\"", "")); // Remove extra quotes
            }
        }
        return list;
    }
}