import java.io.*;
import java.util.*;


public class Luke_Lab_7 {
   
   public static void main(String[] args) throws IOException {
 
      question1();
      question2();
   
   }
   
   public static void question1() {
 
      double [] numbers = {10, 101, 8, 77, 50, 65, 12, 40, 39, 100};
      double min = numbers[0];
      double max = numbers[0];
      double sum = 0;
      double average = 0;
     
      System.out.println("First element: " + numbers[0]);
      System.out.println("Element 50: " + numbers[4]);
      System.out.println("Last element: " + numbers[9]);
      System.out.println("Array length: " + numbers.length);
      
      for(int i = 0; i<10; i++) {
         if (numbers[i] < min) {
            min = numbers[i]; 
            }
         if (numbers[i] > max) {
            max = numbers[i];
            }
         sum += numbers[i];
         average = sum/numbers.length;
       }

        System.out.println("Minimum value in array: " + min);
        System.out.println("Maximum value in array: " + max);
        System.out.println("Sum of the array: " + sum);
        System.out.println("Average of the array: " + average);
   }
   
   public static void question2() {
   
      Scanner keyboard = new Scanner(System.in);
   
      System.out.println("Enter the size of the array: ");
      int input = keyboard.nextInt();
      keyboard.nextLine();
      String [] array = new String[input];
      
      for(int i = 0; i<input; i++) {
         System.out.println("Enter the name of city " + (i+1) );
         array[i] = keyboard.nextLine();
         }
      
      System.out.println("Array values (names of  cities)");
      
      for(int i = 0; i<input; i++)
         System.out.println(array[i]);
   }
      
      
      

   



}