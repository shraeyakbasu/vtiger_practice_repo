
public class sumofdigits {

	public static void main(String[] args) 
	{
		int num=123456;
		int remainder,sum=0;
		while(num>0)
		{
		remainder=num%10;
		sum=sum+remainder;
		num=num/10;
		}
		System.out.println("sum of digits of the number is "+sum);
		

	}

}
