package programs;

public class pattenb {
	public static void main (String args[])
	{
		int n=6;
		for(int i=0;i<n;i++)
		{
			for(int j=5;j<i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
