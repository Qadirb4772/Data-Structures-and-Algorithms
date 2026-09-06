package LabAssignments.studentRecordManagementSystem;

public class StudentManager {
    public static void main(String[] args) {
        CLinkedList students = new CLinkedList();
        Student std0 = new Student(12, "Abrar", "CS", 4, 3.2);
        Student std1 = new Student(13, "Qadir", "SE", 3, 3.8);
        Student std2 = new Student(13, "Waheed", "SE", 3, 3.5);

        students.addStudentFront(std0);
        students.addStudentBack(std1);

        students.displayStudents();

        students.updateStudent(13, std2);
        students.displayStudents();
        
    }
}
