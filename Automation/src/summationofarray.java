
public class summationofarray 
{

	public static void main(String[] args) 
	{
		int sum=0;
		int  i,j;
		int arr[]= {10,20,30,40,50,60,70,80,90};
		for(i=0;i<=arr.length-1;i++)
		{
				sum=sum+arr[i];
		}
		
        System.out.println("sum of the given array is "+sum);
	}

}
