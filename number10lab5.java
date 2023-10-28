import java.io.*;
import java.util.Scanner;

public class number10lab5 
{
    public static void main(String[] args) throws IOException
    {
        //Scanner declaration 
        Scanner keyboard = new Scanner(System.in);
        
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
        

        //start do while sequence
        do
        {
            System.out.println("How many numbers do you want to enter?");
            userInput10 = keyboard.nextInt();
            
            for (; count10 < userInput10; count10++ )
            {
                System.out.println("Enter number: ");
                userInputNumber10 = keyboard.nextInt();
                
                if (userInput10 > max10)
                {
                    max10 = userInput10;
                }
                
                if (userInput10 < min10)
                {
                    min10 = userInput10;
                }

                
            }
            
            breaker10 = count10 + 1;
            sum10 += userInput10;
            average10 = (sum10 / count10);
        
        } while (count10 >= breaker10);
        
        System.out.println("Average of numbers " + average10 + "\nSum of numbers: " + sum10 + "\nMaximum Value: " + max10 + "\nMinimum Value: " + min10);
        
    }
}
