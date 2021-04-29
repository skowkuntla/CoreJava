package CoreJava;

public class SquareStarPattern {
	
	public static void main(String args[]) {
		
		System.out.println("Lets print a star square");
		
			for(int i=1; i<=4; i++){			
				for(int j=1; j<=4; j++){
					if(i==1||i==4||j==1||j==4) {
				System.out.print("*");
				}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
	}

}