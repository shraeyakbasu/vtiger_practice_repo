
public class linearsearch 
{
	public static int linearsearchalgo(int num,int numarray[])
	{
		int i;
		for( i=0;i<numarray.length;i++)
		{
			if(numarray[i] == num)
			{
				
				return i;
		    }
		}
		return -1;
		
	}

	public static void main(String[] args) 
	{
		int arr[] = {10,20,30,40,50}, num = 60;
		int position = linearsearchalgo(num,arr);
		if(position == -1) 
		{
		System.out.println("desired number not found");
		}
		else
		{
			System.out.println("desired number is found at"+position);	
		}
		
		

	}

}
