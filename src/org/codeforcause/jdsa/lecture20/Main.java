package org.codeforcause.jdsa.lecture20;

public class Main {
    public static void main(String[] args) {
//        CustomQueue queue = new CustomQueue();
//        queue.enqueue(12);
//        queue.enqueue(34);
//        queue.dequeue();
//        queue.enqueue(76);
//        queue.enqueue(18);
//        queue.enqueue(94);
//        queue.dequeue();
//
//        System.out.println(queue);


        CircularQueue circularQueue = new CircularQueue();
        circularQueue.enqueue(23);
        circularQueue.enqueue(12);
        circularQueue.dequeue();
        circularQueue.enqueue(76);
        circularQueue.enqueue(33);
        circularQueue.enqueue(92);

        System.out.println(circularQueue);

    }

}
