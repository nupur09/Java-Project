package OOPSConceptPart1;

public class StaticAndNonStaticConcept {
      //Global Variable:The scope of global variable wiil be availave accress the all function with some conditions.If it static variables then you can call them directlly or by class name.If it is non static variables you have to create the object then you can access that.
	  String name="Tom";   // non static global variable
      static int age=25;   // sttaic global variable
	public static void main(String[] args) {
	//-->> how to call static method and variables
    //1.direct calling.
		sum();
	//2.calling by classname
		StaticAndNonStaticConcept.sum();
		
	//how to use static variables
	 //1.direct calling.
	System.out.println(age);
	//2.calling by classname
	System.out.println(StaticAndNonStaticConcept.age);
	
	//-->> how to call non static methods and variables.
		//with the help of create object of the class
		StaticAndNonStaticConcept obj=new StaticAndNonStaticConcept();
		obj.sendMail();
		System.out.println(obj.name);
		
	//can I access static methods by using object reference? yes but it is not good practice and warning will also come.
	//obj.sum(); // sttaic method---warning coming if we not follow the the calling method in static way
	}	
	
	
	public void sendMail() {                //non static method
	System.out.println("send mail method");
	}
	public static void sum() {              //static method
	System.out.println("sum method");
	  }
	  
	  }
	


