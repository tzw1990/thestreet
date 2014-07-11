import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class TestComparator {

	public static void main(String[] args) {
		Person p1 = new Person("Robert", 25);
		Person p2 = new Person("Kevin", 38);
		Person p3 = new Person("George", 24);
		
		List<Person> list = new ArrayList<Person>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		System.out.println("before sorting...");
		
		Collections.sort(list, new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				/**
				 * asc: p1 - p2
				 * des: p2 - p1
				 */
				return p1.getAge() - p2.getAge();
			}
		});
		
		Collections.sort(list, new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				return p2.getAge() - p1.getAge();
			}
		});
		
		for(Person p : list) {
			System.out.println(p);
		}
	}
}
