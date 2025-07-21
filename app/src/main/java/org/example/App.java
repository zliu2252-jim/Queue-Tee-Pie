package org.example;

/**
 * The App class contains the entry point for showing
 * the QueueTees queue and Cutie objects in action.
 */
public class App {
    public static void main(String[] args) {
        // Create a queue with a maximum size of 3
        QueueTees queue = new QueueTees(3);

        // Create different Cutie objects
        Puppy puppy = new Puppy();
        Kitty kitty = new Kitty();
        PygmyMarmoset marmoset = new PygmyMarmoset();

        // Print the initial size of the queue.
        System.out.println("Initial queue size: " + queue.size());

        // Enqueue three Cutie objects into the queue
        queue.enqueue(puppy);
        queue.enqueue(kitty);
        queue.enqueue(marmoset);

        // Prepare to enqueue another object
        queue.enqueue(puppy);

        // Print the queue size after enqueueing three objects
        System.out.println("Queue size after adding: " + queue.size());

        // Dequeue and print the descriptions of each Cutie
        System.out.println("Dequeued: " + queue.dequeue().description());
        System.out.println("Dequeued: " + queue.dequeue().description());
        System.out.println("Dequeued: " + queue.dequeue().description());

        // Prepare to dequeue from an empty queue
        System.out.println("Dequeued: " + queue.dequeue());
    }
}
