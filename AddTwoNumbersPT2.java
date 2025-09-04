package AddTwoNumbers; //project made in eclipse
import java.util.Scanner; // import scanner class

// public class 'AddTwoNumbers' & method public void AddTheTwoNumbers
public class AddTwoNumbersPT2 {
int x, y, z; // declared variables

public void AddTheTwoNumbersPT2() { // method made
	Scanner sc = new Scanner(System.in);// object created from the imported scanner class
	//'(System.in)' allow keyboard use
	
	System.out.print("Input your first number: "); // display text
	x = sc.nextInt(); // reads in number from keyboard
	
	System.out.print("Input your second number: "); // display text
	y = sc.nextInt(); // reads in number from keyboard
	
	sc.close(); // close the scanner
	
	System.out.print(x + " " + "+" + " " + y); // display values and operator
	
	z = x + y; // equation set for calculation
	
	System.out.println(" = " + z); // display the result
}
	public static void main(String[] args) {// reads, runs & executes code
		AddTwoNumbersPT2 myCalculation = new AddTwoNumbersPT2(); // object created from class
		
		myCalculation.AddTheTwoNumbersPT2();// object calls onto method and runs code
		
	}

}

//Result:
//Input your first number: 5
//Input your second number: 6
//5 + 6 = 11	