package programs;
import java.io.*;
public class outputdataout {
public static void main(String args[])throws IOException
{
	int a=938109;
	FileOutputStream file =new FileOutputStream("\\C:\\java ex\\mytelbillpaymodule15.java\\");
	DataOutputStream data =new DataOutputStream(file);
	data.write(a);
	data.flush();
	data.close();
	file.close();
	
}
}
