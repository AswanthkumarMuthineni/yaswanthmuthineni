package programs;
import java.io.*;
public class Filelinputstream {
public static void main(String args[])throws Exception
{
	FileInputStream fi=new FileInputStream("\\C:\\java ex\\mytelbillpaymodule15.java");
	int i=fi.read();
	while(i!=-1)
	{
		System.out.print ((char)i);
		i=fi.read();
	
	}
	fi.close();
}
}
