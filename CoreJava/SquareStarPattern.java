package Telusko;

public class SquareStarPattern {
	
	public static void main(String args[]) {
		
		System.out.println("I am printing a loop");
		
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