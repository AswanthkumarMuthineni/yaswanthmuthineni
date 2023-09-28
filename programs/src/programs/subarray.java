package programs;

	import java.util.*;
	public class subarray{
	public static void findSubarray(int[] arr,int n,int sum)
	{
	int a=arr[0];
	int start=0;

	for(int i=1;i<=n;i++){
	while(a>sum && start < i-1)
	{
	a=a-arr[start];
	start++;
	}
	if(a==sum)
	{
	System.out.println("subarray index"+start+"and"+(i-1));
	return;
	}
	if(i<n)
	a=a+arr[i];
	}
	System.out.println("no sub array");
	}
	public static void main(String args[])
	{
	int[] arr={15,2,4,8,9,5,10,10,23};
	int n=arr.length;
	int sum=20;
	findSubarray(arr,n,sum);
	}
	}



