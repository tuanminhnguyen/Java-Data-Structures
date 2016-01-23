import student.TestCase;
// -------------------------------------------------------------------------
/**
 *  Test expression.
 *
 *  @author Tuan Nguyen tuanhmng
 *  @version Nov 22, 2013
 */
public class ExpressionTest extends TestCase
{

    // ----------------------------------------------------------
    private String[] args;
    /**
     * set up.
     */
    public void setUp()
    {
        Expressions.main(args);
    }

    /**
     * test Expression.
     */
    public void testExpression()
    {
        assertTrue(systemOut().getHistory().contains("(((a) - " +
            "(b)) * (((c) + (d)) / (e)))"));
    }

}
