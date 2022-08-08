package OOPSConceptPart2Interface;

public class TestBank {

	public static void main(String[] args) {
		// USBank.min_bal=200; ---we can't change the value of min_bal becuae its assiged under the Interface.
		System.out.println(USBank.min_bal);
		HSBCBank hs=new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transfermoney();
		hs.educationloan();
		hs.carloan();
		
		//dynamic polymorphism:
		//child class object can be referred by parent Interface reference var.
		
		USBank b=new HSBCBank();
		b.credit();  //only overridden  method are allowed
		b.debit();   //only overridden  method are allowed
		b.transfermoney();  //only overridden  method are allowed
		//b.educationloan(); // you can access child class methods
		//b.carloan();       // you can access child class methods
		
	}

}
