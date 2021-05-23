
public class reversethecharacterofstringway2 
{

	public static void main(String[] args) 
	{
		String name="my name is shraeyak";
		String rev="";
		String [] name1=name.split(" ");
		for(int i=0;i<name1.length;i++)
		{
			rev=name1[i]+" "+rev;
		}

		System.out.println(rev);
	}

}
