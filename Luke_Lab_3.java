import java.util.Scanner;

public class Luke_Lab_3
{
   public static void main(String[] args)
   {
      String welcome_String = "Welcome to CSCI 1301 :-)";
      String email_String = "paige.adams1@bobcats.gcsu.edu";
      String single_Char_String = "#";
      String Empty_String = " ";
      
      System.out.println("Welcome String: " + welcome_String);
      System.out.println("Email String: " + email_String);
      System.out.println("Single Character String: " + single_Char_String);
      System.out.println("Empty String: " + Empty_String); 
      
      String main_String = "Coding is easy as ABC!";
      
      System.out.println(main_String);
      
      String str1 = main_String.toUpperCase();
      System.out.println(str1);
      
      String str2 = main_String.toLowerCase();
      System.out.println(str2);
      
      int length;
      length = main_String.length();
      
      System.out.println("Length of the string: " + length);
      
      char first_letter  = main_String.charAt(0);
      char last_letter = main_String.charAt(length-1);
      char middle_letter = main_String.charAt(length / 2);
      
      System.out.println("First character: " + first_letter);
      System.out.println("Last character: " + last_letter);
      System.out.println("Middle character: " + middle_letter); 
      
      Scanner keyboard = new Scanner (System.in);
      
      String first_Name, last_Name;
      
      System.out.println("Please Enter Your First Name: ");
      first_Name = keyboard.nextLine();
      System.out.println("First Name: " + first_Name);
      
      System.out.println("Please Enter Your Last Name: ");
      last_Name = keyboard.nextLine();
      System.out.println("Last Name: " + last_Name);
      
      System.out.println("First name: " + first_Name + "\nLast Name: " + last_Name);
      
      
      
      
      
   }
}