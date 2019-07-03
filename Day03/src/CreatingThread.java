
public class CreatingThread {

	public static void main(String[] args) {
		
		Thread humans = new Thread(() ->  {
			while(true) {
				System.out.println("Thinking smartly...");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		humans.start();
		
		/*Thread humans = new Thread(new Runnable() {
			public void run() {
				while(true) {
					System.out.println("Thinking...");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		humans.start();*/
	}

}
