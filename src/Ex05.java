// 5- Using the while structure make a program that asks for two integers and goes on asking for two new integers 
// while those numbers are different to 123 and 321.
import java.util.Scanner;
public class Ex05 {
	   public void unMetodoDeE() {
		   Scanner se1 = new Scanner(System.in);
		   Scanner se2 = new Scanner(System.in); 
		   int xE1 = 0;
		   int xE2 = 0;
		   while ((xE1 != 123 || xE1 != 321) && (xE2 != 123 || xE2 != 321)) {
			   System.out.println("Enter a number: ");
			   int xE11 = se1.nextInt();
			   System.out.println("Enter another number: ");
			   int xE21 = se2.nextInt();
			   xE1 = xE11 + 0;
			   xE2 = xE21 + 0;
		   }
	   }
	}