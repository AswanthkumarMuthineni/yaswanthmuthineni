


package programs;
import java.util.*;
class mainmodule  {

public  void show()
{
System.out.println("WELCOME  TO MYTEL ");
System.out.println("Enter Options 1 for mobile reacharge ");
System.out.println("Enter Options 2 for pay bills ");
System.out.println("Enter Options 3  to convert prepaid to postpaid /postpaid to prepaid ");
System.out.println("Enter Options 4 to know the balance ");
System.out.println("Enter Options 5 for profile  details ");
System.out.println("Enter options 9 for go to main");
System.out.println("Enter Options 0 to exit");

}
}
class billpay extends mainmodule {
public void demo()
{	
super.show();
Scanner sc = new Scanner(System.in);
while(true) {

System.out.println("enter options:");
int option1=sc.nextInt();

switch(option1){


case 2 :
System.out.println("---------Bill pay module----------");
System.out.println("Enter post paid number:");
Scanner sc1=new Scanner(System.in);
long b=sc1.nextLong();

System.out.println("Bill due amount=900.50");
System.out.println("plese you can pay amount");


System.out.println("enter debit card number:");
Scanner sc3=new Scanner(System.in);
long e=sc3.nextLong();

System.out.println("Enter expiry date:");
Scanner sc4=new Scanner(System.in);
int f=sc4.nextInt();

System.out.println("Enter cvv:");
Scanner sc5=new Scanner(System.in);
int g=sc5.nextInt();
System.out.println("congrtulations your recharge is successfully completed");
break;

case 9:
super.show();
case 0:
	System.out.println("Exit");
	break;
}
}
}
}

public class mytel25 {
public static void main (String args[])
{
billpay obj=new billpay();
obj.demo();
obj.show();
}
}



