import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;


// add, remove , element exception dai r offer,poll,peak exception dai na



public class Queues {
    public static void main(String[] args) {
        Queue<Integer> q1 = new ArrayBlockingQueue<>(3);
        q1.add(50);
        q1.add(20);
        q1.add(2);
        System.out.println("head of the queue is : "+ q1.element());
        try {
            q1.add(36);
        }catch (IllegalStateException e){
            System.out.println("Tried to add too many in the queue ");
        }
        for (Integer q : q1){
            System.out.println("Queue value is : "+ q);
        }
        System.out.println("Remove from the queue: "+ q1.remove());
        System.out.println("Remove from the queue: "+ q1.remove());
        System.out.println("Remove from the queue: "+ q1.remove());

        try {
            System.out.println("Remove from the queue: "+ q1.remove());
        }catch (NoSuchElementException e){
            System.out.println("Too many item remove from queue");
        }
        Queue<Integer> q2 = new ArrayBlockingQueue<>(2);
        System.out.println("queue2 peak: "+ q2.peek());
        q2.offer(50);
        q2.offer(20);
        System.out.println("queue 2 peak : "+ q2.peek());
        if(!q2.offer(2)){
            System.out.println("Offer is failed to add item");
        }
        for(Integer q3: q2){
            System.out.println("queue2 value is "+ q3);
        }
        System.out.println("queue2 poll : "+ q2.poll());
        System.out.println("queue2 poll : "+ q2.poll());
        System.out.println("queue2 poll : "+ q2.poll());
    }
}
