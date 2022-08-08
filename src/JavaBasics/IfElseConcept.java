package JavaBasics;

public class IfElseConcept {

	public static void main(String[] args) {
		int a=10;
	    int b=20;
	    if (b>a) {
	System.out.println("b is greater then a");
	    }
	    else
	    {
	    System.out.println("a is greater then b");
	    }
	    //comprasion operator
	    //<> <= >= == !=
	    int c=30;
	    int d=30;
	    if(c==d) {
	    System.out.println("c is equal to d");
	    }
	    else {
	    	System.out.println("c is not equal to d");
	    }
	    // write a program to find a highest number
	    int a1=100;
	    int b1=200;
	    int c1=300;
	    //nested if-else
	    if(a1>b1 & a1>c1) {
	    System.out.println("a1 is highest number");	
	    }
	    else if(b1>c1) {
	   System.out.println("b1 is highest number");
	    }
	    else{
	   System.out.println("c1 is highest number");
	    }
	       		
	   }


	}


