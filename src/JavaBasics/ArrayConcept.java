package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		// array: to store similar data type values in array variable.
		//loweset bound/index=0
		//upper bound/index=n-1(n is size of array)
		//One dimensional array(static Array)
		//disadvantages of one dim array:-
		//1-size is fixed-To overcomethis problem--we used Collection--ArrayList,HashTable--dynamic array
		//2-store only similar data types-to overcome of this problem,we use Object array.
		
		
		// 1.int array
		int i[]=  new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		System.out.println(i.length);
		System.out.println(i[0]);
		System.out.println(i[1]);
		System.out.println(i[2]);
		System.out.println(i[3]);
		
		for( int j=0; j<i.length;j++)
				{
		System.out.println(i[j]);
			}
		//2.double array
		double d[]= new double[3];
		d[0]=12.33;
		d[1]=23.55;
		d[2]=45.43;
		System.out.println(d[2]);
		
		//3.boolean array:
		boolean b[]=new boolean[2];
		b[0]=true;
		b[1]=false;
		System.out.println(b[1]);
		// 4.String Array
		String s[]=new String[3];
		s[0]="test";
		s[1]="selenium";
		s[2]="framework";
		System.out.println(s.length);
		System.out.println(s[2]);
		
		//6. Object Array
		Object ob[]=new Object[6];
		ob[0]="Tom";
		ob[1]=25;
		ob[2]=12.33;
		ob[3]="01/02/1995";
		ob[4]='M';
		ob[5]="London";
		System.out.println(ob.length);		
		System.out.println(d[0]);
		
		for(int k=0;k<ob.length;k++) {
			 //System.out.println(k);
             System.out.println(ob[k]);
		}					
		
		
	}
}
