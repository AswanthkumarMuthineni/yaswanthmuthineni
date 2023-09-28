package programs;

public class arrayduplicateelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ab[]= {1,2,3,4,5,2,8,6,9,1,3,8,9,7,9,5,7,5,6,9,3,8,1,0,9,7,0,9,9};
		int l=ab.length;
		for(int i=0;i<l;i++)
		{
			for(int j=i+1;j<l;j++)
			{
				if(ab[i]==ab[j])
				{
					System.out.println(ab[j]+"\nsss");
				}
			}
		}
		


	}

}
