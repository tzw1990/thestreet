public final class User5 {

	private String name;
	private int age;
	
	public User5() {
		
	}
	public User5(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public User5 increase() {
		return new User5(getName(), getAge() + 1);
	}
}
