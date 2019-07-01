import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
		//Function takes any item of X and returns any item of Y
		//map in Stream API is a function that accepts Function as argument
		
		//take a number
		//cube it
		//double it
		//increment it by 1
		
		Function<Integer, Integer> cube = num -> num * num * num;
		Function<Integer, Integer> doubleIt = num -> num + num;
		Function<Integer, Integer> increment = num -> num + 1;
		
		int output = cube
			.andThen(doubleIt)
			.andThen(increment)
			.apply(2);
		System.out.println(output);
		
		
		Function<Integer, Integer> square = num -> num * num;
		int result = square.apply(12);
		System.out.println(result);
		
		Function<String, Integer> length = value -> value.length();
		System.out.println(length.apply("chennai"));
		System.out.println(length.apply("pune"));
		
		BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
		int sum = add.apply(12, 10);
		System.out.println(sum);
		
	}

}
