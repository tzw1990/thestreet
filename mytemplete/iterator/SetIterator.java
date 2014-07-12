import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIterator {

	public static void main(String[] args) {
		/**
		 * iterate a set (random order)
		 */
		Set<Integer> set = new HashSet<Integer>();
		set.add(3);
		set.add(4);
		set.add(1);
		set.add(0);
		set.add(100);
		set.add(7);
		set.add(2000);
		
		// 1. for :
		for(int i : set)
			System.out.print(i + " ");
		System.out.print("\n");
		
		// 2. iterator
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}
}
