package java_learning;
import java.util.*;
import java.util.Map.Entry;

public class MapHashMapDemo {
	public static void main(String args[]) {
		
		Map<String,String> map=new HashMap<String,String>();
		map.put("name", "aNil");
		map.put("gender", "male");
		map.put("age", "25");

		//Iterator Usin Entry.map and entrySet
		System.out.println(map);
		Iterator<Entry<String, String>> ite=map.entrySet().iterator();
		System.out.println("Map iterator with for Iterator Method");

		while(ite.hasNext()) {
			Entry<String, String> nmap=(Map.Entry<String, String>)ite.next();
			
			System.out.println(nmap.getKey() + " = " +nmap.getValue());
		}
		
		// Iterate the Hash map with FOr Each Loop
		System.out.println(" Iterate the Hash map with FOr Each Loop ");
		
		System.out.println(map.get("name"));
		
	//	map.forEach()
	//	map.entrySet().stream().forEach();
		
		
				
				
				
		
	
	
	}
}
