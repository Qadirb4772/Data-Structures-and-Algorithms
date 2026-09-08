package LabAssignments.studentManagementSystem;

public class StudentManagerDemo {
    public static void main(String[] args){
        StudentManager record = new StudentManager();
        
        Student std0 = new Student(12, "Qadir", "Software Engineering", 3, 3.4);
        Student std1 = new Student(123, "Abrar", "Computer Science", 4, 3.25);
        Student std2 = new Student(130, "Hira", "Software Engineering", 4, 3.25);
        Student std3 = new Student(178, "Iqra", "Electrical Engineering", 3, 3.50);
        
        record.addStudentFront(std1);
        record.addStudentBack(std0);
        record.addStudentFront(std2);
        record.updateStudent(130, std3);

        record.displayStudentsForward();

        // record.deleteStudentFront();
        // record.displayStudentsForward();

        // record.deleteStudentBack();
        // record.displayStudentsForward();

        // record.deleteStudent(123);
        // record.displayStudentsForward();

        // record.searchStudent(12);

    }
}
