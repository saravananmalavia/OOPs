import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;  
import java.util.Scanner;
public class Helper {  
    public static String getNow(){
       DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
       LocalDateTime now = LocalDateTime.now();
       String currentDateTime = dtf.format(now).toString();
       return currentDateTime;
       
    }  

    public static void doWait(){
      System.out.print("\nEnter ...");
      getS(); //clear(); 
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
