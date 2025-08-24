interface a {
     void show();
    
}  
class b implements a{
    public void show(){
        System.out.println("inside from the show ");
    }
}
    


public class interfacesdemo {
    public static void main (String [] args){
        b myobj = new b();
        myobj.show();

    }
    
}
