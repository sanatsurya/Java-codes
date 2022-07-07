package MultiThreading;

public class SystemThreadProcessor {
    public static void main(String[] args) {
        System.out.println(Thread.activeCount());
        System.out.println("Available Processor is "+ Runtime.getRuntime().availableProcessors());
    }
}
