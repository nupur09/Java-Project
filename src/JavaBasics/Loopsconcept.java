package JavaBasics;

public class Loopsconcept {

	public static void main(String[] args) {
	//1-while loop
	// disadvantage of while loop it will generated infinitr loop id don't give incremental or decremental part
		
		int i=1;                 //initialization
		while(i<=10) {           //condition
		System.out.println(i);
		i=i+1;                  // incremental/decremental
		}
      //2-for loop
	for(int j=20; j<=30; j++)
	{
		System.out.println(j);
	}
	//print 10 to 1
	for(int k=10; k>=1;k--) {
		System.out.println(k);
	}
	//print from 10 to 0
	for(int l=10; l>=0;l--) {
		System.out.println(l);
	}
		
	}

}
