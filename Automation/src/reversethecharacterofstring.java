
public class reversethecharacterofstring
{

	public static void main(String[] args) 
	{
		String name="my name is shraeyak";
		String [] name1=name.split(" ");
		for(int i=name1.length-1;i>=0;i--)
		{
			
			System.out.print(name1[i]+" ");
		}

	}

}
