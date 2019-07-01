
public class ApplicationFormMain {

	public static void main(String[] args) {
		ApplicationForm form = new ApplicationForm();
//		form.setName("Sam");
//		form.setAge(23);
//		form.setAddress("Richmond Town");
//		form.setSalary(10000);
		
		//Fluent API
		form
			.setName("Sam")
			.setAge(12)
			.setAddress("Richmond Town")
			.setSalary(10000);
		
		/*ApplicationForm.submit(form -> {
			form
				.setName("Sam")
				.setAge(12)
				.setAddress("Richmond Town")
				.setSalary(10000);
		});*/
		
	}

}
