package Queue;
interface QueueRule{

    void enQueue(int x);
    void deQueue();
    boolean isEmpty();
    boolean isFull();
    void clear();
    void display();
}
class Queue implements QueueRule{
    private int arr[];
    private int front=-1;
    private int top= 0;
    private int Capacity;

     Queue(int Capacity){
        arr = new int[Capacity];
    }
    @Override
    public void enQueue(int value) {
        if(isFull()){
            System.out.println("Stack is full");
        }
        else {
            top++;
            arr[Capacity] = value;
            System.out.println("The element inserted to the queue is "+ value);
        }

    }

    @Override
    public void deQueue() {
        if(isEmpty()){
            System.out.println("Stack is empty nothing to remove");
        }
        else {
            arr[Capacity]= arr[Capacity+1];
            top--;
        }
    }

    @Override
    public boolean isEmpty() {
        return top==-1;
    }

    @Override
    public boolean isFull() {
        return top== Capacity-1;
    }

    @Override
    public void clear() {
        if(isEmpty()){
            System.out.println("Nothing to delete");
        }
        else{
            for (int i = 0; i < Capacity; i++) {
                top--;
            }
        }
    }

    @Override
    public void display() {
         if(isEmpty()){
             System.out.println("Queue is empty nothing to display");
         }
         else{
             for (int i = 0; i < Capacity; i++) {
                 System.out.println(arr[i]);
             }
         }

    }
}
public class QueueImplementation {
    public static void main(String[] args) {
        Queue q1 = new Queue(5);
        q1.enQueue(5);
        q1.enQueue(6);
        q1.enQueue(7);
        q1.enQueue(8);
        q1.deQueue();
        q1.display();
    }
}
