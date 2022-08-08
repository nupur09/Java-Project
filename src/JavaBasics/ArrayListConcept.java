package JavaBasics;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		ArrayList ar=new ArrayList();   
		//If you not parametrised ArrayList then you can give any value,like int,string,double e tc
		ar.add(100); // 0 indexing
		ar.add(200); // 1 indexing
		ar.add(300); // 2 indexing
		System.out.println(ar.size());
		ar.add(400);  // 3 indexing
		ar.add(500);  // 4 indexing
		System.out.println(ar.size());
		ar.add("Tom");  // 5 indexing
		ar.add("Hello"); //6 indexing
		ar.add(12.66);  // 7 indexing
		ar.add('M');    // 8 indexing
		ar.add(600);    //9 indexing
		
		System.out.println(ar.size());
		ar.remove(9);
		System.out.println(ar.size());
		System.out.println(ar.get(4));   //find index value
		//System.out.println(ar.get(9));
		//giving IndexOutOfBoundsException error because array at 9th indexing not availavle.
		
		// to print all the values of ArrayList:for loop 
		for (int i=0; i<ar.size();i++){			
			System.out.println(ar.get(i));			
		}
		
		//If you want to restrict ArrayList--enter only spesfied value.
			
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		ar1.add(2000);
		ar1.add(300);
		//ar1.add("string");   ----not allowed
		System.out.println(ar1.size());
		
		ArrayList<String> ar2=new ArrayList<String>();
		ar2.add("Henry");
		ar2.add("Juliya");
		ar2.add("Mishel");
		//ar2.add(300);  // not allowed
		System.out.println(ar2.size());
		
	}
;
}
