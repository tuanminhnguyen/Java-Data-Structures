//-------------------------------------------------------------------------
/**
 * A deque implemented using a doubly-linked chain with sentinel nodes
 * at each end.
 *
 * @param <T> The type of elements contained in the deque.
 *
 * @author Stephen Edwards and Tony Allevato
 * @author Partner 1's name (pid)
 * @author Partner 2's name (pid)
 * @version (place the date here, in this format: yyyy.mm.dd)
 */
public class DoublyLinkedDeque<T>
    implements Deque<T>
{
    //~ Instance/static variables .............................................

    // A reference to the sentinel node at the beginning of the deque.
    private Node<T> head;

    // A reference to the sentinel node at the end of the deque.
    private Node<T> tail;

    // The number of elements in the deque.
    private int size;


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Construct the stack.
     */
    public DoublyLinkedDeque()
    {
        // TODO: remove this throw statement when you complete this constructor
        throw new UnsupportedOperationException(
            "You have not implemented the constructor yet");
    }


    //~ Public methods ........................................................

    // ----------------------------------------------------------
    /**
     * Insert a new item at the rear (the tail) of the deque.
     * @param value the item to insert.
     * @postcondition [new-contents] == [old-contents] * [value]
     */
    public void enqueueAtRear(T value)
    {
        // TODO: remove this throw statement when you implement this method
        throw new UnsupportedOperationException(
            "You have not implemented enqueueAtRear() yet");
    }


    // ----------------------------------------------------------
    /**
     * Remove the item at the front (the head) of the deque.
     * @return The item that was removed
     * @precondition |[old-contents]| > 0
     * @postcondition [old-contents] == [result] * [new-contents]
     */
    public T dequeueAtFront()
    {
        // TODO: remove this throw statement when you implement this method
        throw new UnsupportedOperationException(
            "You have not implemented dequeueAtFront() yet");
    }


    // ----------------------------------------------------------
    /**
     * Insert a new item at the front (the head) of the deque.
     * @param value the item to insert.
     * @postcondition [new-contents] = [value] * [old-contents]
     */
    public void enqueueAtFront(T value)
    {
        // TODO: remove this throw statement when you implement this method
        throw new UnsupportedOperationException(
            "You have not implemented enqueueAtFront() yet");
    }


    // ----------------------------------------------------------
    /**
     * Remove the item at the rear (the tail) of the deque.
     * @return The item that was removed
     * @precondition |[old-contents]| > 0
     * @postcondition [old-contents] = [new-contents] * [result]
     */
    public T dequeueAtRear()
    {
        // TODO: remove this throw statement when you implement this method
        throw new UnsupportedOperationException(
            "You have not implemented dequeueAtRear() yet");
    }


    // ----------------------------------------------------------
    /**
     * Get the item at the front (the head) of the deque.
     * Does not alter the deque.
     * @return the item at the front of the deque.
     * @precondition |[contents]| > 0
     * @postcondition [new-contents] == [old-contents] and
     *     [contents] = [result] * [rest-of-items]
     */
    public T frontItem()
    {
        // TODO: remove this throw statement when you implement this method
        throw new UnsupportedOperationException(
            "You have not implemented frontItem() yet");
    }


    // ----------------------------------------------------------
    /**
     * Get the item at the rear (the tail) of the deque.
     * Does not alter the deque.
     * @return the item at the rear of the deque.
     * @precondition |[contents]| > 0
     * @postcondition [new-contents] == [old-contents] and
     *     [contents] = [rest-of-items] * [result]
     */
    public T rearItem()
    {
        // TODO: remove this throw statement when you implement this method
        throw new UnsupportedOperationException(
            "You have not implemented rearItem() yet");
    }


    // ----------------------------------------------------------
    /**
     * Get the number of items in this deque.
     * Does not alter the deque.
     * @return The number of items this deque contains.
     * @postcondition result = |[contents]|
     */
    public int size()
    {
        // TODO: remove this throw statement when you implement this method
        throw new UnsupportedOperationException(
            "You have not implemented size() yet");
    }


    // ----------------------------------------------------------
    /**
     * Empty the deque.
     * @postcondition [new-contents] = []
     */
    public void clear()
    {
        // TODO: remove this throw statement when you implement this method
        throw new UnsupportedOperationException(
            "You have not implemented clear() yet");
    }


    // ----------------------------------------------------------
    /**
     * Returns a string representation of this deque.  A deque's string
     * representation is written as a comma-separated list of its
     * contents (in front-to-rear order) surrounded by square brackets,
     * like this:
     * <pre>
     * [52, 14, 12, 119, 73, 80, 35]
     * </pre>
     * <p>
     * An empty deque is simply <code>[]</code>.
     * </p>
     *
     * @return a string representation of the deque
     */
    public String toString()
    {
        // TODO: remove this throw statement when you implement this method
        throw new UnsupportedOperationException(
            "You have not implemented toString() yet");
    }
}
