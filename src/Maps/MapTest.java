package Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args){
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "kar");
		map.put(0, "viju");
		System.out.println(map);
		
		//Iterating over map
		Set<Integer> s =map.keySet();
		Iterator<Integer> i = s.iterator();
		while(i.hasNext()){
			Integer k = i.next();
			System.out.println("Key: "+k+" value: "+map.get(k));
		}
		
		//Alternate way
		Set ss = map.entrySet();
		Iterator ii = ss.iterator();
		while(ii.hasNext()){
			Map.Entry me = (Map.Entry) ii.next();
			System.out.println("Key: "+me.getKey()+" value: "+me.getValue());
		}
		TreeMap<Integer, String> treemap = new TreeMap<>(map);
		LinkedHashMap<Integer, String> linkedmap = new LinkedHashMap<>(map);
		map.put(1, "test");	
		System.out.println(map);
		System.out.println(treemap);
		System.out.println(linkedmap);
		linkedmap.put(3, "foo");
		linkedmap.put(2, "ftp");
		System.out.println(linkedmap);
		
		//Iterate again
		Iterator<Integer> i1=linkedmap.keySet().iterator();
		while(i1.hasNext()){
			Integer t=i1.next();
			System.out.println(t+" "+linkedmap.get(t));
		}
	}
	
}
