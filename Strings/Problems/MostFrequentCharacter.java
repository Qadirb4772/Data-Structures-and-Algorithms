package Problems;

import java.util.*;
public class MostFrequentCharacter{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Word or Sentence = ");
    String str = sc.nextLine();
    try {
      System.out.println(mostFreqChar(str));
    }catch(Exception ex){
      System.out.println(ex.getMessage());
    }
    sc.close();
  }
  
  public static String mostFreqChar(String str) throws NullStringException, EmptyStringException{
    if(str == null){
      throw new Problems.NullStringException("Exception!! String Is Null");
    }else if(str.trim().isEmpty()){
      throw new Problems.EmptyStringException("Exception!! String Is Empty");
    }else {
      ArrayList <Integer> frequencies = new ArrayList<>();
      boolean[] isVisited = new boolean[str.length()];
      for(int i = 0; i < str.length(); i++){
        char ch = str.charAt(i);
        int freq = 1;
        for(int j = i+1; j < str.length(); j++){
          if(str.charAt(j) != ' ' && str.charAt(j) == ch){
            freq++;
            isVisited[j] = true;
          }
        }
        if(!isVisited[i]){
          frequencies.add(freq);
        }
      }
      int maxFreq = frequencies.get(0), frequentIndex = 0;
      for(int i = 1; i < frequencies.size(); i++){
        if(frequencies.get(i) > maxFreq){
          maxFreq = frequencies.get(i);
          frequentIndex = i;
        }
      }
      String result = "Most Frequent Character = "+Character.toString(str.charAt(frequentIndex))+"\nFrequency = "+maxFreq;
      return result;
    }
  }
}
