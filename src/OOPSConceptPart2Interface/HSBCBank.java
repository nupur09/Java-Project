package OOPSConceptPart2Interface;

public class HSBCBank implements USBank,BrazilBank {  //we are achieving  multiple inhertiance.
	 // Is-a relationalship
	//If a class is implementing any Interface ,then its mandatory to define/override all the method Interface.
	//Overiding from US Bank
    public void credit() {
    	System.out.println("hsbc---credit");
    }
    public void debit() {
    	System.out.println("hsbc---debit");
    }
    public void transfermoney() {
    	System.out.println("hsbc---transfermoney");
    }
    //HSBCBank own methods(seperate methods)
    public void educationloan() {
    	System.out.println("hsbc---educationloan");
    }
    public void carloan() {
    	System.out.println("hsbc---carloan");
    }
    
    // brazil bank method:overriding from BrazilBank
    public void mutualFund() {
    
    	System.out.println("brazil---mutualfund");
}
}

