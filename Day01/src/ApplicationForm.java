public class ApplicationForm {
	private String name;
	private int age;
	private String address;
	private long salary;
	public String getName() {
		return name;
	}
	public ApplicationForm setName(String name) {
		this.name = name;
		return this;
	}
	public int getAge() {
		return age;
	}
	public ApplicationForm setAge(int age) {
		this.age = age;
		return this;
	}
	public String getAddress() {
		return address;
	}
	public ApplicationForm setAddress(String address) {
		this.address = address;
		return this;
	}
	public long getSalary() {
		return salary;
	}
	public ApplicationForm setSalary(long salary) {
		this.salary = salary;
		return this;
	}
}
