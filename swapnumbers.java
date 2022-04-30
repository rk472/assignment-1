/******************************************************************************
Question : Swap two numbers using temporary variable

Sample Output :

10
Enter y
12
Value of x is 10 and Value of y is 12
Value of x is 12 and Value of y is 10

*******************************************************************************/
import java.util.*;
public class SwapNumbers
{
    public static void main(String[] args) {
       Scanner number = new Scanner(System.in); 
    System.out.println("Enter x");

    int  x = number.nextInt(); 
     System.out.println("Enter y");

    int  y = number.nextInt();
    System.out.println("Value of x is " + x
                           + " and Value of y is " + y);
    int temp = x;
        x = y;
        y = temp;
        System.out.println("Value of x is " + x
                           + " and Value of y is " + y);
    
    }
}
