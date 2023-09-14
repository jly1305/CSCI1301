//Project 3 Luke Tierney
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Luke_Lab_3
{
   public static void main(String[] args)
   { 
      //#2
      String welcome_String = "Welcome to CSCI 1301 :-)";
      String email_String = "paige.adams1@bobcats.gcsu.edu";
      String single_Char_String = "#";
      String Empty_String = " ";
      
      System.out.println("Welcome String: " + welcome_String);
      System.out.println("Email String: " + email_String);
      System.out.println("Single Character String: " + single_Char_String);
      System.out.println("Empty String: " + Empty_String); 
      
      //#3
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
      
      //#4
      Scanner keyboard = new Scanner (System.in);
      
      String first_Name, last_Name;
      
      System.out.println("Please Enter Your First Name: ");
      first_Name = keyboard.nextLine();
      
      System.out.println("Please Enter Your Last Name: ");
      last_Name = keyboard.nextLine();
      
      System.out.println("First name: " + first_Name + "\nLast Name: " + last_Name);
      
      //#5
      
      String name; // to hold a name
      int hours; // hours worked
      double payRate; // the rate of pay 
      double bonusAmount; //da bonus
      double grossPay; //hours*payrate + bonus

      System.out.println("Enter your name: ");
      name = keyboard.nextLine();

      System.out.println("Enter your weekly working hours: ");
      hours = keyboard.nextInt();

      System.out.println("Enter your hourly rate: ");
      payRate = keyboard.nextDouble();

      System.out.println("Enter any bonus amount (if applicable): ");
      bonusAmount = keyboard.nextDouble();

      grossPay = ((hours * payRate) + bonusAmount);
      
      System.out.println("Employee Information\nName: " + name + "\nWeekly Working Hours: " + hours + " hours" + "\nHourly Rate: $" + payRate + " per hour" + "\nBonus: $" + bonusAmount + "\nWeekly Salary(Including bonus): $" + grossPay);

      //#6
      String full_name = JOptionPane.showInputDialog("Enter Your Name. ");
      
      String wh_String = JOptionPane.showInputDialog("Enter number of hours worked per week. ");

      String rate_String = JOptionPane.showInputDialog("Enter your rate: ");

      int wh_int = Integer.parseInt(wh_String);
      
      double rate_double = Double.parseDouble(rate_String);

      JOptionPane.showMessageDialog(null, "Name: " + full_name + "\n Working Hours: " + wh_int + "\n Rate: " + rate_double + "\n Salary: " +(rate_double * wh_int));

   }
}