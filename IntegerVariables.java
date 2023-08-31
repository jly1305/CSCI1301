// this program has variables of several of the integer types.

public class IntegerVariables
{
public static void main(String[] args)
   {
      int checking; //declare an int variable named checking
      byte miles; //declare a byte variable named miles
      short minutes; //declare a short variable named minutes
      long days; //declare a long varbable named days
      
      checking = -20;
      miles = 105;
      minutes = 120;
      days = 365;
      System.out.println("we have made a journey of " + miles + " miles.");
      
      System.out.println("It took us " + minutes + " minutes.");
      System.out.println("You have " + checking + " dollars in your bank account.");
      System.out.println("About" + days + " days ago, columbus "
      + "stood on this spot");
   }
}