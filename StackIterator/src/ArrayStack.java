import java.util.NoSuchElementException;
import java.util.Iterator;

//-------------------------------------------------------------------------
/**
 * A list-based implementation of a stack.
 *
 * @param <Item> The type of elements contained in the bag.
 *
 * @author Tuan Nguyen tuanhmng
 * @version 2013.10.31
 */
public class ArrayStack<Item> implements Stack<Item>
{
    //~ Instance/static variables .............................................

    private static final int DEFAULT_CAPACITY = 10;
    private int size;         // the current number of items in the collection
    private Item[] contents;  // the set's contents


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Create an empty stack with the default capacity.
     */
    public ArrayStack()
    {
        size = 0;

        // It is not possible in Java to create a new array containing
        // objects of a generic type like Item, so we have to use a "trick",
        // creating an Object[] array and then telling the compiler to
        // treat it as a Item[] array instead:
        @SuppressWarnings("unchecked")
        Item[] newArray = (Item[])(new Object[DEFAULT_CAPACITY]);

        // Now that we have created the array, we can use it as the
        // initial value for our field
        contents = newArray;
    }


    //~ Public methods ........................................................

    // ----------------------------------------------------------
    /**
     * Test if the stack is logically empty.
     * @return true if empty, false otherwise.
     */
    public int size()
    {
        return size;
    }


    // ----------------------------------------------------------
    /**
     * Make the stack logically empty.
     */
    public void clear()
    {
        size = 0;
    }


    // ----------------------------------------------------------
    /**
     * Insert a new item into the stack.
     * @param value the item to insert.
     */
    public void push(Item value)
    {
        if (size >= contents.length)
        {
            expandCapacity();
        }

        contents[size] = value;
        ++size;
    }


    // ----------------------------------------------------------
    /**
     * Remove the most recently inserted item from the stack.
     */
    public void pop()
    {
        --size;
    }


    // ----------------------------------------------------------
    /**
     * Get the most recently inserted item in the stack.
     * Does not alter the stack.
     * @return the most recently inserted item in the stack.
     * @precondition The stack is not empty.
     */
    public Item top()
    {
        return contents[size - 1];
    }


    // ----------------------------------------------------------
    /**
     * Return and remove the most recently inserted item
     * from the stack.
     * @return the most recently inserted item in the stack.
     * @precondition The stack is not empty.
     */
    public Item topAndPop()
    {
        pop();
        return contents[size];
    }


    //~ Private methods .......................................................

    // ----------------------------------------------------------
    /**
     * Creates a new array to store the contents of the collection with
     * twice the capacity of the old one.
     */
    private void expandCapacity()
    {
        @SuppressWarnings("unchecked")
        Item[] larger = (Item[])(new Object[contents.length * 2]);

        for (int i = 0; i < size; i++)
        {
            larger[i] = contents[i];
        }

        contents = larger;
    }

    /**
     * Iterates through the ArrayStack.
     * @return a StackIterator object indicating
     * the current index.
     */
    public StackIterator iterator()
    {
        return new StackIterator();
    }


    /**
     *  Inner class of ArrayStack class.
     *  Provide a way to iterator through elements
     *  in an ArrayStack object.
     */
    private class StackIterator implements Iterator<Item>
    {
        private int index;
        private boolean nextsBeenCalled;

        //constructor
        /**
         * creates a StackIterator object.
         */
        public StackIterator()
        {
            index = size;
        }

        /**
         * hasNext() returns
         * @return true if index is greater than 0,
         * false if index equals zero.
         */
        @Override
        public boolean hasNext()
        {
            return index != 0;
        }

        /**
         * next() returns the item at the next index.
         * @return the item at the next index.
         */
        @Override
        public Item next()
        {
            nextsBeenCalled = true;
            if (hasNext())
            {
                return contents[--index];
            }
            else
            {
                throw new NoSuchElementException("there" +
                    "is no next element.");
            }
        }

        /**
         * remove() removes the item at the current index.
         */
        @Override
        public void remove()
        {
            if (nextsBeenCalled)
            {
                //replace item at index i with item at index i + 1
                for (int i = index; i < size; i++)
                {
                    contents[i] = contents[i + 1];
                }
                //decrease size by 1
                --size;
                nextsBeenCalled = false;
            }
            else
            {
                throw new IllegalStateException("next() has not" +
                    "been called.");
            }
        }
    }
}
