package programs;
import java.io.*;
public class datainputstreams {
public static void main(String args[])throws IOException
{
	DataInputStream di=new DataInputStream(System.in);
	System.out.println("enter you name");
	String name=di.readLine();
	System.out.println("hello"+name);
	di.close();
	
}
}
