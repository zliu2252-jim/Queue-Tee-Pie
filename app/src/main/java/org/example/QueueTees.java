package org.example;

/**
 * This class implements a fixed-size queue for storing Cutie objects.
 * It uses an array under the hood and supports enqueue, dequeue, and size operations.
 * When the queue is full, new items cannot be enqueued.
 * When the queue is empty, dequeue returns null.
 */
public class QueueTees {
    // The maximum number of elements that can be stored in the queue.
    final int Max_size;
    // The array to hold Cutie objects.
    final Cutie[] queue;
    // The index of the front element in the queue.
    int front;
    // The index about the place that next Cutie will be inserted.
    int rear;
    // The current number of elements in the queue.
    int count;

    /**
     * Constructs a new QueueTees object with the maximum size.
     *
     * @param maxSize the maximum number of elements that queue can hold
     */
    public QueueTees(int maxSize) {
        this.Max_size = maxSize;
        this.queue = new Cutie[Max_size];
        this.front = 0;
        this.rear = 0;
        this.count = 0;
    }

    /**
     * Adds a new Cutie to the rear of the queue.
     * If the queue is full, the new object is not added.
     *
     * @param cutie the Cutie object to enqueue
     */
    public void enqueue(Cutie cutie) {
        if (count == Max_size) {
            System.out.println("The queue is full! Cannot enqueue.");
            return;
        }
        queue[rear] = cutie;
        rear = (rear + 1) % Max_size;
        count++;
    }

    /**
     * Removes and returns the Cutie object at the front of the queue.
     * If the queue is empty, returns null.
     *
     * @return the Cutie object at the front, or null if the queue is empty
     */
    public Cutie dequeue() {
        if (count == 0) {
            System.out.println("The queue is empty! Cannot dequeue.");
            return null;
        }
        Cutie result = queue[front];
        queue[front] = null;
        front = (front + 1) % Max_size;
        count--;
        return result;
    }

    /**
     * Returns the current number of elements in the queue.
     *
     * @return the size of the queue
     */
    public int size() {
        return count;
    }
}