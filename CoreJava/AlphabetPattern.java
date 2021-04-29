package CoreJava;

public class AlphabetPattern {
	
	public static void main(String args[]) {

		System.out.println("Lets Print Alphabets in a Right Angled Triangle");
		
		int a=64;
		
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print((char) (a + j) + " ");
			}	
		System.out.println();
	}
	}
}
