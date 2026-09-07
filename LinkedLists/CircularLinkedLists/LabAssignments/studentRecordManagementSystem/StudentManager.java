package LabAssignments.studentRecordManagementSystem;

public class StudentManager {
    public static void main(String[] args) {
        CLinkedList students = new CLinkedList();
        Student std0 = new Student(12, "Abrar", "CS", 4, 3.2);
        Student std1 = new Student(13, "Qadir", "SE", 3, 3.8);
        Student std2 = new Student(14, "Waheed", "SE", 3, 3.5);
        Student std3 = new Student(15, "Shoaib", "CSAI", 3, 3.5);
        students.addStudentFront(std0);
        students.addStudentBack(std1);

        System.out.println();
        students.displayStudents();

        System.out.println();
        students.addStudentBefore(13, std2);
        students.displayStudents();

        System.out.println();
        students.addStudentAfter(12, std3);
        students.displayStudents();
        
    }
}
