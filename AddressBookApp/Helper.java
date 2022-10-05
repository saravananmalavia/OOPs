

/*

Helper class contains some utility function to

1. clear the screen
2. read an integer value from console
3. read a string value from console
4. function to wait for next option

*/

package escube.address.util;
import java.util.Scanner;

public class Helper{

		public static void nextOption(){
			System.out.print("\n Press any key to continue...");
			getS(); clear(); 
		}

		// function to clear the console screen

		public static void clear(){
			System.out.print("\033[H\033[2J");  
			System.out.flush(); 
		}

		// function to get an integer from console

		public static int getI(){
			Scanner sc = new Scanner(System.in);
			int intValue = sc.nextInt();
			return intValue;
		}

		// function to get string from console

		public static String getS(){
			Scanner sc = new Scanner(System.in);
			String stringValue = sc.nextLine();
			return stringValue;
		}

}