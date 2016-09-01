
/**
 * Write a description of class HelloDataType here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class HelloDataType
{
    //fields
    
    //constructor(s)
    public HelloDataType() 
    {
    }
    //methods &&and  || or
   
    private static int addTwoNumbers(int a, int b)
    {
        return a+b;
    }
    public static void main(String[] args)
    {
        int x = 0;
        int y = 0;
        Scanner whatever = new Scanner(System.in);
        System.out.println("Enter a number: ");
        x = whatever.nextInt();
        System.out.println("Enter a number: ");
        y = whatever.nextInt();
        System.out.println(x/y);
    }
}
