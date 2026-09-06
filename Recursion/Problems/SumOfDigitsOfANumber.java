package Problems;

import java.util.Scanner;
public class SumOfDigitsOfANumber{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Number = ");
    int num = sc.nextInt();
    System.out.println("Sum of digits of "+num+" is: "+sumOfDigits(num));
    sc.close();
  }
  
  public static int sumOfDigits(int num){
    //base case
    if(num == 0){
      return 0;
    }
    
    
    //recursive call
     
    return num%10 + sumOfDigits(num/10);
  }
}
