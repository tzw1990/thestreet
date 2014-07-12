public class MyString3 {

	private String str;

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	@Override
	public int hashCode() {
		return str.hashCode();
	}
	
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof MyString3)) {
			return false;
		}
		
		return str.equals(((MyString3)o).getStr());
	}
}
