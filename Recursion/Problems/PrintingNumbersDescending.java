package Problems;

import java.util.Scanner;
public class PrintingNumbersDescending{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Number = ");
    int num = sc.nextInt();
    printNumbers(num);

    sc.close();
  }
  
  public static void printNumbers(int n){
    //base case 
    if( n < 1){
      return;
    }
    System.out.println(n);
    printNumbers(n-1); //recursive call
  }
}
