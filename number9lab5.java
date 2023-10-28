import java.io.*;
import java.util.Scanner;

public class number9lab5 

{
    public static void main(String[] args) throws IOException
    {
        Scanner keyboard = new Scanner(System.in);
        
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

    }
}
