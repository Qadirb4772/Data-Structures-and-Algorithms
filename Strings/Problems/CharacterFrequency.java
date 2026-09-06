package Problems;

import java.util.Scanner;
public class CharacterFrequency{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a word or sentence = ");
    String str = sc.nextLine().toLowerCase();
    
    try{
      charFreq(str);
    }catch(Exception ex){
      System.out.println(ex.getMessage());
    }
    sc.close();
  }
  
  public static void charFreq(String str) throws Exception{
    if(str == null){
      throw new Problems.NullStringException("String Is Null!!!!!!!!!");
    }else if(str.trim().length() == 0){
      throw new Problems.EmptyStringException("String is Empty!!!!!");
    }else{
      boolean[] visitedArr = new boolean[str.length()];
      for(int i = 0; i < str.length()-1; i++){
        char ch = str.charAt(i);
        int chFreq = 1;
        for(int j = i+1; j < str.length(); j++){
          if(str.charAt(j) == ch){
            visitedArr[j] = true;
            chFreq++;
          }
        }
        if(!visitedArr[i]){
          System.out.println(ch +" = "+chFreq);
        }
      }
    }
  }
}
