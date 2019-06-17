import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
  		
    	System.out.println("Number of ints: ");
    	int numOfInts = keyboard.nextInt();
    	
    	int[] ints = new int[numOfInts];
    	for(int i = 0; i < numOfInts; i++)
    	{
    		System.out.println("Enter an int: ");
    		ints[i] = keyboard.nextInt();
    	}
    	
    	//Call allPositive() method
    	
    	
    	//print allPositive value
    	System.out.println(allPositive(ints));
  	}
  	
  	//create allPositive method here
  	static Boolean allPositive(int[] x) {
  	      for (int i = 0; i < x.length; i++) {
            if (x[i]<0){ return false ;}
  	      }
          return true;
          
  }
}