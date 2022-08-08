package OOPSConceptPart2Inheritance;

public class TestCar {

	public static void main(String[] args) {
		//Static polymorphism---compile-time polymorphism
		BMW b=new BMW();
		b.start(); //Method Overriding-when same method is present in parent class as well as in Child class with the same name and same number of arguments,
		           //is called Method Overriding.
		b.stop();
		b.refuel();
		b.theftsafety();
		b.engine();
		
		System.out.println("********");
		
		Car c=new Car();
		c.start();
		c.stop();
		c.refuel();
		//c.thesafety();  ---parent class not used child class property.
		
		System.out.println("********");
		//Top Casting
		Car c1=new BMW();  // Car c1--reference variable
		//child class object can be referred by parent class reerence variable-dynamic polymorphism-Run Time Polymorphism
		c1.start();  //child class
		c1.stop();   //parent class
		c1.refuel(); //parent class
		// c1.theftsafety(); // only and only overrideen method(common method)+parent class method will be called only dynamic polymorphism
	
	   // Down Casting
	    // BMW b1=new Car();   // Parent can't be fit into child
		// BMW b1=(BMW)new Car(); //Classcast exception
		//Down time not allwed if we try to cast using child class name like(BMW) but on run time it gives error-Car cannot be cast to class
	}
	
	

}
