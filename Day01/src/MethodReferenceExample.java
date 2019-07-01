import java.util.Arrays;
import java.util.List;

public class MethodReferenceExample {

	public static void main(String[] args) {
		Book book = title -> System.out.println("Buying " + title); 
		book.buy("Programming Kotlin");
		
		Book book2 = MethodReferenceExample::buyBookFromAmazon;
		book2.buy("Confused Souls");
		
		/*Book book3 = title -> {
			System.out.println("Go to Amazon");
			System.out.println("Go to Flipkart");
			System.out.println("Compare the prices of " + title);
			System.out.println("Finally buy it in Platform shop");
		};*/
		Book book3 = MethodReferenceExample::buy;
		book3.buy("ABC");
		
		MethodReferenceExample mre = new MethodReferenceExample();
		Book book4 = mre::buyFromStore;
		
		List<String> cities = Arrays.asList("Chennai", "Pune", "Mumbai");
		cities
			.stream()
			.map(String::toUpperCase)
			.forEach(System.out::println);
		
		
	}
	private void buyFromStore(String title) {
		System.out.println("Go to Amazon");
		System.out.println("Go to Flipkart");
		System.out.println("Compare the prices of " + title);
		System.out.println("Finally buy it in Platform shop");
	}
	
	private static void buy(String title) {
		System.out.println("Go to Amazon");
		System.out.println("Go to Flipkart");
		System.out.println("Compare the prices of " + title);
		System.out.println("Finally buy it in Platform shop");
	}
	
	private static void buyBookFromAmazon(String title) {
		System.out.println("Buying " + title + " from Amazon");
	}

}

interface Book {
	void buy(String title);
}
