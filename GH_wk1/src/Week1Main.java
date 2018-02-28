
//import scanner to be used for user input
import java.util.Scanner;

public class Week1Main {
	// this is my main class that will get user input

	public static void main(String[] args) {
		
		//create a scanner object to hold user input
		// I named it 'input', but I could have named it something else such as 'Scanner whatever = new Scanner'
		Scanner input = new Scanner(System.in);
		
		// I want to be able to use methods from the healthProfile class, so I created an object called borrowInfo ******
		HealthProfile borrowInfo = new HealthProfile();
		
		// ask patient for their name
		System.out.println("Enter your first and last name: ");
		//store the patient's answer in our scanner called 'input' and the variable 'name'
		String name = input.nextLine();
		// return patient's input to the method setName 
		borrowInfo.setName(name);
		
		System.out.println(name);
		
		

	}

}
