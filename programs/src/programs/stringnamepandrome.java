package programs;

public class stringnamepandrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="mam";
StringBuffer a=new StringBuffer(s);
a.reverse();
String rev=a.toString();
if(s.equals(rev))
{
	System.out.println("palindrome");
	
	
}
else {
	System.out.println("no apalindrome");
}
	}

}
