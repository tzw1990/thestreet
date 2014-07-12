// class is final
public final class Person {
	private String name;	// all fields are private
	private int age;
	
	// provide constructor for initialization
	public Person() {
		
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// only have getter, no setter
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}
