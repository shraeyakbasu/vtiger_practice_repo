
public class addelementsofarrays 
{

	public static void main(String[] args) 
	{
		int a[]= {10,20,30};
		int b[]= {40,50,60,100};
		int length=a.length;
		if(length<b.length)
		{
			length=b.length;
		}
		
		for(int i=0;i<length;i++)
		{
			try
			{
				System.out.println(a[i]+b[i]);	
			}
			catch (Exception e) 
			{
				try
				{
					System.out.println(a[i]);	
				}
				catch (Exception e1) 
				{
					System.out.println(b[i]);
				}
				
			}
			
		}

	}

}
