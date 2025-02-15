    public class Task {
        private String name;
        enum Status {TODO, INPROGRESS, DONE};
        private Status status;
        private String taskDescription;
        private String dueDate;

        public Task(String name, String taskDescription, String dueDate) {
            this.name = name;
            this.taskDescription = taskDescription;
            this.dueDate = dueDate;
            this.status = Status.TODO;
        }

        @Override
        public String toString() {
            return "Task{" +
                    "name='" + name + '\'' +
                    ", status=" + status +
                    ", taskDescription='" + taskDescription + '\'' +
                    ", dueDate='" + dueDate + '\'' +
                    '}';
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Status getStatus() {
            return status;
        }

        public void setStatus(Status status) {
            this.status = status;
        }

        public String getTaskDescription() {
            return taskDescription;
        }

        public void setTaskDescription(String taskDescription) {
            this.taskDescription = taskDescription;
        }

        public String getDueDate() {
            return dueDate;
        }

        public void setDueDate(String dueDate) {
            this.dueDate = dueDate;
        }
    }
