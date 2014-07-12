import java.util.Random;

public class Person {

	private String name;
	private int age;
	
	public Person() {
		
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int hashCode() {
		return new Random().nextInt();
	}
	
	@Override
	public boolean equals(Object object) {
		/**
		 * need to check if the input object and this instance of the same class
		 * because override can not modify the type of input argument
		 */
		if (!(object instanceof Person)) {
			return false;
		}
		
		String tmp = ((Person)object).getName() + " " +((Person)object).getAge();
		return (this.getName() + " " + this.getAge()).equals(tmp);
	}
}
