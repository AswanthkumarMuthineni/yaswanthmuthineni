package programs;

public class stringcountpunctuation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int count =0;
String s="chi/nni said?,'u r the -student! of sp goble'. gf;";
for(int i=0;i<s.length();i++)
{
	if(s.charAt(i)=='!'||s.charAt(i)==','||s.charAt(i)==';'||s.charAt(i)=='.'||s.charAt(i)=='-'||s.charAt(i)=='\''||s.charAt(i)=='\"'||s.charAt(i)==':')
	{
		count++;
	}
}
System.out.println("number of puncnaction "+count);
	}

}
