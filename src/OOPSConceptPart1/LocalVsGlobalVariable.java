package OOPSConceptPart1;

public class LocalVsGlobalVariable {
	// Global Variable
	// If you want to use global varibale outside the class you have to create object first of the class
	String name="Tom";
	int age=25;
		
	public static void main(String[] args) {	
	int i=10;  // local varibale for main method
	System.out.println(i);
	LocalVsGlobalVariable obj=new LocalVsGlobalVariable();
	System.out.println(obj.name);
	System.out.println(obj.age);
	
	int l=obj.sum();
	System.out.println(l);
	}
	
	public int sum() {
	int i=15;    //local varibale for sum method
	int j=20;     //local varibale for sum method
	int k=i+j;
	return k;
	}

}
