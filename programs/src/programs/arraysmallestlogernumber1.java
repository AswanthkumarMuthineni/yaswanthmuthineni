package programs;

public class arraysmallestlogernumber1 {
	public static void main(String args[])
	{
	int ar[]={10,6,5,9,40,70,90,60,6,2,99};
	int l=ar.length;
	int min=ar[0];
	for(int i=0;i<l;i++)
	{
	if(min>ar[i])
	{
	min=ar[i];
	ar[0]=min;
	}
	}
	System.out.println(ar[0]);

	int la=ar.length;
	int loger=ar[l-1];
	for(int i=0;i<la;i++)
	{
	if(loger<ar[i])
	{
	loger=ar[i];
	ar[la-1]=loger;
	}
	}
	System.out.println(ar[la-1]);
	}
	}


