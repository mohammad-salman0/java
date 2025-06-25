import java.util.Scanner;
class rectangle {
public double length ;
public double width ;
public void dimensions(){

    Scanner input = new Scanner(System.in);
    System.out.println("Enter length of the rectangle:");
    length = input.nextDouble();
    System.out.println("Enter width of the rectangle:");
    width  = input.nextDouble();
}
public void calculations(){

        double area = length *width ;
        double perimeter =  2 *(length + width);
        System.out.println("the area of the rectangle is :"+area);
        System.out.println("the perimeter of the rectangle is :"+perimeter);
}
}
class assignment{
    public static void main(String[] args) {
        rectangle abc = new rectangle();
        abc.dimensions();
        abc.calculations();
        
    }
    }