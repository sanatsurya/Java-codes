package MultiThreading;

public class ThreadInterruptedDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(new DownloadFile());
        thread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();
        System.out.println("Thread stops as " + Thread.currentThread().getName());
    }
    static class DownloadFile implements Runnable{
        @Override
        public void run() {
            System.out.println("Downloading the data " + Thread.currentThread().getName());
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                if(Thread.currentThread().isInterrupted())
                    return;
                System.out.println("Downloaded Data is " + i);
            }
        }
    }
}
