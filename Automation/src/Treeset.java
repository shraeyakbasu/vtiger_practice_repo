import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) 
	{
		TreeSet<Object> tree=new TreeSet<>();
		tree.add('a');
		tree.add('B');
		tree.add('z');
		tree.add('f');
		//tree.add(null);
		System.out.println(tree);
		TreeSet<Object> tree1=new TreeSet<>();
		tree1.add(10);
		tree1.add(20);
		tree1.add(40);
		tree1.add(70);
		System.out.println(tree1);
		System.out.println(tree1.descendingSet());
		
		
		
		

	}

}
