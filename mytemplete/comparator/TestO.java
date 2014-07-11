public class TestO implements Comparable<TestO>{

	private int number;
	
	public TestO(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public int compareTo(TestO o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
