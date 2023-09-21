import javax.swing.JOptionPane;
public class one 
{
    public static void main(String[] args)
    {
        String inputString = JOptionPane.showInputDialog("Enter a valid string");
        int number1 = inputString.length();

        JOptionPane.showMessageDialog(null, "The string is " + number1 + " characters long");

        String enterNum = JOptionPane.showInputDialog("Enter a number from 1-" + number1);
        
        int number2 = Integer.parseInt(enterNum);
        
        char amom = inputString.charAt(number2);

        JOptionPane.showMessageDialog(null, "character " + number2 + " in the string is " + amom );




        

        


    }
}
