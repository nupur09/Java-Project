package OOPSConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
	
		//you can not create a method inside a method.
		//duplicate method:--i.e.same method name with same number of argument are not allowed.
		//method overloading--- when the method name is same with diffrent arguments or input paramteres within the same class.
		MethodOverloading obj=new MethodOverloading();
		obj.sum();
		obj.sum(0);
		obj.sum(1,2);
	}
	//we can overload manin method but generally we can't do.
	//public static void main(int i) {
	//}	
	
	
	public void sum() {
	System.out.println("SUM method--zero param");	
	}
	public void sum(int i) {
		System.out.println("SUM method--one param");
	}
	
	public void sum(int i,int j) {
		System.out.println("SUM method--two param");
	}

}
