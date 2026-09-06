package Problems;

import java.util.Scanner;
public class RemoveExtraSpaces{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a sentence = ");
    String str = sc.nextLine();
    try {
      System.out.println("After removing extra spaces sentence is: \n"+removeSpaces(str));
    }catch(Exception ex){
      System.out.println(ex.getMessage());
    }
    sc.close();
  }
  
  public static String removeSpaces(String str) throws NullStringException, EmptyStringException{
    if(str == null){
      throw new NullStringException("Sentence is null");
    }else if(str.trim().isEmpty()){
      throw new EmptyStringException("Sentence is empty");
    }else {
      String[] arr = str.split(" ");
      String withoutExtraSpaces = new String();
      for(int i = 0; i < arr.length; i++){
        if(!arr[i].trim().isEmpty()){
          withoutExtraSpaces += arr[i] +" ";
        }
      }
      return withoutExtraSpaces;
    }
  }
}
