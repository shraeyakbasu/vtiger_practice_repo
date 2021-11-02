import java.util.Arrays;

public class Anagram 
{

	public static void main(String[] args)
	{
	String first="abc";
	char[] charfirst=first.toCharArray();
	String second="cba";
	char[] charsecond=second.toCharArray();
	Arrays.sort(charfirst);
	Arrays.sort(charsecond);
	
	System.out.println(Arrays.equals(charfirst, charsecond));
	}


}
