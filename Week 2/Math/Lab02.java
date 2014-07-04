import comp102x.IO;

public class Lab02
{

    
    public static void multiply()
    {
        // Please write your code after this line
        IO.output("Enter an integer, x: " );
        int x = IO.inputInteger( );
        IO.output("Enter an integer, y: " );
        int y = IO.inputInteger( );
        int z = x * y;
        IO.output("Answer = " + z);
        
    }
    
    public static void calculateTriangleArea()
    {
        // Please write your code after this line
        IO.output("Enter the width of the triangle: " );
        double width = IO.inputDouble( );
        IO.output("Enter the height of the triangle: " );
        double height = IO.inputDouble( );
        double area = 0.5 * (height * width);
        IO.output("The triangle area = " + area);
        
    }
    
    public static void solveQuadraticEquation()
    {
        // Please write your code after this line
        IO.output("Enter a: " );
        double a = IO.inputDouble( );
        IO.output("Enter b: " );
        double b = IO.inputDouble( );
        IO.output("Enter c: " );
        double c = IO.inputDouble( );
        double first_x = (-b + Math.sqrt((b*b)-(4*a*c))) / (2*a);
        IO.outputln("First solution for x = " + first_x);  
        double second_x = (-b - Math.sqrt((b*b)-(4*a*c))) / (2*a);
        IO.output("Second solution for x = " + second_x);  
        
    }
}
