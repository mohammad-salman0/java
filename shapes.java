
interface shapes{
    double area();
    double perimeter();
    public static void main (String args[]){
            System.out.println("executions begins");
            
        }
}

class Circle implements shapes {
    double radius;

    Circle(double radius) {
        this.radius = radius;
        
    }

    public double area() { return Math.PI * radius * radius; }
    public double perimeter() { return 2 * Math.PI * radius; }
}