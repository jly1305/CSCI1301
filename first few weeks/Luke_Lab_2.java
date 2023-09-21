//This program created by Luke Tierney, for course CSCI 1301, in fall 2023 in 09/07/2023. For lab 2 activity.

public class Luke_Lab_2
{
   public static void main(String[] args)
   {
    // print welcome statement
    System.out.println("               Welcome to Lab 2 Activity."
                   + "\n               ************************* ");
    //print using escape sequences in one print statement (i kind of did that already)
    System.out.println("University: GCSU.\t\t\t\t\t\tCollege: J. Whiteney College of Business of Business and Technology \nDean: Dr. Michael Stratton\t\t\tAssociate Dean: Dr.Tanya Goette");
    
    System.out.println("\"John said, \'I prefer using double quotes for strings, but some developers like using single quotes for readability.\'\""
    + "\n however the fil pathe is C:\\Users\\Username\\Documents\\file.txt");
    
    //work with variables
    byte byte_Variable;
    short short_Variable;
    long long_Variable;
    float float_Variable;
    
    byte_Variable = 127;
    short_Variable = 127;
    long_Variable = 127;
    float_Variable = 127;
    
    System.out.println(byte_Variable);
    System.out.println(short_Variable);
    System.out.println(long_Variable);
    System.out.println(float_Variable);
    
    int integer_Variable = 255;
    double double_Variable = 255;
    boolean boolean_Variable = true;
    char Char_Variable = 'T';
    
    System.out.println(integer_Variable);
    System.out.println(double_Variable);
    System.out.println(boolean_Variable);
    System.out.println(Char_Variable);
    
    //Arithmetic Operators
    
    int x, y;
    x = 11;
    y = x + 5;
    
    System.out.println("x and y values are " + x + " and " + y + ". The sum is " + (x + y ) + ". Subtraction is " + (y - x) + ". Multiplication is " + (x * y) + ". Division is " + (y / x) + " ");
    
    double r, a, b;
    a = 6;
    b = 5;
    r = (a + 3) / ( b - 1);
    
    System.out.println(r);
    
    double A, R, B;
    A = 3;
    B = 6;
    R = 5 * ((3 * (A + 2) + 1) / (2 * ((B/2)-2) + 1) );
    
    System.out.println(R);
 
    double V1, V2, V3, V4;
    V1 = 5;
    V2 = 12;
    V3 = 12;
    V4 = 35;
    
    System.out.println("Original V1 Value: " + V1 + ". New V1 Value: " + (V1 += 5) + " ");
    System.out.println("Original V2 Value: " + V2 + ". New V2 Value: " + (V2 -= 2) + " ");
    System.out.println("Original V3 Value: " + V3 + ". New V3 Value: " + (V3 *= 3) + " ");
    System.out.println("Original V4 Value: " + V4 + ". New V4 Value: " + (V4 /= 7) + " ");
    
    final double PI = 3.14;
    
    double radius = 6;
    
    double area = (PI * (radius * radius));
    double circumfrence = (2 * PI * radius);
    
    System.out.println("Area of the circle: " + area);
    System.out.println("Circumfrence of the circle: " + circumfrence);
    System.out.println("Area of the sphere: " + ((4) * PI * (Math.pow(radius, 2))));
    System.out.println("Volume of the sphere: " + ((4/3) * PI * Math.pow(radius, 3)));
    
     
   }
}
      
      