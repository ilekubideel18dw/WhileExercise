// 4- Using the while structure make a program that asks to the user an integer and show its square. 
// The program will go on asking for an integer while the number given is different to 0.
import java.util.Scanner;
public class Ex04 {
   public void unMetodoDeD() {
	   Scanner sd = new Scanner(System.in);
	   int xD1 = 1;
	   while (xD1 != 0) {
		   System.out.println("Enter a number: ");
		   int xD2 = sd.nextInt();
		   System.out.println(xD2 * xD2);
		   xD1 = xD2 + 0;
	   }
   }
}