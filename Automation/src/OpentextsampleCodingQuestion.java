import java.util.Arrays;

public class OpentextsampleCodingQuestion 
{
	
	public static int opentextdemo(int arr[])
	{
		int returnnum,max=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		/*Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<=0)
			{
				return 0;
			}
			else
			{
				returnnum=arr[arr.length-1];
				return returnnum+1;
			}
			
		}
		
		return -1;
		
	}*/
		return max+1;
	}

	public static void main(String[] args) 
	{
		int sample[]= {-2,-6,-3,4,-10,-8};
		int number=opentextdemo(sample);
		System.out.println(number);

	}

}
