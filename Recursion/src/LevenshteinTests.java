import student.TestCase;

// -------------------------------------------------------------------------
/**
 * Test cases for the Levenshtein distance algorithm.
 *
 * @author Tuan Nguyen tuanhmng
 * @version 2013.11.14
 */
public class LevenshteinTests extends TestCase
{
    //fields
    private Levenshtein a1;
    private Levenshtein a2;
    private Levenshtein a3;
    private Levenshtein a4;

    // ----------------------------------------------------------
    /**
     * Creates Levenshtein objects for testing.
     */
    public void setUp()
    {
        a1 = new Levenshtein("clap", "cram");
        a2 = new Levenshtein("mitt", "smitten");
        a3 = new Levenshtein("start", "cart");
        a4 = new Levenshtein("this is a long sentence",
            "this sentence is long");
    }

    /**
     * Test the wrapper method distance().
     * implicitly tests the private recursive method distance().
     */
    public void testDistance()
    {
        assertEquals(2, a1.distance());
        assertEquals(3, a2.distance());
        assertEquals(2, a3.distance());
        assertEquals(15, a4.distance());
    }


}
