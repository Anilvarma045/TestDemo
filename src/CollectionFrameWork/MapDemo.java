package CollectionFrameWork;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;



public class MapDemo {

	public static void main(String args[]) {
		
		/*map is a collection of key_value Pairs
		 *  key's are unique values can be duplicate
		 *  HasMap--HashTable--   are classes --Hash is interface
		 *  ==========>internally underlying Data Structure
		 *  	insertion order not preserved
		 *  	Null key allowed as once as a Key
		 *  Note: when we have more search operations Required we can choose map Because its faster in Search operation!
		 */
		// Example Program to Create Has
		Map	m1=new HashMap<String, Objects>();
		m1.put("name", "ANil");
		m1.put("Age", 25);
		m1.put("Gender","Male");
		
//
//		for(int i=0; i<=m1.size();i++) {
//			Iterator it=m1.iterator();
//		}
		//m1.clear();
		System.out.println(m1.keySet());
		System.out.println(m1.values());
		System.out.println(m1.entrySet());
		
//		for(int i=0; i<=m1.size();i++) {
//			Iterator ite=m1.iterator();
//		}
		
		
	}
}
