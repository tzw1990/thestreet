public class TestMySingleton {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 0; i < 10; i++) {
			new Thread() {
				@Override
				public void run() {
					MySingleton singleton = MySingleton.getInstance();
					System.out.println(Thread.currentThread().getName());
				}
			}.start();
		}
	}

}
