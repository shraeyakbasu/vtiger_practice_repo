
public class stringreversalway3
{

	public static void main(String[] args) 
	{
		String name="shraeyak";
		String rev="";
		char [] name1=name.toCharArray();
		for(int i=0;i<name1.length;i++)
		{
			rev=name1[i]+rev;
		}
		System.out.println(rev);

	}

}
