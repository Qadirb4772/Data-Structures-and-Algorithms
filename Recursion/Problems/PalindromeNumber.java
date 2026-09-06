package Problems;

import java.util.Scanner;
public class PalindromeNumber{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Number = ");
    int num = sc.nextInt();
    
    if(isPalindrome(num)){
      System.out.println(num+" is a Palindrome Number!!");
    }else{
      System.out.println(num+" is not a Palindrome Number!!");
    }
    sc.close();
  }
  
  public static boolean isPalindrome(int num){
    int reversed = reverse(num);
    return reversed == num;
  }
  
  public static int reverse(int num){
    //base case
    if(num == 0){
      return 0;
    }
    //recursive call
    return num%10 * (int) Math.pow(10, totalDigits(num)-1) + reverse(num/10);
  }
  
  public static int totalDigits(int num){
    if(num == 0){
      return 0;
    }
    int count = 0;
    return ++count + totalDigits(num/10);
  }
}
