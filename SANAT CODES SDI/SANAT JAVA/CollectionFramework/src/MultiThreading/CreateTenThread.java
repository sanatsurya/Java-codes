package MultiThreading;
class Sanat extends Thread{
    public void run(){
        System.out.println("The name of the thread is " + this.currentThread().getName());
    }
}
public class CreateTenThread {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Sanat s1 = new Sanat();
            s1.start();
        }


    }
}
