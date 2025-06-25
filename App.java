import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);

        // System.out.println("Enter a:");
        // int a=sc.nextInt();
        // System.out.println("Enter b:");
        // int b=sc.nextInt();

        
        System.out.println("Enter array size:");
        int size=sc.nextInt();
        int arr[] = new int[size];


        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter index you want to access:");
        int index=sc.nextInt();



        try{
            int rslt=arr[0]/arr[1];
        }catch(Exception e){
            System.out.println(e);
            System.out.println("Cannot divide by zero");

        }finally{
            System.out.println("programm completed");
        }
sc.close();

    }
}
