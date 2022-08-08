package OOPSConceptPart2Interface;

public interface USBank {
	
	 int min_bal=100;
     public void credit();
     public void debit();
     public void transfermoney();
    
     }
    	 
         
     // only method declaration
     // no method body-only need prototype
     //in Interface,we can declare the variables,variables are by default static in nature
     //variables(vars) will not be changed.// its final/constant in nature
     //no static methods in Interface.---public static void test();---because Interfaces is part of Obeject oriented Programming Concept and Object can not have static methods so that's what we never write static method in Interface.
     //no Main method in Interface
     //we can not create the object in Interface
     //Interface in abstract in nature.

//In java 8 we can make static method but we have to declare body parentshis
// public static void Name() {
//}
