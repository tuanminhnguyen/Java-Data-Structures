import java.util.NoSuchElementException;
import java.util.Iterator;
import student.TestCase;

//-------------------------------------------------------------------------
/**
 * Tests for the {@link ArrayStack} class.
 *
 * @author Tuan Nguyen tuanhmng
 * @version 2013.10.31
 */
public class ArrayStackTest extends TestCase
{
    //~ Instance/static variables .............................................

    private Stack<String> stack;


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Create a new test class
     */
    public ArrayStackTest()
    {
        // The constructor is usually empty in unit tests, since it runs
        // once for the whole class, not once for each test method.
        // Per-test initialization should be placed in setUp() instead.
    }


    //~ Public methods ........................................................

    // ----------------------------------------------------------
    /**
     * Creates a brand new, empty stack for each test method.
     */
    public void setUp()
    {
        stack = new ArrayStack<String>();
    }

    // ----------------------------------------------------------
    /**
     * Test the push() method.
     */
    public void testPush()
    {
        stack.push("hello");
        assertEquals(1, stack.size());
        assertEquals("hello", stack.top());

        stack.push("goodbye");
        assertEquals(2, stack.size());
        assertEquals("goodbye", stack.top());
    }


    // ----------------------------------------------------------
    /**
     * Test the pop() method.
     */
    public void testPop()
    {
        String word = "hello";
        stack.push(word);
        assertEquals(1, stack.size());

        stack.pop();

        // After removal, make sure the inserted object is no longer there.
        assertEquals(0, stack.size());
    }


    // ----------------------------------------------------------
    /**
     * Test the topAndPop() method.
     */
    public void testTopAndPop()
    {
        String word = "hello";
        stack.push(word);

        // Use assertSame() to ensure the specific object added is the
        // one returned here
        assertSame(word, stack.topAndPop());

        // After removal, make sure the inserted object is no longer there.
        assertEquals(0, stack.size());
    }


    // ----------------------------------------------------------
    /**
     * Test clear() with multiple values in the stack.
     */
    public void testRemove3()
    {
        String word1 = "hello";
        stack.push(word1);
        String word2 = "goodbye";
        stack.push(word2);
        assertEquals(2, stack.size());

        stack.clear();
        assertEquals(0, stack.size());
    }


    // ----------------------------------------------------------
    /**
     * Tests expandCapacity().
     */
    public void testExpandCapacity()
    {
        String word1 = "1";
        stack.push(word1);
        String word2 = "2";
        stack.push(word2);
        String word3 = "3";
        stack.push(word3);
        String word4 = "4";
        stack.push(word4);
        String word5 = "5";
        stack.push(word5);
        String word6 = "6";
        stack.push(word6);
        String word7 = "7";
        stack.push(word7);
        String word8 = "8";
        stack.push(word8);
        String word9 = "9";
        stack.push(word9);
        String word10 = "10";
        stack.push(word10);


        stack.push("11");
        assertEquals(11, stack.size());
        assertEquals("11", stack.top());
    }

    // ----------------------------------------------------------
    /**
     * Tests hasNext() in case of no exception.
     */
    public void testHasNext()
    {
        String word1 = "1";
        stack.push(word1);
        String word2 = "2";
        stack.push(word2);
        String word3 = "3";
        stack.push(word3);
        String word4 = "4";
        stack.push(word4);
        String word5 = "5";
        stack.push(word5);
        Iterator<String> iter = stack.iterator();
        assertTrue(iter.hasNext());
    }

    // ----------------------------------------------------------
    /**
     * Tests hasNext() to throw an exception.
     */
    public void testHasNexte()
    {
        Iterator<String> iter = stack.iterator();
        assertFalse(iter.hasNext());
    }

    // ----------------------------------------------------------
    /**
     * Tests next() in case of no exception.
     */
    public void testNext()
    {
        String word1 = "1";
        stack.push(word1);
        String word2 = "2";
        stack.push(word2);
        String word3 = "3";
        stack.push(word3);
        String word4 = "4";
        stack.push(word4);
        String word5 = "5";
        stack.push(word5);

        Iterator<String> iter = stack.iterator();
        String temp = iter.next();
        assertEquals("5", temp);
    }

    // ----------------------------------------------------------
    /**
     * Tests next() to throw an exception.
     */
    public void testNexte()
    {
        Iterator<String> iter = stack.iterator();
        Exception occurred = null;
        try
        {
            iter.next();
        }
        catch (Exception exp)
        {
            occurred = exp;
        }
        assertNotNull(occurred);
        assertTrue(occurred instanceof NoSuchElementException);
        assertEquals("there" +
            "is no next element.", occurred.getMessage());

    }
    // ----------------------------------------------------------
    /**
     * Tests remove() in case of no exception.
     */
    public void testRemove()
    {
        String word1 = "1";
        stack.push(word1);
        String word2 = "2";
        stack.push(word2);
        String word3 = "3";
        stack.push(word3);
        String word4 = "4";
        stack.push(word4);
        String word5 = "5";
        stack.push(word5);

        Iterator<String> iter = stack.iterator();
        iter.next();
        iter.next();
        iter.next();
        iter.remove();
        assertEquals(4, stack.size());
    }

    // ----------------------------------------------------------
    /**
     * Tests the remove() method to throw an exception.
     */
    public void testRemovee()
    {
        Exception occurred = null;
        Iterator<String> iter = stack.iterator();
        try
        {
            iter.remove();
        }
        catch (Exception exp)
        {
            occurred = exp;
        }
        assertNotNull(occurred);
        assertTrue(occurred instanceof IllegalStateException);
        assertEquals("next() has not" +
            "been called.", occurred.getMessage());
    }

    // ----------------------------------------------------------
    /**
     * Tests hasNext() and next() using a while loop.
     */
    public void testAll()
    {
        String word1 = "1";
        stack.push(word1);
        String word2 = "2";
        stack.push(word2);
        String word3 = "3";
        stack.push(word3);
        String word4 = "4";
        stack.push(word4);
        String word5 = "5";
        stack.push(word5);

        Iterator<String> iter = stack.iterator();
        while (iter.hasNext())
        {
            assertEquals("5", iter.next());
            assertEquals("4", iter.next());
            assertEquals("3", iter.next());
            assertEquals("2", iter.next());
            assertEquals("1", iter.next());
        }
        assertFalse(iter.hasNext());
    }

    /**
     * Tests an ArrayStack using a for-each loop.
     */
    public void testAlle()
    {
        String word1 = "1";
        stack.push(word1);
        String word2 = "2";
        stack.push(word2);
        String word3 = "3";
        stack.push(word3);
        String word4 = "4";
        stack.push(word4);
        String word5 = "5";
        stack.push(word5);

        int i = 5;
        for (Iterator<String> iter = stack.iterator(); iter.hasNext();)
        {
            assertEquals(String.valueOf(i), iter.next());
            --i;
        }
    }
}
