public class SinglyLinkedList {
    class Node {
        Task task;
        Node next;

        public Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }

    private Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public Task searchTask(int taskId) {
        Node current = head;
        while (current != null) {
            if (current.task.getTaskId() == taskId) {
                return current.task;
            }
            current = current.next;
        }
        return null;
    }

    public boolean deleteTask(int taskId) {
        if (head == null) {
            return false;
        }
        if (head.task.getTaskId() == taskId) {
            head = head.next;
            return true;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.task.getTaskId() == taskId) {
                current.next = current.next.next;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void traverseTasks() {
        Node current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList taskList = new SinglyLinkedList();

        // Add tasks
        taskList.addTask(new Task(1, "Task 1", "Pending"));
        taskList.addTask(new Task(2, "Task 2", "Completed"));
        taskList.addTask(new Task(3, "Task 3", "In Progress"));

        // Traverse tasks
        System.out.println("Traversing tasks:");
        taskList.traverseTasks();

        // Search for a task
        int searchId = 2;
        Task foundTask = taskList.searchTask(searchId);
        if (foundTask != null) {
            System.out.println("Task found: " + foundTask);
        } else {
            System.out.println("Task not found with ID: " + searchId);
        }

        // Delete a task
        int deleteId = 3;
        boolean isDeleted = taskList.deleteTask(deleteId);
        if (isDeleted) {
            System.out.println("Task deleted with ID: " + deleteId);
        } else {
            System.out.println("Task not found with ID: " + deleteId);
        }

        // Traverse tasks again
        System.out.println("Traversing tasks after deletion:");
        taskList.traverseTasks();
    }
}
