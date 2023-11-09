import java.util.Scanner;



public class Luke_Lab_6_Part1 
{   
   public static void main (String[] args) 
   {
     Scanner keyboard = new Scanner(System.in);   
      
      print();
      System.out.println("End Of Activity 1");   
      System.out.println("Now we will call a method that returns a string");
      String a = returnString();
      System.out.println("returnString method gives me: " + a);
      printOneToTen();
      System.out.println();
      addTen(10);
      addTen(17);
      addTen(66);
      CubePower(2);
      CubePower(10);
      CubePower(25);
      System.out.println("Enter an integer number");
      int input = keyboard.nextInt();
      multTable(input);
      
   }
      
   public static void print() 
   {
      System.out.println("Welcome To Lab 6");
   }
   
   public static String returnString() 
   {
      return ("Hi. Printing from inside the message.");
   }
   
   public static void printOneToTen()
   {
      for (int j = 1; j <= 10; j++)
         System.out.print(j + " ");
   }
   
   public static void addTen (double num)
   {
      double sum;
      sum = num + 10;
      System.out.println(sum);   
   }
   
   public static void CubePower (int num)
   {
      int cube;
      cube = num * num * num;
      
      System.out.println(cube);
   }
   
   public static void multTable(int a);
   {
      if (input < 0)
      {
         System.out.println("Error. Enter a number greater than zero.");
      }
      else
      {
         for (i = 0; i <= input; i++)
         {
            for (j = 0; j <= 10; j++)
            {
               System.out.print(input * j);
            } System.out.println(); 
         }
      }
   
   }
      
      
   
      
}