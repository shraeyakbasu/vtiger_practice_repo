
public class minimumstringinarray 
{

	public static void main(String[] args) 
	{
		String minimum;
		String name[]= {"shraeyak","aishike","india","boy","girl","toy"};
		minimum=name[0];
		for(int i=1;i<name.length;i++)
		{
			if(name[i].length()<=minimum.length())
			{
				if(name[i].length()==minimum.length())
				{
					System.out.println(minimum);
					minimum =name[i];
				}
				minimum=name[i];
				
			}
		}
		
		System.out.println(minimum);
	}

}
