package exercise3;

public class MyCharSequence implements CharSequence {
	String s;
	
	public MyCharSequence(String s) {
		char[] cArray = s.toCharArray();
		char[] reverseArray = cArray.clone();
		int j = cArray.length - 1;
		for(int i = 0; i < cArray.length; i++) {
			reverseArray[j] = cArray[i];
			j--;
		}
		this.s = new String(reverseArray);
		System.out.println(this.s);
	}
	@Override
	public int length() {
		return s.length();
	}

	@Override
	public char charAt(int index) {
		return s.charAt(index);
	}

	@Override
	public CharSequence subSequence(int start, int end) {
		return s.subSequence(start, end);
	}

	@Override
	public String toString() {
		return s;
	}
	
}