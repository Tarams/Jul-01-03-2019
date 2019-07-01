
public class WorkerImpl1 implements Worker {

	@Override
	public void perform() {
		
	}

}

class WorkerImpl2 implements Worker {

	@Override
	public void perform() {
		
	}
	
	@Override	
	public void signout() {
		Worker.super.signout();
	}

}

class WorkerImpl3 implements Worker {

	@Override
	public void perform() {
		
	}
	
	@Override
	public void fillTimesheet() {
		Worker.super.fillTimesheet();
	}

}

