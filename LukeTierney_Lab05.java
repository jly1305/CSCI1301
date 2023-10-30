//lab 05 :3

import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class LukeTierney_Lab05
{
   public static void main(String[] args) throws IOException
   {
   Scanner keyboard = new Scanner(System.in);
   
   //#2
      int number = 0;
      
      while (number <=25)
      {
         System.out.print(number+ " ");
         number++;
      }
      
   //#3
      System.out.println("\nEnter an integer");
      int num = keyboard.nextInt();
      int numMult = 1;
      
      System.out.println("Multiplication Table for " + num);
      
      while (numMult <= 10)
      {
         System.out.println("" + num + " x " + "" + numMult + " = " + (num * numMult));
         numMult++;
      }
      
   //#4
      System.out.println("Enter an integer:");
      int userNum = keyboard.nextInt();
      int sum = 0;
      int count = 0;
      
      while (count < (num + 1))
      {
         sum = sum + count;
         count = count+2; 
      }
         System.out.print("The sum of even numbers between " + 1 + " and " + userNum + " is: " + sum);
   //#5 
      Random randomNumbers = new Random();
      
      System.out.println("\nWelcome to the guessing game!\nGuess a number between 1 and 100");
      int userGuess = keyboard.nextInt();
      //nextInt((max-min) + 1)+min;
      int randomNumber1 = randomNumbers.nextInt(100)+1;
      int kount = 0;
      while (userGuess != randomNumber1)
      {
         if (userGuess > randomNumber1)
         {
         System.out.println("Try a lower number");
         userGuess = keyboard.nextInt();
         }
         else
         {
         System.out.println("Try a higher number");
         userGuess = keyboard.nextInt();
         }
         
         kount++;
      
      }
      
      System.out.println("Congratulations, the number is " + randomNumber1 + " and you guessed " + kount + " times.");
      

   //#6 
      int oddNumbers = 1;
      int cCount = 0;
      
      do
      {
         System.out.print(oddNumbers + cCount + " ");
         cCount = cCount + 2;
      
      } while (cCount < 50);
   
   //#7
      String yesOrNo;
      char repeat;

      do
      {
         System.out.println("\nEnter sales for Branch 1: ");
         int branchOneSales = keyboard.nextInt();

         System.out.println("Enter sales for Branch 2: ");
         int branchTwoSales = keyboard.nextInt();

         System.out.println("Enter sales for Branch 3: ");
         int branchThreeSales = keyboard.nextInt();

         keyboard.nextLine();

         System.out.println("Average Sales for 3 Branches: " + ((branchOneSales + branchTwoSales + branchThreeSales) / 3));

         System.out.println("Do you want to continue? (y/n)");
         
         yesOrNo = keyboard.nextLine();
         repeat = yesOrNo.toLowerCase().charAt(0);
         
      } while (repeat == 'y'); System.out.println("Goodbye!");

   //#8
      int sum8 = 0;
      int count8 = 0;
      int input8;
      int min = 2000000000;
      int max = 0;

      do
      {
         System.out.println("Enter a number or type \"-1\" to exit");
         input8 = keyboard.nextInt();
         
         if (input8 == -1)
         {
            break;
         }
         
         sum8 += input8;
         count8++;
         
         if (input8 > max)
         {
            max = input8;
         }
         
         if (input8 < min)
         {
            min = input8;
         }
         

      } while ( input8 > 0); 
      
      double average8 = (sum8 / count8);
      System.out.println("The average of the entered numbers: " + average8 + "\nThe max number is: " + max + "\nThe min number is: " + min);
   
   //#9 

      int number9;

      for(number9 = 2; number9 <= 50; number9 = number9 + 2)
      {
         if (number9 % 2 == 0)
         {
            System.out.print(number9 + " ");
         }
         else
         {
            break;
         }
      }  

   //#10

      //declare variables here
      int userInput10;
      int count10 = 0;
      double average10;
      int min10 = 2000000000;
      int max10 = 0;
      int userInputNumber10;
      int sum10 = 0;
      int breaker10;
      int integers10;
      int inputAmount10;
      int inputAmountSpecifier = 0;

       /*
       do this shit later because i suck
       //start do while sequence
       do 
       {
         System.out.println("How many numbers do you want to enter? ");
         

         
         
       }
       */

   //#11

      int userInput11;

      //user input
      System.out.println("\nEnter a number for the sequence: ");
      userInput11 = keyboard.nextInt();

      //loop
      System.out.print("\nThe first " + userInput11 + "numbers in the Fabonacci sequence");

      int firstTerm = 0, secondTerm = 1;
      System.out.println("Fibonacci Series till " + userInput11 + " terms:");

      for (int i = 1; i <= userInput11; ++i) {
      System.out.print(firstTerm + ", ");

      // compute the next term
      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm; }
   
   //#12
      final int BASE_SIZE = 8;

      for (int r = 0; r < BASE_SIZE; r++)
      {
         for (int c = 0; c < (r+1); c++)
         {
            System.out.print("*");
         }
         System.out.println();
      }
      System.out.println("\n");

      int myrows = 8;
      
      for (int m = 1; m <= myrows; m++)
      {
         for (int n=myrows; n>m; n--)
            {
             System.out.print(" ");
            }
         for (int p=1; p<=(m * 2) -1; p++)
         {
            System.out.print("*");
         }
         System.out.println();
      }
      
      int i, j, row = 6;       
      for (i=0; i<row; i++)   
      {  
         for (j=2*(row-i); j>=0; j--)
         {  
            System.out.print(" ");
         }   
         for (j=0; j<=i; j++ )
         {   
            System.out.print("* ");
         }   
      System.out.println();
      }

      

       
   
      
   }

   
}