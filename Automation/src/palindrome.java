
public class palindrome {

	public static void main(String[] args) 
	{
		String name="java";
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
		
		StringBuffer sb=new StringBuffer(name);
		String revname=sb.reverse().toString();
		if(name.equals(revname))
		{
			System.out.println("palindrome");
		}
		else
			System.out.println("not palindrome");

	}

}
