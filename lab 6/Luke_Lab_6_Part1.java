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
      int userInput = keyboard.nextInt();
      multTable(userInput);
      
      evenOddCheck(12,3,true);

      Student student_1 = new Student("",0,0);
      student_1.setgpa(3.2);
      student_1.setname("Mark Jack");
      student_1.setid(2023001);
      System.out.println("Student 1 Information\n[" + student_1.getname() + ", " + student_1.getid() + ", " + student_1.getgpa() + "]"); 

      Student student_2 = new Student("JJ Adam", 3.55, 2023002);
      System.out.println("Student 2 Information\n[" + student_2.getname() + ", " + student_2.getid() + ", " + student_2.getgpa() + "]" );
      student_2.setgpa(3.66);
      System.out.println("Student 2 Updated Information\n[" + student_2.getname() + ", " + student_2.getid() + ", " + student_2.getgpa() + "]" );

      Student student_3 = new Student("Student 3 Name", 3.77, 2023003);
      System.out.println("Student 3 Information\n[" + student_3.getname() + ", " + student_3.getid() + ", " + student_3.getgpa() + "]" );

      System.out.println(student_1.toString());
      System.out.println(student_2.toString());
      System.out.println(student_3.toString());
      
      
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
   
   public static void multTable (int userInput)
   {
      int i = 0;  
     
      if (userInput > 0) 
      {
         while ( i <= 10)
         {
            System.out.println(i + " * " + userInput + " = " + (i * userInput));
            i++;
         }
      }
      else
      {
         System.out.println("Please enter a positive integer");
      }
   }
   
   public static void evenOddCheck (int num1, int num2, boolean isEven)
   {
       if (isEven == true)
         if (num1+num2 % 2 == 0)
          {
         isEven = true;
        System.out.println("The sum of the integers is even");
         }
      else if (isEven == false)
         if (num1 + num2 % 2 != 0)
         {
            isEven = false;
            System.out.println("The sum of the integers is false");
         }
    }
   


     
   
      
   
      
}