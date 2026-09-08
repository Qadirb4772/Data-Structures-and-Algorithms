package LabAssignments.studentManagementSystem;

public class StudentManagerDemo {
    public static void main(String[] args){
        StudentManager record = new StudentManager();
        
        Student std0 = new Student(12, "Qadir", "Software Engineer", 3, 3.4);
        Student std1 = new Student(123, "Abrar", "Computer Science", 4, 3.25);

        record.addStudentFront(std1);
        record.addStudentBack(std0);
        
        record.displayStudentsForward();

        record.deleteStudent(123);
        record.displayStudentsForward();

    }
}
