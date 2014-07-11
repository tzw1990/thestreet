public class User implements Cloneable{

	private String name;
	private int age;
	
	public User() {
		
	}
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	
	@Override
	public User clone() throws CloneNotSupportedException {
		User u = null;
		try {
			u = (User)super.clone();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return u;
	}
}
