
public class Removespecialcharacterinstring
{

	public static void main(String[] args)
	{
		String sample="^this string*contains+special/characters=";
		String newstring="";
		newstring=sample.replaceAll("[*^/+=]", " ");
		System.out.println(newstring);

	}

}
