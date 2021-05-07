
public class palindrome {

	public static void main(String[] args) 
	{
		String name="madam";
		String reversename="";
		int length= name.length();
		
		for(int i=length-1;i>=0;i--)
		{
			reversename=reversename+name.charAt(i);
		}
		if(reversename.equalsIgnoreCase(name))
		{
			System.out.println("string is palindrome");
		}
		else
		{
			System.out.println("string is not palindrome");
		}

	}

}
