import java.util.Scanner;

public class programmingchallenge19
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = keyboard.nextLine();

        System.out.println("What is your age? ");
        int age = keyboard.nextInt();

        System.out.println("What city are you from? ");
        String city = keyboard.nextLine();

        System.out.println("What college did you go to? ");
        String college = keyboard.nextLine();

        System.out.println("What is your profession? ");
        String profession = keyboard.nextLine();

        System.out.println("What animal do you have? ");
        String animal = keyboard.nextLine();

        System.out.println("What did you name your pet?");
        String petName = keyboard.nextLine();

        System.out.println("There was once a person named " + name + " who lived in " + city + ". At the age of " + age + ", " + name + " went to college at " + college + ". " + name 
        + " graduated and went to work as a " + profession + ". Then, " + name + " adopted a(n) " + animal + " named " + petName + ". They both lived happy ever after");



    }
}