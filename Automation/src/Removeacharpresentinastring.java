
public class Removeacharpresentinastring 
{

	public static void main(String[] args) 
	{
		String name="shraeyak";
		//String c="a";
		Boolean flag=false;
		while(name.contains("a"))
		{
			flag=true;
		int index=name.indexOf("a");
		name=name.substring(0,index)+name.substring(index+1);
	    }
		
		if(flag==true)
		System.out.println(name);
		else
			System.out.println("not present in "+name);	

	}

}
