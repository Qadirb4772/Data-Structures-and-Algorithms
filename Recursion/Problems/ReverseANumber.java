package Problems;

import java.util.Scanner;

public class ReverseANumber{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Number = ");
    int num = sc.nextInt();
    
    int reversedNum = reverse(num);
    
    System.out.println("The reversed Number is: "+reversedNum);
    sc.close();
  }
  
  public static int reverse(int num){
    //base case
    if(num == 0){
      return 0;
    }
    
    return num%10*(int)Math.pow(10, DigitsOfANumber.countDigits(num)-1)+reverse(num/10);
    
  }
}
