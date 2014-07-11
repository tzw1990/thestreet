import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparable {

	public static void main(String[] args) {
		Person p1 = new Person("Robert", 25);
		Person p2 = new Person("Kevin", 38);
		Person p3 = new Person("George", 24);
		
		List<Person> list = new ArrayList<Person>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		System.out.println("before sorting...");
		
		Collections.sort(list);
		for(Person p : list) {
			System.out.println(p);
		}
	}
}
