package CollectionFrameWork;
import java.util.*;
public class ListDemo {
	public static void main(String args[]) {

	//list, queue,set,
	
	List list=new LinkedList();
	list.add("ANil");
	list.add("varma");
//	list.remove();
//	list.removeAll()
	System.out.println(list);
	
	
	
//	List a= new ArrayList();
//	List b= new LinkedList();
//	List c= new Vector();
//	List d= new Stack();
	
	// for ArrayList
	List a= new ArrayList();
	a.add(10);
	a.add("Anil");
	a.add(25);
	System.out.println(a);
	System.out.println("the items in list"+a.toString());
	Iterator ite=a.iterator();
	while(ite.hasNext())
		System.out.println(ite.next());
	
// LinkedList Examples:	
	
	List b= new LinkedList();
	b.add(11);
	b.add("varma");
	b.add("26");
	Iterator it=b.iterator();
	while(it.hasNext())
		System.out.print(it.next());
	
	System.out.println(b);
	System.out.println("Linked LIST ITEMS: "+b.toString());
	
	
	
	
	// for Stack
	List d= new Stack();
	d.add(3);
	d.add("M");
	System.out.println("The stack values are: "+d.toString());
	
	Vector vec=new Vector();
	vec.addElement("Anil");
	vec.addElement("varma");
	
	}
}
