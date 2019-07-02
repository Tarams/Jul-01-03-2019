
* You have a Logger class as given below
```java
class Logger {
	private int level = 1;

	public Logger() {
	}
	public Logger(int level) {
		this.level = level;
	}
	public boolean isDebugEnabled() {
		return level == 1;
	}
	public void debug(String message) {
		System.out.println(message);
	}
}
```

* An user uses the Logger like this
```java
		Logger logger = new Logger();
		if (logger.isDebugEnabled()) {
			logger.debug("Look at this horrible error");
		}
```

* Create Lab02.java with a **main()** method. 
* Modify *Logger* class in such a way that the user uses it like this

```java
	Logger logger = new Logger();	
	logger.debug(() -> {
		//send email
		return "Look at this horrible error";
	});
	
	logger.debug(() -> {
		//store it in DB
		return "hmm interesting error";
	});
	
	logger.debug(() -> "Incorrect input");
```


