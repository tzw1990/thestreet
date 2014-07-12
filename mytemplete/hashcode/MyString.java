
public final class MyString {
	private String str;
	
	public MyString() {
		
	}
	public MyString(String str) {
		this.str = str;
	}
	
	public String getMyString() {
		return str;
	}
	
	@Override
	public String toString() {
		return str;
	}
	
	@Override
	public int hashCode() {
		/**
		 * string "abc"
		 * hashCode = "a"*31^2 + "b"*31 + "c"
		 */
		int code = 0;
		char[] array = str.toCharArray();
		for(int i = 0; i < array.length; i++) {
			code = code + array[i]*(int)Math.pow(31, str.length() - i - 1);
		}
		
		return code;
	}
	
	@Override
	public boolean equals(Object object) {
		if (!(object instanceof MyString)) {
			return false;
		}
		
		return this.str.equals(((MyString)object).getMyString());
	}
}
