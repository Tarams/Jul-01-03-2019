public class LambdaExample {

	public static void main(String[] args) {
		//Traditional
		Greetings greetings = new GreetingsImpl();
		String message = greetings.hello("Sam");
		System.out.println(message);

		//Intermediate
		Greetings greetingsAnon = new Greetings() {
			public String hello(String name) {
				return "Hi " + name;
			}
		};
		String message2 = greetingsAnon.hello("Sam");
		System.out.println(message2);
		
		
		//Modern
		//Lambda expressions are synthesized to new classes during runtime
		//Lambda expressions are implementations of interfaces with ONE method
		Greetings greetingsModern = name -> "Hey " + name;
		String message3 = greetingsModern.hello("Sam");
		System.out.println(greetingsModern.getClass().getName());
		System.out.println(message3);
	}

}

class GreetingsImpl implements Greetings {
	public String hello(String name) {
		return "Hello " + name;
	}
}

interface Greetings {
	String hello(String name);  
}