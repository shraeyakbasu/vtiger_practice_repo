
public class sumofsquareofdigits {

	public static void main(String[] args) 
	{
		int number=456321;
		int remainder,sum=0;
		while(number>0) 
		{
		remainder=number%10;
		sum=(int) (sum+Math.pow(remainder, 2));
		number=number/10;
		}
		
		System.out.println("sum of squares of the digits of the number is :"+sum);

	}

}
