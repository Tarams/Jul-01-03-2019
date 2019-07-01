
public class LambdaExample2 {

	public static void main(String[] args) {
		//Shape shape = () -> System.out.println("Drawing");
		//shape.draw();
		
		Animal dog = () -> System.out.println("Chasing and eating");
		//Animal cat = () -> "chasing";
		
		dog.eat();
		
		Car bmw = () -> 120;
		int speed = bmw.drive();
		
		Car swift = () -> {
			int speedPerHour = 12 * 10 * 6;
			return speedPerHour;
		};
		swift.drive();
		
		Print print1 = (name, age) -> System.out.println(name + " " + age);
		Print print2 = (String name, int age) -> System.out.println(name + " " + age );
		 
	}

}

interface Print {
	void printBio(String name, int age); 
}

interface Car {
	int drive(); 
}

@FunctionalInterface
interface Animal {
	void eat();
	//void walk();
}

//Not a functional interface
interface Shape {
	void draw();
	double area();
}