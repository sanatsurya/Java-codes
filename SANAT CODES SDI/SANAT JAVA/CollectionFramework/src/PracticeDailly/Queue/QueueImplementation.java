package PracticeDailly.Queue;
interface QueueRules{
    void enQueue(int Data);
    void deQueue();
    int size();
    void Display();
    boolean isEmpty();
    boolean isFull();

}
class Queue implements QueueRules{
    private int top,rear;
    private int Capacity;
    private int arr[];
    Queue(int SizeAr){
        arr = new int [SizeAr];
        Capacity = SizeAr;
    }

    @Override
    public void enQueue(int Data) {
        if(isFull()){
            System.out.println("The Queue is full");
        }
        else {
            top++;
            arr[Capacity]=Data;
            System.out.println("The element inserted to array is "+Data);
        }
    }

    @Override
    public void deQueue() {

    }

    @Override
    public int size() {
        int Count =0;
        for (int i = 0; i < rear-1; i++) {
            Count++;
        }
        return Count;
    }

    @Override
    public void Display() {

    }

    @Override
    public boolean isEmpty() {
        return rear==0;
    }

    @Override
    public boolean isFull() {
        return rear==Capacity-1;
    }
}
public class QueueImplementation {
    static public void main(String[]a){
        Queue q1 = new Queue(10);
        q1.enQueue(5);
        q1.enQueue(15);
        q1.enQueue(25);
        q1.enQueue(35);
        q1.enQueue(45);
        q1.enQueue(55);
        q1.enQueue(65);
//        System.out.println(q1.size());
    }
}
