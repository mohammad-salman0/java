public class employee{

public int empid;
public String name;
public int salary ;
double Hra , da , Gsalary;
public void calculations(){
     Hra = 0.05 *salary;
    System.out.println("HRA allowance :"+Hra);
     da = 0.01*salary;
    System.out.println("DA  :"+ da);
     Gsalary = salary +Hra +da;
    System.out.println("gross salary :"+Gsalary);
}
public void print()
{
System.out.println("salary slip :");
System.out.println("basic salary:"+salary );
System.out.println("HRA allowance :"+Hra);
System.out.println(" DA :"+da);
System.out.println("gross salary  :"+Gsalary);
}
}
class student{
public static void main(String[] args) {
    employee salman = new employee();
    salman.name="salman";
    salman.salary= 5000000;
    salman.calculations();
    salman.print();
}
}