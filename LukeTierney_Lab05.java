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
      
   
      
   
      
      
   }
}