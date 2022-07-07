package StackList;
interface QueRule{
    void enQueue(int value);
    void deQueue();
    void display();
    boolean isEmpty();
    boolean isFull();

}
class Queue implements QueRule{
    private int front,rear;
    private int CapacityOfQueue;
    private int arr[];
    Queue(int size){
        CapacityOfQueue= size;
        arr = new int[CapacityOfQueue];
    }
    @Override
    public void enQueue(int value) {
        if(isFull()){
            System.out.println("The Queue is already full you cant enter");
        }
        else{
            arr[rear]=value;
            rear++;
        }
    }

    @Override
    public void deQueue() {
        if(isEmpty()){
            System.out.println("The Queue is empty");
        }
        else{
            for (int i = 0; i < rear-1; i++) {
                arr[i]= arr[i+1];
            }
            rear--;
        }
    }

    @Override
    public void display() {
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        else {
            for (int i = 0; i < rear; i++) {
                System.out.print(arr[i]);
            }
        }

    }

    @Override
    public boolean isEmpty() {
       if(rear==0)
           System.out.println("Stack is empty");
        return rear==0;
    }

    @Override
    public boolean isFull() {
        if(rear==CapacityOfQueue)
            System.out.println("Stack is full");
        return rear==CapacityOfQueue;
    }
}
public class StackImplement {
    public static void main(String args[]){
        Queue q1 = new Queue(10);
//        q1.enQueue(1);
//        q1.enQueue(2);
//        q1.enQueue(3);
//        q1.enQueue(4);
//        q1.enQueue(5);
//        q1.enQueue(6);
//        q1.enQueue(7);
//        q1.display();
//        q1.deQueue();
//        q1.display();
        System.out.println(q1.isEmpty());

    }

}
