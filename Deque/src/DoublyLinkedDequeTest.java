import student.TestCase;

//-------------------------------------------------------------------------
/**
 * Tests for the {@link DoublyLinkedDeque} class.
 *
 * @author Partner 1's name (pid)
 * @author Partner 2's name (pid)
 * @version (place the date here, in this format: yyyy.mm.dd)
 */
public class DoublyLinkedDequeTest
    extends TestCase
{
    //~ Instance/static variables .............................................

    private Deque<String> deque;


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Create a new test class
     */
    public DoublyLinkedDequeTest()
    {
        // The constructor is usually empty in unit tests, since it runs
        // once for the whole class, not once for each test method.
        // Per-test initialization should be placed in setUp() instead.
    }


    //~ Public methods ........................................................

    // ----------------------------------------------------------
    /**
     * Creates two brand new, empty sets for each test method.
     */
    public void setUp()
    {
        deque = new DoublyLinkedDeque<String>();
    }


    // TODO: Add your tests here.
}
