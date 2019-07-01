
* Implement the formula a^2 + b^2 + 2ab
* You have a=10 and b=12

```java
aSquare
	.andThen(bSquare)
	.andThen(twoAB)
	.apply(new Input(a,b));
	
	
public class Input {
	private int a;
	private int b;
	
	//ADD MORE CODE IF REQUIRED
}	
```