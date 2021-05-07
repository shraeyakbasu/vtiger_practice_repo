
public class numberreversal {

	public static void main(String[] args) 
	{
		int number=45621;
		int reversenumber=0;
		while(number>0)
		{
		int remainder=(number%10);
		reversenumber=(reversenumber*10)+remainder;
		number=(number/10);
		}
		
		System.out.println(reversenumber);
		

	}

}
