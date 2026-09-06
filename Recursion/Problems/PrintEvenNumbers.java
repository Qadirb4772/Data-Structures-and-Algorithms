package Problems;

import java.util.Scanner;
public class PrintEvenNumbers{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter starting Number = ");
    int start = sc.nextInt();
    System.out.print("Enter an ending Number = ");
    int end  = sc.nextInt();
    
    printEvens(end);
    printEvens(start, end);
    sc.close();
  }
  
  //method for printing evens numbers from a certain starting point to certain end point
  public static void printEvens(int start, int end){
   System.out.println("Method "+start+" started");
    if(start > end){
      return;
    }
    if(start % 2 == 0){
      System.out.println(start);
    }
    printEvens(start+1, end);
    System.out.println("Method "+start+" ended");
    }
    
    //method for printing even numbers from a certain to number to 1 (i.e descending)
    public static void printEvens(int n){
      if(n < 2){
        return;
      }
      if(n % 2 == 0){
        System.out.println(n);
      }
      printEvens(n-1);
    }
}
