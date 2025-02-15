//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      TaskTracker taskTracker = new TaskTracker();
        Task task1 = new Task("Task 4", "Task 1 Description", "2021-12-31");
        task1.setStatus(Task.Status.INPROGRESS);
        taskTracker.addTask(task1);
        Task task2 = new Task("Task 2", "Task 2 Description", "2021-12-31");
        task2.setStatus(Task.Status.TODO);
        taskTracker.addTask(task2);
        Task task3 = new Task("Task 3", "Task 3 Description", "2021-12-31");
        task3.setStatus(Task.Status.DONE);
        taskTracker.addTask(task3);
        System.out.println("before removing task2");
        taskTracker.printTaskList();
        taskTracker.removeTask(task2);
        System.out.println("after removing task2");

        taskTracker.printTaskList();


    }
}