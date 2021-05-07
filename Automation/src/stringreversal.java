
public class stringreversal 
{

	public static void main(String[] args) 
	{
		
		String name="shraeyak";
		String reversename="";
		int length= name.length();
		
		for(int i=length-1;i>=0;i--)
		{
			reversename=reversename+name.charAt(i);
		}
		
		System.out.println(reversename);
		
		
		StringBuffer sb=new StringBuffer(name);
		System.out.println(sb.reverse());

	}

}
