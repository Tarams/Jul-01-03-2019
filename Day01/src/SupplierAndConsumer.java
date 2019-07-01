import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierAndConsumer {

	public static void main(String[] args) {
		//Consumer consumes the data you pass
		//Does not return anything
		//forEach method accepts a Consumer as argument
		Consumer<Integer> consumer = num -> System.out.println(num);
		consumer.accept(12);
		
		
		//Supplier gives you data
		//Collectors in Stream API are suppliers of information
		
		Supplier<Double> randomSupplier = () -> Math.random() * 100;
		System.out.println(randomSupplier.get());
		System.out.println(randomSupplier.get());
		
		Supplier<Date> now = () -> new Date();
		System.out.println(now.get());
		System.out.println(now.get());
	}

}
