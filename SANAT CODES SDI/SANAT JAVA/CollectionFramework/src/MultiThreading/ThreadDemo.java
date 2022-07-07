package MultiThreading;
class MyThread extends Thread{
    public void run(){
        System.out.println("This thread is executing " + this.currentThread().getName());
    }
}
public class ThreadDemo {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            MyThread th1 = new MyThread();
            th1.start();
        }
    }
}
