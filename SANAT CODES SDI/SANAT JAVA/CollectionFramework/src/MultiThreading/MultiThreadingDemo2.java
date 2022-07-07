package MultiThreading;
class ThreadNew extends Thread{
    public void run(){
        System.out.println("This is key" + this.currentThread().getName());
    }
}
public class MultiThreadingDemo2 {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            ThreadNew tn = new ThreadNew();
            tn.start();
        }
        for (int i = 0; i < 10; i++) {
            Thread th1= new Thread();
            th1.start();

        }
    }
}
