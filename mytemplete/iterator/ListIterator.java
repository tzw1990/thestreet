import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterator {

	public static void main(String[] args) {
		/**
		 * iterator a list (3 ways)
		 */
		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(4);
		list.add(1);
		list.add(0);
		// 1. for index
		for(int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + " ");
		System.out.print("\n");
		
		// 2. for :
		for(int i : list)
			System.out.print(i + " ");
		System.out.print("\n");
		
		// 3. iterator
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}
}
