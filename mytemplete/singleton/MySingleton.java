public class MySingleton {

	/**
	 * static field for the synchronized block in getInstance method
	 * it's class level access
	 */
	private static MySingleton singleton;
	
	private MySingleton() {
		System.out.println("creating MySingleton instance...");
	}
	
	public static MySingleton getInstance() {
		if (singleton == null) {
			synchronized (MySingleton.class) {
				if (singleton == null) {
					singleton = new MySingleton();
				}
			}
		}
		
		return singleton;
	}
}
