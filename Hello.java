//Too verbose
//Not elegant
//Imperative style of programming
public class Hello {
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			System.out.println("Hello Shruti");
		}
		
		IntStream
			.range(1, 10)
			.forEach(System.out.println("Hello Shruti"));
	}
}