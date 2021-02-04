/*  In Java there are two ways to do threading
    1.) By extending class thread
    2.) By inplementing runnable interface

*/
class thread_class extends Thread{ // method 1
    @Override
    public void run() {
        while(true){
        System.out.println("This is a thread");
        }
    }
}

class thread_class2 implements Runnable{ // method 2
    public void run(){
        while(true){
            System.out.println("thread");
            }
    }
}


public class threading {
    public static void main(String[] args) {
        thread_class th =new thread_class();

        thread_class2 t =new thread_class2();
        Thread tr = new Thread(t);

        th.start();
        tr.start();



    }
}
