package programs;
import java.io.*;
public class bufferdinputstreams {
public static void main(String argd[])throws Exception
{
	FileInputStream fi=new FileInputStream("\\C:\\java ex\\mytelbillpaymodule15.java");
	BufferedInputStream br=new BufferedInputStream(fi);
	long t=System.currentTimeMillis();
	int i=br.read();
	while(i!=-1)
	{
		System.out.print((char)i);
		i=br.read();
	}
	long t1=System.currentTimeMillis();
	System.out.println("time take is"+(t1-t)+"milliseconds");
	br.close();
	fi.close();
}
}
