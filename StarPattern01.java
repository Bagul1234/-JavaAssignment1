package Pattern_java;

public class StarPattern01 {
	public static void main(String[] args) {
		int rows = 3;
        int stars = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
