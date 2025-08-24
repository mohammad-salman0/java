
class abcd extends Thread {
    private int threadno;
    public  abcd(int no){
        threadno = no;
    }
    public void run(){

        for ( int i =1; i<= 5;i++)
        {
            System.out.println(i+ "from thread"+threadno);
        }
    } 
}
public class threadsdemo{
    public static void main (String [] args){
        for( int i = 1 ; i<= 5 ;i++){
                abcd mythread = new abcd(i);
                mythread.start();
        }
        

        

    }
}

