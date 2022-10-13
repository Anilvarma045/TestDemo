package CollectionFrameWork;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
	public static void main(String args[]) {

	/* Set is a interface is used in the set thoery to shape the mathemetical set. it is similar to list interface
	 * there is no insertion order preserved
	 * do not support duplication of elements so each element is unique
	 */
	
	Set se=new HashSet<>();
	se.add("anil");
	se.add(25);
	System.out.println(se);
	// Using Iterator Here to print Set values.
	Iterator ite=se.iterator();
	while(ite.hasNext()) {
		System.out.println(ite.next());
	}
	
	// b.addAll(Arrays.asList(
//    new Integer[] { 1,2,3,5,10 }));
	//Add multiple values at once as a String
	se.addAll(Arrays.asList(new Integer[] {1,2,5,8,7,8,6,7}));
	
	Set sd=new HashSet<>();
	sd.addAll(Arrays.asList(new Integer[] {2,3,5,7,8,9,0,0}));
//	se.addAll(sd);           // add all nothing but Union
//	se.retainAll(sd);        //it will return only matching collection   
	se.removeAll(sd);        //it will remove matching collection
	System.out.println(se);
	}
	
}
