package week3;

class numThread extends Thread{
    public void run(){
        for(int i=0; i<11; i++){
            System.out.println("Printing Numbers through Thread: "+i);
        }
    }

}
class ThreadNumber1tp10{
    public static void main(String args[]){
        numThread nt = new numThread();
        nt.start();
    }
}
