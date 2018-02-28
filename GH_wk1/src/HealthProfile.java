
public class HealthProfile {

	//this class is where I will store info. For example, the age and name I get from the user in the other class will be stored in this class.
	// all I have to do to use the info stored in this class is to call it.
	
	//according to my assignment paper, I need to find the patient's (user's) name, age, weight, and height.
	//variables
	private String name;
	private double age, weight, height;
	
	//so I know I need to give the patient their BMI and BMI category. So why didn't I make variables for those as well? This is because ******
	
	//set methods. These are only needed if you are retrieving user input. 
	// setName is the name I chose to give the method. I could have named it stupidMethod. But we use set'Variable' to make it easier for others to read and understand. 
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(double age) {
		this.age = age;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	//get methods. I use these methods for variables that won't be storing user input. For example, BMI needs user input to calculate it, but my BMI variable will only hold the 
	// result of the calculation. If I wanted the user to find their BMI on their own and enter that in, then I would need a set and get method. 
	public String getName() {
		return name;
	}
	
	public double getAge() {
		return age;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public double getHeight() {
		return height;
	}
}
