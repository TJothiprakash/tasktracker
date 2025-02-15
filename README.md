
https://roadmap.sh/projects/task-tracker
# Task Tracker CLI

## Overview
Task Tracker CLI is a simple command-line interface (CLI) application that allows users to track and manage their tasks. Users can add, update, delete, and list tasks, and tasks are stored in a JSON file for persistence.

## Features
- Add new tasks with a name, description, and due date
- Update existing tasks with new details
- Delete tasks
- List all tasks or filter tasks by status (TODO, IN PROGRESS, DONE)
- Persistent storage in a JSON file

## Installation
### Prerequisites
- Java 8 or higher
- A terminal or command prompt

### Steps to Run
1. Clone or download this repository.
2. Open a terminal in the project directory.
3. Compile the Java files:
   ```sh
   javac *.java
   ```
4. Run the Task Tracker CLI:
   ```sh
   java TaskTrackerCLI
   ```

## Usage
Once the application is running, you can use the following commands:

### Add a Task
```
add "Task Name" "Task Description" "Due Date"
```
Example:
```
add "Complete project" "Finish the CLI implementation" "2025-03-01"
```

### Update a Task
```
update "Task Name" "New Description" "New Due Date" "Status"
```
Example:
```
update "Complete project" "Refactor the code" "2025-03-05" "INPROGRESS"
```

### Delete a Task
```
delete "Task Name"
```
Example:
```
delete "Complete project"
```

### List Tasks
```
list all          # Lists all tasks
list done         # Lists completed tasks
list inprogress   # Lists tasks in progress
list todo         # Lists tasks yet to be started
```

### Exit Application
```
exit
```

## Contributing
If you wish to contribute, feel free to fork the repository and submit a pull request with your improvements.

## License
This project is open-source and available under the MIT License.

