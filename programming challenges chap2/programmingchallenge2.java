/* Write a program that has the following string variables: firstName, middleName, and lastName.
 * initialize these with your first, middle, and last names. the program should also have the 
 * following char variables: firstInitial, middleInitial, and lastInitial. Store your first,
 * middle, and last initials in these variables. The program should display the contents of these 
 * variables on the secreen.
 */

public class programmingchallenge2 
{
    public static void main(String[] args)
    {
        String firstName, middleName, lastName;

        firstName = "Luke";
        middleName = "Nicholas";
        lastName = "Tierney";

       char firstInitial = 'A';
       char middleInitial = 'B';
       char lastInitial = 'C';

       

        System.out.println(firstName + middleName + lastName + firstInitial + middleInitial + lastInitial);

    }


    
}
