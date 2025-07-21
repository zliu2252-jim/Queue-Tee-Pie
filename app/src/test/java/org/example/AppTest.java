package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * This class is the unit tests for the QueueTees queue and Cutie objects.
 */
class AppTest {

    /**
     * Tests that a newly created queue has size zero.
     */
    @Test
    void testQueueInitialSizeIsZero() {
        QueueTees queue = new QueueTees(3);
        assertEquals(0, queue.size());
    }

    /**
     * Tests that enqueueing elements increases the queue size.
     */
    @Test
    void testEnqueueAndSize() {
        QueueTees queue = new QueueTees(3);
        queue.enqueue(new Puppy());
        queue.enqueue(new Kitty());
        assertEquals(2, queue.size());
    }

    /**
     * Tests that dequeue returns elements in first-in, first-out order.
     */
    @Test
    void testDequeueReturnsInOrder() {
        QueueTees queue = new QueueTees(3);
        Cutie puppy = new Puppy();
        Cutie kitty = new Kitty();
        queue.enqueue(puppy);
        queue.enqueue(kitty);
        assertEquals(puppy.description(), queue.dequeue().description());
        assertEquals(kitty.description(), queue.dequeue().description());
    }

    /**
     * Tests that the queue does not exceed its maximum size.
     */
    @Test
    void testQueueFull() {
        QueueTees queue = new QueueTees(2);
        queue.enqueue(new Puppy());
        queue.enqueue(new Kitty());
        queue.enqueue(new PygmyMarmoset());
        assertEquals(2, queue.size());
    }
}
