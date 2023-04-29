package Multithreading;

public class Dameon_Thread extends Thread{
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("Dameon thread is working");
        }else{
            System.out.println("Not working");
        }
    }

    public static void main(String[] args) {
        Dameon_Thread d1 = new Dameon_Thread();
        Dameon_Thread d2 = new Dameon_Thread();
        Dameon_Thread d3 = new Dameon_Thread();
        d1.setDaemon(true);
        d1.start();
        d2.start();
        d3.start();
    }
}
