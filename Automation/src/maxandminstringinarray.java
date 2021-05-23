
public class maxandminstringinarray 
{

	public static void main(String[] args)
	{
		String maximum;
		String name[]= {"shraeyak","aishikee","india","boy","girl","toy","abcdefgh"};
		maximum=name[0];
		for(int i=1;i<name.length;i++)
		{
			if(maximum.length()<=name[i].length())
			{
				if(maximum.length()==name[i].length())
				{
					System.out.println(maximum);
					maximum=name[i];
				}
				maximum=name[i];
				
			}
		}
		System.out.println(maximum);
		}

}
