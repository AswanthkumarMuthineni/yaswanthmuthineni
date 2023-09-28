package programs;

public class patten02 {
	public static void main(String args[])
	{
		int n=6;
		for(int i=1;i<=n-1;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=n-1-i;k++)
			{
				System.out.print("1 ");
			}
			System.out.println();
		}
	}

}
