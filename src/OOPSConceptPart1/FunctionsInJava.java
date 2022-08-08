package OOPSConceptPart1;

public class FunctionsInJava {
    //main method--> starting point of execution
	//why main method is void->>main method is void never retirn a value-->we never write return statments inside the main method
	public static void main(String[] args) {
		//Function and Method are same.
		
		FunctionsInJava obj=new FunctionsInJava();
		// one object will be created,obj is the reference variable,referring to this object
		// after creating the object, the copy of all non static method will be given to this project
		obj.test();
		int z=obj.pqr();
		System.out.println(z);
		int div=obj.division(50,10);
		System.out.println(div);
		String s1=obj.aa();
		System.out.println(s1);

	}
	//non static method
	//void--does not return any value
	// return type=void---> in below method-->> public void test()
	public void test() {  //no input some output
	System.out.println("test method");
	}
	//return type-->int
	public int pqr() {   //no input some output
		int x=10;
		int y=20;
		int z=x+y;
		return z;
	}
	//return type-->int
	public int division(int a,int b) {  //x,y--->input parameter/arguments
		int c=a/b;
		return c;
	}
	//return type-->String
	public String aa() {    //no input some output
	System.out.println("string method");
	String s="selenium";
	return s;
	
	
	}
}
