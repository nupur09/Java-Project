package JavaBasics;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
		Hashtable h=new Hashtable();
		h.put("A", "Test");
		h.put("B", "Hello");
		h.put("C", "World");
		System.out.println(h.size());
		
		h.put(1, 100);
		h.put(2, 200);
		System.out.println(h.size());
		System.out.println(h.get(2));
		System.out.println(h.get("B"));
		
		h.put(3, "Tom");
		h.put(3, "TT");   //It will override
		System.out.println(h.size());
		System.out.println(h.get(3));
		
		Hashtable<Integer,Integer> h1=new Hashtable<Integer,Integer> ();
		h1.put(3,500);
		//h1.put("A",600);  --not allowed this.
		System.out.println(h.get(4));
		

		Hashtable<String,String> h2=new Hashtable<String,String> ();
		h2.put("A","Automation"); 
		//h2.put(3,500);   not allowed
		Hashtable<Integer,String> h3=new Hashtable<Integer,String> ();
		h3.put(1, "Selenium");
	  //	h3.put("Test", 9000); not allowed
		
		
	}

}
