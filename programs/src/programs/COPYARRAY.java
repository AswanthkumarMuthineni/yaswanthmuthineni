package programs;

public class COPYARRAY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1[]={1,2,3,4,5,6,7,8,9,10};
		int a2[]=new int[a1.length];   //create another array arr2 with size of arr1
		for(int i=0;i<a1.length;i++)  // copying all elements of one array in to another
		{
		a2[i]=a1[i];
		}

		System.out.println();

		System.out.println("new array");
		for(int i=0;i<a2.length;i++)
		{
		System.out.print(a2[i]+ " ");
		}
		
	}

}
