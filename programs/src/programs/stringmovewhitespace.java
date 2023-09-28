package programs;

public class stringmovewhitespace {
	public static void main(String args[])
	{
		String str1="i love srav";
		str1 = str1.replaceAll("\\s+","");
		 System.out.println("removeing white spaces"+str1);
		
	}

}
