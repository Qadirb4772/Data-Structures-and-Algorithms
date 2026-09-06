package Algorithms;

import java.util.*;

public class SnakeCaseToCamelCase{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string in snake case = ");
    String str = sc.nextLine();
    try{
      System.out.println("Camel Case for "+str+" is: ");
      System.out.println(changeCase(str));
    }catch(Exception ex){
      System.out.println(ex.getMessage());
    }
    sc.close();
  }
  
  public static String changeCase(String str) throws Exception{
    if(str == null){
      throw new Problems.NullStringException("String is Null");
    }else if(str.trim().isEmpty()){
      throw new Problems.EmptyStringException("String is Empty");
    }else {
        if(str.contains("_")){
          StringBuilder camelCase = new StringBuilder();
          int upperCaseNext = -1;
          for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '_'){
              upperCaseNext = 0;
            }else if(upperCaseNext == 0){//hello_world
              camelCase.append(Character.toString(str.charAt(i)).toUpperCase());
              upperCaseNext = -1;
            }else {
              camelCase.append(str.charAt(i));
            }
          }
          return camelCase.toString();
        }else{
        System.out.println("Invalid Snake Case(i.e hello_world))");
        return "";
      }
      }
  }
}

