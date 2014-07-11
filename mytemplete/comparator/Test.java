public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<TestO> list = new ArrayList<TestO>();
		list.add(new TestO(3));
		list.add(new TestO(1));
		list.add(new TestO(2));
		
		/**
		 * if TestO doesn't implements Comparable, compile error
		 */
		Collections.sort(list);
		
		Set<TestO2> set = new HashSet<TestO2>();
		set.add(new TestO2(3));
		set.add(new TestO2(1));
		set.add(new TestO2(2));
		for(TestO2 o2 : set)
			System.out.println(o2.getNumber());
	}

}
