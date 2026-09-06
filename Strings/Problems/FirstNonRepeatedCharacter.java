package Problems;

import java.util.Scanner;
public class FirstNonRepeatedCharacter{
  public static void  main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a String = ");
    String str = sc.nextLine();
    try {
      char nonRepeatedChar = firstNonRepeatedChar(str);
      if(nonRepeatedChar != ' '){
        System.out.println("First Non Repeated Character is: "+firstNonRepeatedChar(str));
      }else {
        System.out.println("No Non Repeated Character is there in the String!!");
      }
    }catch(Exception ex){
      System.out.println(ex.getMessage());
    }
    sc.close();
  }
  
  public static char firstNonRepeatedChar(String str) throws NullStringException, EmptyStringException{
    if(str == null){
      throw new NullStringException("Exception!! String is Null");
    }else if(str.trim().isEmpty()){
      throw new EmptyStringException("Exception!! String is Empty!!");
    }else{
      char nonRepeated = ' ';
      boolean[] isVisited = new boolean[str.length()];
      for(int i = 0; i < str.length(); i++){
        char ch = str.charAt(i);
        int freq = 1;
        for(int j = i+1; j < str.length(); j++){
          if(str.charAt(j) == ch){
            freq++;
            isVisited[j] = true;
          }
        }
        
        if(!isVisited[i] && freq == 1){
          nonRepeated = str.charAt(i);
          break;
        }
      }
      return nonRepeated;
    }
  }
}
