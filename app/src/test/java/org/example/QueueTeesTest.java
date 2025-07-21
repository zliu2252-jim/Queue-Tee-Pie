package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * This class contains unit tests about the QueueTees class.
 * It verifies that the queue initializes correctly, handles enqueue and dequeue operations,
 * enforces its maximum size, and returns null when dequeuing from an empty queue.
 */
class QueueTeesTest {

    /**
     * Tests that a newly created queue has size zero.
     */
    @Test
    void testInitialSizeIsZero() {
        QueueTees queue = new QueueTees(3);
        assertEquals(0, queue.size());
    }

    /**
     * Tests that enqueueing elements increases the queue size up to its maximum.
     */
    @Test
    void testEnqueueAndSize() {
        QueueTees queue = new QueueTees(2);
        queue.enqueue(new Puppy());
        assertEquals(1, queue.size());
        queue.enqueue(new Kitty());
        assertEquals(2, queue.size());
    }

    /**
     * Tests that dequeue returns elements in first-in, first-out order.
     */
    @Test
    void testDequeueFIFOOrder() {
        QueueTees queue = new QueueTees(2);
        Cutie puppy = new Puppy();
        Cutie kitty = new Kitty();
        queue.enqueue(puppy);
        queue.enqueue(kitty);
        assertEquals(puppy, queue.dequeue());
        assertEquals(kitty, queue.dequeue());
        assertEquals(0, queue.size());
    }

    /**
     * Tests that the queue does not exceed its maximum size and returns null
     * when dequeuing from an empty queue.
     */
    @Test
    void testQueueFullAndEmptyBehavior() {
        QueueTees queue = new QueueTees(1);
        queue.enqueue(new Puppy());
        queue.enqueue(new Kitty());
        assertEquals(1, queue.size());
        queue.dequeue();
        assertNull(queue.dequeue());
    }
}