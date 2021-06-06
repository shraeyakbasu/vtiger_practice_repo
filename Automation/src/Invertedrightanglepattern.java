import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Invertedrightanglepattern 
{

	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("shraeyak");
		al.add("aishikee");
		al.add("khelaghar");
		al.add("kudghat");
		al.add("tollygunge");
		al.add("kudghat");
		
		/*for(int i=0;i<20;i++)
		{
			al.add(i);
		}*/
		
		System.out.println(al);
		TreeSet<String> tree=new TreeSet<String>(al);
		System.out.println(tree);
		System.out.println(tree.descendingSet());
		
		

	}

}
