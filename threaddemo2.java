class threadsdemo implements Runnable{
    private int  threadno ;
    threadsdemo(int no){
        threadno= no;
    }
    public void run(){
        for( int i= 1 ;i <= 5 ; i++)
        {
        System.out.println(i +"thread from "+ threadno);
        }
    }
    
}
class threaddemo2 {
    public static void main (String [] args){

        for( int i = 1 ; i<= 5; i++)
        {
            threadsdemo mythread = new threadsdemo(i);
            Thread demo = new Thread(mythread);
            demo.start();
            

        }
    }
}