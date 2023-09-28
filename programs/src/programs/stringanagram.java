package programs;
import java.util.*;
public class stringanagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="brag";
String s1="brag";
		
s=s.toLowerCase();
s1=s1.toLowerCase();
if(s.length()!=s1.length())
{
	System.out.println("both string are not anagram");
}
else
{
	char[] st1 = s.toCharArray();
	char[] st2 = s1.toCharArray();
	Arrays.sort(st1);
	Arrays.sort(st2);
	if(Arrays.equals(st1, st2)==true)
	{
		System.out.println("anagram");
		
	}
	else
	{
		System.out.println("not a anagram");
	}
}
	}

}
