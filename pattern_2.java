package Pattern_java;

public class pattern_2 {
	public static void main(String[] args) {
		int row=5;
		int num=1;
		int space=4,x;
		for(int i=1;i<=row;i++)
		{x=i;
			for(int j=1+i;j<=num;j++)
			{
				System.out.print(i+" ");
			}System.out.println();
			space++;
			x++;
		}
	}
}
