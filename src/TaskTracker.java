import java.util.ArrayList;
import java.util.List;

public class TaskTracker {
    private JSONFile jsonFile = new JSONFile();
    private List<Task> taskList;

    public TaskTracker() {
        taskList = new ArrayList<>();
    }

    public void addTask(Task task) {
        taskList.add(task);
        jsonFile.updateJSONFile(this);
    }

    public void removeTask(Task task) {
        taskList.remove(task);
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    public void printTaskList() {
        for (Task task : taskList) {
            System.out.println(task);
        }
    }

    public void updateTaskDetails(Task task, String name, String taskDescription, String dueDate, Task.Status status) {
        task.setName(name);
        task.setTaskDescription(taskDescription);
        task.setDueDate(dueDate);
        task.setStatus(status);
    }

    //List all tasks that are done
    //List all tasks that are not done
    //List all tasks that are in progress
    public void listTasksByStatus(Task.Status status) {
        for (Task task : taskList) {
            if (task.getStatus() == status) {
                System.out.println(task);
            }
        }
    }

}
