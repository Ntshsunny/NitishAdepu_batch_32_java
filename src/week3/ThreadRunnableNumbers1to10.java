package week3;

class numRunnable implements Runnable{
    public void run(){
        for(int i=0; i<11;i++)
        System.out.println("Printing numbers: "+i);
        System.out.println("name of the thread: " +Thread.currentThread());
    }
}
public class ThreadRunnableNumbers1to10 {
    public static void main(String args[]){
        numRunnable nr = new numRunnable();
        Thread t = new Thread(nr);
        t.start();
        System.out.println("main Thread name: "+Thread.currentThread());
    }
}
