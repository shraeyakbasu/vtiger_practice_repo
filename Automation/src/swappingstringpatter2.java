
public class swappingstringpatter2 
{

	public static void main(String[] args)
	{
		int i=0;
		String name="shraeyak";
		char [] name2=name.toCharArray();
		//System.out.println(name2);
		int j=i+1;
		while(i<=name2.length-2)                  //2 adjacent element swap
		{
			while(j<=name2.length-1)
			{
				char temp=name2[i];
				name2[i]=name2[j];
				name2[j]=temp;
				i+=2;
				j+=2;
			}
		}
		System.out.println(name2);
		}

}
