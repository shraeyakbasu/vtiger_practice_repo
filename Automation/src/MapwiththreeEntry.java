import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class MapwiththreeEntry 
{

	public static void main(String[] args)
	{
		TreeMap<String, List<String>> map=new TreeMap();
		List<String> list1=new ArrayList<>();
		list1.add("State: New Jersy");
		list1.add("Capital: Washington DC");

		List<String> list2=new ArrayList<>();
		list2.add("State: Maharastra");
		list2.add("Capital: Mumbai");
		
		map.put("Usa", list1);
		map.put("India", list2);
		
		System.out.println(map);
	}

}
