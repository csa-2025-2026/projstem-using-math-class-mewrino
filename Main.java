import java.util.Scanner;    // optional to use user input
 
public class Main
{
    public static void main(String[] args)
    {
        // You can optionally use the Scanner for user input
        Scanner scan = new Scanner(System.in);
        
        /* int N;
        System.out.println("How many random numbers do you want to see (must be at least 1)?");
        N = scan.nextInt();
        printRandom3(N);
        */

        // the slope between the points (0,0) and (1,1)
        double m = calcSlope(47, 3, 46, 67);
        System.out.println(m);
        System.out.println(calcSlope(0,0,1,1));
    
    }
    
    public static void printRandom3(int num)
    {
        // Random whole numbers between a and b
        // (int) (Math.random() * (b-a+1) + a);
        int lowerBound = 2;
        int upperBound = num + 2;
        System.out.println( (int) (Math.random() * (upperBound - lowerBound + 1) + lowerBound) );
        System.out.println( (int) (Math.random() * (upperBound - lowerBound + 1) + lowerBound) );
        System.out.println( (int) (Math.random() * (upperBound - lowerBound + 1) + lowerBound) );
    }
    
    public static double calcSlope(double x1, double y1, double x2, double y2)
    {
        
        /*x1 = 47;
        y1 = 3;
        x2 = 46;
        y2 = 67;
        */

        double m = ((y2 - y1) / (x2 - x1));
        
        return m;

        }
    
    public static int roundedDist(double a, double b)
    {
        // Do problem 3 here; replace code below
        return 0;
    }
}
