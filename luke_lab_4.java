import java.util.Scanner;

public class luke_lab_4 
{

    //#2
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please enter a value");
        int number = keyboard.nextInt();
        System.out.println("You entered: " + number);

        if (number >= 100)
        {
            System.out.println("The input value is " + number);
        }

        //#3
        System.out.println("Please enter a character: ");
        char enteredValue = keyboard.next().toLowerCase().charAt(0);
        System.out.println("You entered: " + enteredValue);

        if (enteredValue >= 'm');
        {
            System.out.println("The input character is greater than or equal to M.");
        }
	
        //#4
        System.out.println("Please enter a the sales amount: ");
        double salesAmount = keyboard.nextDouble();
        System.out.println("Original sales amount: " + salesAmount);

        double discountedAmount = salesAmount * 0.90;
        System.out.println("Sales amount after applied 10% discount: " + discountedAmount + "\t\tSave amount: " + (salesAmount - discountedAmount));
        
        if (discountedAmount >= 500)
        {
        discountedAmount = (discountedAmount - 10);
        double saveAmount = ((salesAmount - discountedAmount));
        System.out.println("After subtract $10, sales amount: " + discountedAmount + "\t\tSave amount: " + saveAmount);
        saveAmount = (saveAmount + (discountedAmount * .05));
        discountedAmount = (discountedAmount * .95);
        System.out.println("Amount after additional 5% discount-: " + discountedAmount + "\t\tSave amount: " + saveAmount);
       
        }
        System.out.println("The final price amount: " + discountedAmount + "\t\tFinal discounted amount: " + (salesAmount - discountedAmount));
        
        //#5
        System.out.println("Enter a number: ");
        int inpNumber = keyboard.nextInt();
        
        if (inpNumber % 2 == 0)
        {
        System.out.println(inpNumber + " is even.");        
        }
        else
        {
        System.out.println(inpNumber + " is false.");
        }
      
        //#6
        System.out.println("Enter a number: ");
        int inpNumber2 = keyboard.nextInt();
        
        if (inpNumber2 % 2 == 0 && inpNumber2 > 0)
         System.out.println("Accepted number");
        else
         System.out.println("Rejected number");
         
         //#7
         System.out.println("Input the day of the week: (1 for Monday, 2 for Tuesday...)");
         int dayOfTheWeek = keyboard.nextInt();
         
         if (dayOfTheWeek == 1)
            System.out.println("Today is monday");
         else if (dayOfTheWeek == 2)
            System.out.println("Today is tuesday");
         else if (dayOfTheWeek == 3)
            System.out.println("Today is wednesday");
         else if (dayOfTheWeek == 4)
            System.out.println("Today is thursday");
         else if (dayOfTheWeek == 5)
            System.out.println("Today is friday");
         else if (dayOfTheWeek == 6)
            System.out.println("Today is saturday");
         else if (dayOfTheWeek == 7)
            System.out.println("Today is sunday");
         else
            System.out.println("Please enter in a number 1-7");
            
         //#8
         System.out.println("How old are you?");
         int userAge = keyboard.nextInt();
         System.out.println("Did you pass the computer test? (T/F)");
         char computerTestPass = keyboard.next().toUpperCase().charAt(0);
         System.out.println("Did you pass the road test? (T/F)");
         char roadTestPass = keyboard.next().toUpperCase().charAt(0);
         
         if (userAge > 18)
         {
            if (computerTestPass == 'T')
            {
               if (roadTestPass == 'T')
                  System.out.println("You passed!");
               else
                  System.out.println("You did not pass becuase you did not pass the road test");
            }
            else
            {
            System.out.println("You are ineligible because you did not pass the computer test");
            } 
         }
         else
         {
         System.out.println("You are ineligible because you are under 18 years of age");        
         }
        
        
         //#9
         System.out.println("Enter the first number");
         double firstNumber = keyboard.nextDouble();
         System.out.println("Enter the second number");
         double secondNumber = keyboard.nextDouble();
         
         if (firstNumber > secondNumber)
         {
            System.out.println("Number one is  greater than number two");
         }
         else if (firstNumber < secondNumber)
         {
            System.out.println("Number one is less than number two");
         }
         else if (firstNumber == secondNumber)
         {
            System.out.println("Number one is equal to number two");
         }
        
         //#2 new sheet
         System.out.println("Enter a number");
         int userInputInRange = keyboard.nextInt();
         
         if (userInputInRange >= -10 && userInputInRange <= 10)
            System.out.println("Number in range");
         else
            System.out.println("Number out of range"); 
         
         //#3 new sheet
         System.out.println("Enter a letter");
         char userCharacterInRange = keyboard.next().toUpperCase().charAt(0);
         
         if (userCharacterInRange >= 'A' && userCharacterInRange <= 'Z')
            System.out.println("Valid Character");
         else
            System.out.println("Invalid Character");
            
            
         //#4 new sheet
         System.out.println("Enter a number");
         int userInputNumber = keyboard.nextInt();
         
         if (userInputNumber % 2 == 0 || userInputNumber % 5 == 0)
            System.out.println("Your number is even or a multiple of five");
         else 
            System.out.println("Your number is invalid");           
        
         //#5
         System.out.println("Enter a day of the week (MTWHFSN) ");
         String dayOfTheWeekUserInput = keyboard.next();
         char letterInp = dayOfTheWeekUserInput.toUpperCase().charAt(0);
         
         if (letterInp == 'M' || letterInp == 'T' || letterInp == 'W' || letterInp == 'H' || letterInp == 'F')
            System.out.println("This is a week day");
         else if (letterInp == 'S' || letterInp == 'N')
            System.out.println("This is a weekend day");
            
            
         //#6
         int result;  
         System.out.println("Enter a value");
         int inputUserInput = keyboard.nextInt();
         
         if (inputUserInput % 7 == 0)
            result = inputUserInput;
         else
            result = (inputUserInput * 3);
         System.out.println("Input: " + inputUserInput + " Result: " + result);
         
         //#7 
        System.out.println("Enter a character:");
        String monthInput = keyboard.next();
        char monthInputChar = monthInput.toLowerCase().charAt(0);
        
        switch (monthInputChar)
        {
            case 'j':
               System.out.println("January, June, July");
               break;
            case 'o':
               System.out.println("October");
               break;
            case 'f':
               System.out.println("February");
               break;
            case 'n':
               System.out.println("November");
               break;
            case 'm':
               System.out.println("March, May");
               break;
            case 'd':
               System.out.println("December");
               break;
            case 'a':
               System.out.println("April, August");
               break;
            default:
               System.out.println("Wrong Input");
        }
         
        //#8
        System.out.println("Enter your name");
        String u_Name = keyboard.next();
        
        System.out.println("Enter a number with a shitton of decimal places");
        double d_Num = keyboard.nextDouble();
        
        System.out.printf("The name is %s and the number is %f \n", u_Name, d_Num);
        System.out.printf("The name is %s and the number is %.4f \n", u_Name, d_Num);
        System.out.printf("The name is %s and the number is %.2f \n", u_Name, d_Num);
        System.out.printf("The name is %s and the number is %6.2f \n", u_Name, d_Num);
        System.out.printf("The name is %s and the number is %4.0f \n", u_Name, d_Num);
        System.out.printf("The name is %s and the number is %6.2f \n", u_Name, d_Num);
        
         
                

	






    }
}