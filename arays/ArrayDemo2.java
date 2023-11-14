import java.util.Scanner;

public class ArrayDemo2 {
   public static void main (String [] args) {
 
      final int EMPLOYEES = 3; //number of employees
      int hours [] = new int[EMPLOYEES]; //array of hours
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter the hours worked by " + EMPLOYEES + "employees.");
      
      for (int count = 0; count < EMPLOYEES; count++) {
         System.out.print("Employee " + (count + 1) + ": " );
         hours[count] = keyboard.nextInt();
         }
      
      System.out.println("The hours you entered were: ");
      for (int index = 0; index < EMPLOYEES; index++)
         System.out.println(hours[index]);
 
 
 
 
 
  }  
}