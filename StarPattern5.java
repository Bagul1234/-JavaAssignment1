package Pattern_java;

public class StarPattern5 {
	public static void main(String[] args) {
		 int star = 5;

	        for (int i = 1; i <= star; i++) {
	            
	            for (int j = star - i; j > 0; j--) {
	                System.out.print(" ");
	            }

	           
	            for (int k = 1; k <= 2 * i - 1; k++) {
	                System.out.print("*");
	            }

	            System.out.println();
	        }
	    }
	}



	

