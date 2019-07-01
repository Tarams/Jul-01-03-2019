import java.util.Arrays;
import java.util.List;

public class MondayBlues {

	public static void main(String[] args) {
		List<String> cities 
			= Arrays.asList("Chennai", "Cochin", "Pune", "Mumbai", "Bhopal");

		//oldStyle(cities);
		declarativeStyle(cities);
	}
	
	//Declarative style
	//You only specify WHAT TO DO and NOT how to do
	//ELEGANT
	//not verbose
	//No external iterators
	//No external conditionals
	//No mutability
	//chain and compose functions
	private static void declarativeStyle(List<String> cities) {
		cities
			.stream()
			.parallel()
			.filter(city -> city.startsWith("C"))
			.filter(city -> city.length() < 6)
			.forEach(System.out::println);
		
		cities
			.stream()
			.filter(city -> city.length() < 6)
			.forEach(System.out::println);
		
		
	}
	

	//No Parallel processing
	//What if you have 100K cities
	//How will you process it parallely?
	//Use Threads or ForkJoinPool
	
	//Not elegant
	//if-else construct, loops, array indices
	
	




	//Too verbose
	//Not elegant
	//Imperative style of programming
	//Specify what to do and ALSO how to do
	private static void oldStyle(List<String> cities) {
		//Print the cities beginning with letter C
		for (int i = 0; i < cities.size(); i++) {
			String city = cities.get(i);
			if(city.startsWith("C")) {
				System.out.println(city);
			}
		}
		
		//Print the name of cities with length less than 6
		for (String city : cities) {
			if(city.length() < 6) {
				System.out.println(city);
			}
		}
	}

}
