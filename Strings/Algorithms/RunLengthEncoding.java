package Algorithms;

import java.util.Scanner;

import Problems.EmptyStringException;
import Problems.NullStringException;

public class RunLengthEncoding{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a decoded String = ");
    String str  = sc.nextLine();
    
    try {
      System.out.println("Encoded String is: \n"+encodeString(str));
    }catch(Exception ex){
      System.out.println(ex.getMessage());
    }
    sc.close();
  }
  
  public static String encodeString(String str) throws NullStringException, EmptyStringException{
    if(str == null){
      throw new NullStringException("String is null!!!");
    }else if(str.trim().isEmpty()){
      throw new EmptyStringException("String is empty!!!");
    }else{
      StringBuilder builder = new StringBuilder();
      boolean isVisited[] = new boolean[str.length()];
      for(int i = 0; i < str.length(); i++){
        char ch = str.charAt(i);
        int freq = 1;
        for(int j = i+1; j < str.length(); j++){
          if(str.charAt(j) == ch){
            isVisited[j] = true;
            freq++;
          }
        }
        if(!isVisited[i]){
        if(freq != 1){
            builder.append(str.charAt(i));
            builder.append(freq);
          }
          else{
            builder.append(str.charAt(i));
          }
        }
      }
      return builder.toString();
    }
  }
} 
