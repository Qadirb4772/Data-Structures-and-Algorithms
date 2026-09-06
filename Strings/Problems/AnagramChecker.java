package Problems;

public class AnagramChecker{
  public static void main(String[] args){
    String str1 = "Qadir";
    String str2 = "Abrar";
    
    System.out.println(areAnagrams(str1, str2));
  }
  
  public static boolean areAnagrams(String str1, String str2){
    char[] arr1 = str1.toLowerCase().toCharArray();
    char[] arr2 = str2.toLowerCase().toCharArray();
    
    String first = sort(arr1);
    String second = sort(arr2);
    
    return first.equalsIgnoreCase(second);
   
  }
  
  public static String sort(char arr[]){
    String sortedStr = "";
    if(arr.length == 0){
      System.out.println("Array Is Empty!!");
      return sortedStr;
    }
    for(int i = 0; i < arr.length-1; i++){
      int  minIndex = i; 
      for(int j = i+1; j < arr.length; j++){
        if(arr[j] < arr[minIndex]){
          minIndex = j;
        }
      }
      char temp = arr[minIndex];
      arr[minIndex] = arr[i];
      arr[i] = temp;
    }
    
    for(int i = 0; i < arr.length; i++){
      sortedStr += Character.toString(arr[i]);
    }
    return sortedStr;
  }
}
