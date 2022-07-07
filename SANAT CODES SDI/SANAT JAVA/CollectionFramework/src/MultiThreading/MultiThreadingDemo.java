package MultiThreading;
class ThreadTest extends Thread{
    public void run(){
        try{
            System.out.println("The thread is " + Thread.currentThread() );

        }catch (Exception e){
            System.out.println("The exception is for"+ e.getMessage());
        }
    }

}
public class MultiThreadingDemo {
    public static void main(String[] args) {
//        ThreadTest t1 = new ThreadTest();
//        for (int i = 0; i <=10; i++) {
//
//            t1.run();
//        }\
        Thread th = new Thread();

        for (int i = 0; i <=10 ; i++) {
            th.run();
        }

    }
}
