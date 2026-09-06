package Problems;

import java.util.Scanner;
public class ReverseWordsInASentence{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a sentence = ");
    String sentence = sc.nextLine();
    
    try {
      String rev = reverseWords(sentence);
      System.out.println("Reversed Sentence is: \n"+rev);
    }catch(Exception ex){
      System.out.println(ex.getMessage());
    }
    sc.close();  
  }
  
  public static String reverseWords(String sentence) throws NullStringException, EmptyStringException{
    if(sentence == null){
      throw new NullStringException("Sentence Is null");
    }else if (sentence.trim().isEmpty()){
      throw new EmptyStringException("Sentence Is Empty");
    }else {
      String[] sentenceArr = sentence.split(" ");
      
      for(int i = 0; i < sentenceArr.length/2; i++){
        int start = i, end = sentenceArr.length-1-i;
        String temp = sentenceArr[start];
        sentenceArr[start] = sentenceArr[end];
        sentenceArr[end] = temp;
      }
      
      String reversedSentence = new String();
      for(int i = 0; i < sentenceArr.length; i++){
        reversedSentence += sentenceArr[i]+" ";
      }
      
      String reversed = reversedSentence.toString();
      
      return reversed;
    }
  }
}
