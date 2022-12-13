package collection;


import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TMap {

	public static void main(String[] args) {
		// maintain ascending order
		
		Map<String, Integer> mp = new TreeMap<String, Integer>();
		
		// Map should be capital letter all the time
		/* we cannot create an object for an interface i.e Map but we create object for its implementation
		class i.e HashMap or TreeMap or LinkedHashMap
		*/
		// TreeMap should also be capital letter
		/* after Map press ctrl+space then add from java.util, there should be key & value, so put your desirable 
		 data type in key and value i.e String and Integer after Tree press ctrl+space then java.util*/
		//sometimes we have to import from Set and TreeMap if it dont come automatic
		
		mp.put("mamun", 12);
		mp.put("abc", 34);
		mp.put("efg", 56);
		mp.put("ijk", 78);
		mp.put("mno", 23);
		mp.put("qrs", 45);
		mp.put("uvw", 68);
		mp.put("abc", 10);
		// in Map we use put instead of add
		
		System.out.println(mp.size());
		
		System.out.println("----------------------------");
		
		for (Entry<String, Integer> eachmp : mp.entrySet()) {
			System.out.println(eachmp.getKey() + "    " + eachmp.getValue());
		}
		// Entry should be capital letter
		// this is a syntax of for each loop used in Map differently
		// because map is a two dimension means it has key and value
		// a pair of key and value is called Entry
		// collection of key and value is called entry set
		
		System.out.println("----------------------------");
		
		System.out.println(mp.get("mamun"));
		
		System.out.println("----------------------------");

		mp.remove("efg");
		
		System.out.println(mp.size());
		
		System.out.println("----------------------------");
		
		System.out.println(mp.containsKey("mamun"));
		// search by key
		
		System.out.println(mp.containsValue(12));
		// search by value
		
		System.out.println("----------------------------");
		
		mp.clear();
		
		System.out.println(mp.size());
		
		System.out.println(mp.isEmpty());
		
	}

}





