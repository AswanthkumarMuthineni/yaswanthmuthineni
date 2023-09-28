package programs;

public class stringdivide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="spglobalsolution";
int length=s.length();
int n=4;
int temp =0,charact=length/n;
String[] equalStr =new String[n];
if(length % n !=0)
{
	System.out.println("String cannot be divided in to"+n+"equal parts");
}
else
{
	for(int i=0;i<length;i=i+charact)
	{
		String part =s.substring(i,i+charact);
		equalStr[temp]=part;
		temp++;
	}
	System.out.println(n+"equal parts in given string");
	for(int i=0;i<equalStr.length;i++)
	{
		System.out.println(equalStr[i]);
	}
}

	}

}
