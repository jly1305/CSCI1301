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
         char computerTestPass = keyboard.next().toLowerCase().charAt(0);
         System.out.println("Did you pass the road test? (T/F)");
         char roadTestPass = keyboard.next().toLowerCase().charAt(0);
         
         if (userAge > 18)
         {
            if (computerTestPass == 'T')
            {
               if (roadTestPass == 'T')
               {
               System.out.println("You passed!");
               }
               else
               {
               System.out.println("You did not pass becuase you did not pass the computer test");
               }
            }
            else
            {
            System.out.println("You are ineligible because you did not pass the road test");
            } 
         }
         else
         {
         System.out.println("You are ineligible because you are under 18 years of age");        
         }
        
        
        

	






    }
}
