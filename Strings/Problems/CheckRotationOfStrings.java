package Problems;

import java.util.Scanner;
public class CheckRotationOfStrings{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("*********###Strings Rotation Checker###*********");
    System.out.print("Enter string 1 = ");
    String str1 = sc.nextLine();
    System.out.print("Enter string 2 = ");
    String str2 = sc.nextLine();
    
    try {
      if(isRotation(str1, str2)){
        System.out.println("Both are Rotation of each other");
      }else{
        System.out.println("They aren't Rotation of each other");
      }
    }catch(Exception ex){
      System.out.println(ex.getMessage());
    }
    sc.close();
  }
  
  public static boolean isRotation(String str1, String str2) throws NullStringException, EmptyStringException{
    if(str1 == null || str2 == null){
      throw new NullStringException("One of the Strings is null");
    }else if(str1.trim().isEmpty() || str2.trim().isEmpty()){
      throw new EmptyStringException("One of the Strings is Empty");
    }else {
      StringBuilder reversedStr2 = new StringBuilder();
      for(int i = str2.length()-1; i>= 0; i--){
        reversedStr2.append(str2.charAt(i));
      }
      String reversedStr = reversedStr2.toString();
      
      if(str1.equals(reversedStr)){
        return true;
      }
      return false;
    }
  }
}
