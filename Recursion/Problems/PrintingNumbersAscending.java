package Problems;

import java.util.Scanner;
public class PrintingNumbersAscending{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number = ");
    int end = sc.nextInt();
    int from = 1;
    printNumbers(from, end);

    sc.close();
  }
  
  public static void printNumbers(int start, int end){
    if(start > end){
      return;
    }
    System.out.println(start);
    printNumbers(start+1, end);
  }
}
