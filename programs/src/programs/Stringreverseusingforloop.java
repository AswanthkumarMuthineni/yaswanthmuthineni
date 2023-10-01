
package programs;
import java.util.*;
public class Stringreverseusingforloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stringreverseusingforloop r=new Stringreverseusingforloop();
		Scanner sc =new Scanner(System.in);
		System.out.print("enter:");
		String s=sc.nextLine();
		
		System.out.println("Reverse of string is :"+r.reversestr(s));
		
	}
static String reversestr(String s1)
{
	String r1="";
	for(int i=s1.length();i>0;--i)
	{
		r1=r1+(s1.charAt(i-1));
	}
	return r1;
}
	

	}


