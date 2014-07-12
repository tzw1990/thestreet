public class TestHashCode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Person p1 = new Person();
//		Person p2 = new Person();
//		System.out.println(p1.hashCode());
//		System.out.println(p2.hashCode());
		
		MyString str = new MyString("abc");
		MyString str2 = new MyString("abecasdas");
		System.out.println(str.hashCode());
		System.out.println(str2.hashCode());
	}

}
