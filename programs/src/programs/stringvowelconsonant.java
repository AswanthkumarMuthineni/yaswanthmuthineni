
package programs;

public class stringvowelconsonant {
	public static void mian(String args[]){
		int v=0;
				int c=0;
		String s="java html testing";
		s=s.toLowerCase();
		for(int l=0;l<s.length();l++)
		{
			if(s.charAt(l)=='a'||s.charAt(l)=='e'||s.charAt(l)=='i'||s.charAt(l)=='O'||s.charAt(l)=='u')
			{
				v++;
			}
		else if(s.charAt(l)>='a' && s.charAt(l)<='z')
		{
			c++;
		}
			
		}
		System.out.println("vowels: "+v);
		System.out.println("consonanta :"+c);
	}

}
