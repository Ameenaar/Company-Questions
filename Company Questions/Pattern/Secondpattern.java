package Pattern;
import java.util.Scanner;
public class Secondpattern {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=n-1;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}
