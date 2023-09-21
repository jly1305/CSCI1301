import javax.swing.JOptionPane;

public class programmingchallenge19joption
{
	public static void main(String[] args)
	{	
		String name, city, college, profession, animal, petName, inputAge;
		int age;

		name = JOptionPane.showInputDialog("What is your first name?");
		
		inputAge = JOptionPane.showInputDialog("How old are you?");
		age = Integer.parseInt(inputAge);

		city = JOptionPane.showInputDialog("What city are you from?");

		college = JOptionPane.showInputDialog("What college did you go to?");

		profession = JOptionPane.showInputDialog("What is your profession?");

		animal = JOptionPane.showInputDialog("What pet do you have?");

		petName = JOptionPane.showInputDialog("What is the name of your pet?");

		JOptionPane.showMessageDialog(null, "Once, there was a guy named " + name + ". He was " + age + " years old, and he studied at " + college +
						". He now works as a " + profession + ". He has one " + animal + " named " + petName + ". ");

		System.exit(0);

	}

}

		


