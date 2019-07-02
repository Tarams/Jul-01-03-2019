//javac --enable-preview --release 12 SwitchCase.java
//java --enable-preview SwitchCase
public class SwitchCase {
	public static void main(String[] args) {
		int num = 11;
		int denom = num % 2;
		
		//switch-case is an Expression
		//Pattern matching
		String result = switch(denom) {
			case 1 -> "Odd";
			case 0 -> "Even";
			default -> "WTH is going on";
		};
		
		//String result2 = "Even" if denom == 0;
		//String result3 = "Odd" if denom == 1;
	
			
		//switch-case statement
		
		/*
		String result = "";
		switch(denom) {
			case 1:
				result = "Odd";
				break;
			case 0:
				result = "Even";
				break;
			default:
				result = "Not sure";		
		};*/
			
			
			
		System.out.println(result);
	}
}