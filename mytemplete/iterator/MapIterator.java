import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapIterator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * iterate a map
		 */
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(3, "Robert");
		map.put(4, "Kevin");
		map.put(1, "Peter");
		
		// 1.1 get key set with for :
		Set<Integer> keySet = map.keySet();
		for(int k : keySet) {
			System.out.println(k + ", " + map.get(k));
		}
		System.out.print("\n");
		// 1.2 get key set with iterator
		Iterator<Integer> it1 = keySet.iterator();
		while(it1.hasNext()) {
			int k = it1.next();
			System.out.println(k + ", " + map.get(k));
		}
		System.out.print("\n");
		// 2.1 get entry set with for :
		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
		for(Map.Entry<Integer, String> e : entrySet) {
			System.out.println(e.getKey() + ", " + e.getValue());
		}
		System.out.print("\n");
		// 2.2 get entry set with iterator
		Iterator<Map.Entry<Integer, String>> it2 = entrySet.iterator();
		while(it2.hasNext()) {
			Map.Entry<Integer, String> entry = it2.next();
			System.out.println(entry.getKey() + ", " + entry.getValue());
		}
	}

}
