package CompanyQuestions;
import java.util.Scanner;
public class Primefactor {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i;
		for(i=1;i<n;i++) 
		{
			if(n%i==0)
				System.out.println(i);
			
		}

		

	}

}
