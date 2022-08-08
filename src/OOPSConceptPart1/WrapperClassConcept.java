package OOPSConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		String x="100";
		System.out.println(10+x);
		//data conversion: String to int:
		int i=Integer.parseInt(x);
		System.out.println(i+20);
		
       // Intger,Double,Character,Boolean
		String y="12.33";
		double d=Double.parseDouble(y);
		System.out.println(10+d);
	   //String to boolean:
		String k="true";
		Boolean b=Boolean.parseBoolean(k);
		System.out.println(b);
	   // int to String Conversion:
		int j=200;
		System.out.println(j+20);
	   String s=String.valueOf(j);	//200
	   System.out.println(s+30);
		
	  // String u="100A";
	  // Integer.parseInt(u);  //NumberFormatException--For input String:"100A"
	   
		
	}

}
