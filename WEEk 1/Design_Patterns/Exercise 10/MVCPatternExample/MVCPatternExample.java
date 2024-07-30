package MVCPattern;

public class MVCPatternExample {
    public static void main(String[] args) {

        Student model = retrieveStudentFromDatabase();

        // Create a view
        StudentView view = new StudentView();

        // Create a controller
        StudentController controller = new StudentController(model, view);

        // Update the view
        controller.updateView();

        // Update the model
        controller.setStudentName("John Doe");
        controller.setStudentGrade("A");

        // Update the view again with new student details
        controller.updateView();
    }

    private static Student retrieveStudentFromDatabase() {
        Student student = new Student();
        student.setId("12345");
        student.setName("Jane Smith");
        student.setGrade("B");
        return student;
    }
}
