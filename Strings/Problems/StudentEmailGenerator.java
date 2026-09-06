package Problems;


import java.util.Scanner;

class Student{
  private String name;
  private int rollNo;
  
  public Student(){
    this.name = null;
    this.rollNo = 0;
  }
  
  public Student(String name, int rollNo){
    if(name != null && !name.trim().isEmpty() && rollNo > 0){
      this.name = name;
      this.rollNo = rollNo;
    }else {
      System.out.println("Invalid Student Credentials");
      this.name = null;
      this.rollNo = 0;
    }
  }
  
  public String getName(){
    return this.name;
  }
  
  public int getRollNo(){
    return this.rollNo;
  }
  
  public void setName(String name){
    if(name != null && !name.trim().isEmpty()){
      this.name = name;
    }else {
      System.out.println("Not a valid Name");
    }
  }
  
  public void setRollNo(int rollNo){
    if(rollNo < 0){
      System.out.println("Invalid Roll Number");
    }else{
      this.rollNo = rollNo;
    }
  }
}

public class StudentEmailGenerator{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Student std1 = new Student();
    System.out.print("Enter the name of student = ");
    std1.setName(sc.nextLine());
    System.out.print("Enter the roll number of Student = ");
    std1.setRollNo(sc.nextInt());
    
    try {
      System.out.println("Email for This student is: "+emailGenerator(std1.getName(), std1.getRollNo()));
    }catch(Exception ex){
      System.out.println(ex.getMessage());
    }
    sc.close();
  }
  
  public static String emailGenerator(String name, int rollNo) throws NullStringException, EmptyStringException{
    if(name == null){
      throw new NullStringException("Exception!! Name Is Null!");
    }else if(name.trim().isEmpty()){
      throw new EmptyStringException("Exception!! Name Is Empty!!");
    }else {
      return name.toLowerCase()+rollNo+"@iba-suk.edu.pk";
    }
  }
}
