package LabAssignments.studentManagementSystem;

public class Student {
    private int studentId;
  private String name;
  private String department;
  private int semester;
  private double cgpa;
  
  public Student(int stdId, String name, String dept, int semester, double cgpa){
    if(stdId > 0 && semester > 0 && cgpa > 0 && !(name.isEmpty()) && !(dept.isEmpty())){
      this.studentId = stdId;
      this.name = name;
      this.semester = semester;
      this.department = dept;
      this.cgpa = cgpa;
    }else{
      System.out.println("Invalid Student Information");
    }
  }
  
  //setter for name
  public void setName(String name){
    if(!name.isEmpty()){
      this.name = name;
    }else{
      System.out.println("Invalid Name!!");
    }
  }
  
  //setter for semester
  public void setSemester(int sem){
    if(sem > 0){
      this.semester = sem;
    }else{
      System.out.println("Invalid Semester!!!");
    }
  }
  
  //setter for cgpa
  public void setCgpa(double cgpa){
    if(cgpa > 0.0){
      this.cgpa = cgpa;
    }else{
      System.out.println("Invalid CGPA! CGPA cannot be negative!!");
    }
  }
  
  //getter for studentId
  public int getStudentId(){
    return this.studentId;
  }
  
  //method for displaying student information
  public void displayInfo(){
    System.out.println("Student ID: "+this.studentId);
    System.out.println("Student Name: "+this.name);
    System.out.println("Department: "+this.department);
    System.out.println("Semester: "+this.semester);
    System.out.println("CGPA: "+this.cgpa);
  }
}
