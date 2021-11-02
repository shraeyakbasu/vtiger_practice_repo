
// display the lowest integer value that is missing in the array
// for array containing only negetive no it will return 1

import java.util.Arrays;

public class opentextsample2 
{

	public static int opentextdemo(int arr[])
	{
		Arrays.sort(arr);
		int maxvalue=arr[(arr.length-1)];
		if(maxvalue<=0)
		{
			return 1;
		}
		else {
			for(int i=0;i<=arr.length;i++)
			{
				for(int j=1;j<=maxvalue;j++)
				{
				  if(arr[i]==j)
				  {
					  i++;
				  }
				  else
					  return j;
					
				}
				
			}
		}
		return -1;
	}
	public static void main(String[] args)
	{
		int sample[]= {1,4,3,1,10,8};
		int number=opentextdemo(sample);
		System.out.println("the lowest positive missing number is "+number);

	}

}
