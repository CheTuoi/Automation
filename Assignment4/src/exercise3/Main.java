package exercise3;

public class Main {
	
	public static void main(String[] args) {
		String s = "Pham Tuoi";
		
		MyCharSequence m = new MyCharSequence(s);
		
		System.out.println(m.length());
		System.out.println(m.charAt(10));
		System.out.println(m.subSequence(0, 9));
		System.out.println(m.toString());
		
	}

}
