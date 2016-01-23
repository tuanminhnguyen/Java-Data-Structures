import student.TestCase;


// -------------------------------------------------------------------------
/**
 *  Test BinaryTree class.
 *
 *  @author Tuan Nguyen tuanhmng
 *  @version Nov 22, 2013
 */
public class BinaryTreeTest extends TestCase
{
    //fields
    /**
     * multinodal BinaryTree.
     */
    BinaryTree<String> multiNode;
    /**
     * Single node BinaryTree.
     */
    BinaryTree<String> leftTree;
    /**
     * Single node BinaryTree.
     */
    BinaryTree<String> rightTree;
    /**
     * Set up.
     */
    public void setUp()
    {
        leftTree = new BinaryTree<String>("2");
        rightTree = new BinaryTree<String>(null);
        multiNode = new BinaryTree<String>("1", leftTree, rightTree);
    }


    // ----------------------------------------------------------
    /**
     * test height().
     */
    public void testHeight()
    {
        assertEquals(1, rightTree.height());
        assertEquals(1, leftTree.height());
        assertEquals(2, multiNode.height());
        BinaryTree<String> addLeft = new BinaryTree<String>("4");
        BinaryTree<String> addRight = new BinaryTree<String>("5");
        multiNode.getLeft().setLeft(addLeft);
        multiNode.getLeft().setRight(addRight);
        assertEquals(3, multiNode.height());
        multiNode.getLeft().setLeft(null);
        multiNode.getLeft().setRight(null);
        assertEquals(2, multiNode.height());
    }

    /**
     * test size().
     */
    public void testSize()
    {
        assertEquals(1, rightTree.size());
        assertEquals(1, leftTree.size());
        assertEquals(3, multiNode.size());
        BinaryTree<String> addLeft = new BinaryTree<String>("4");
        BinaryTree<String> addRight = new BinaryTree<String>("5");
        multiNode.getLeft().setLeft(addLeft);
        multiNode.getLeft().setRight(addRight);
        assertEquals(5, multiNode.size());
        multiNode.getLeft().setLeft(null);
        multiNode.getLeft().setRight(null);
        assertEquals(3, multiNode.size());
    }

    /**
     * test clone().
     */
    public void testClone()
    {
        BinaryTree<String> copy = multiNode.clone();
        assertEquals("1", copy.getElement());
        assertEquals("2", copy.getLeft().getElement());
        assertNull(copy.getRight().getElement());
        assertNull(copy.getRight().getRight());
        assertNull(copy.getRight().getLeft());
        assertNull(copy.getLeft().getRight());
        assertNull(copy.getLeft().getLeft());
    }

    /**
     * test toPreOrderString().
     */
    public void testToPreOrderString()
    {
        assertEquals("(2)", leftTree.toPreOrderString());
        assertEquals("(null)", rightTree.toPreOrderString());
        assertEquals("(1 (2) (null))", multiNode.toPreOrderString());
        BinaryTree<String> addLeft = new BinaryTree<String>("4");
        BinaryTree<String> addRight = new BinaryTree<String>("5");
        rightTree.setElement("3");
        multiNode.getLeft().setLeft(addLeft);
        multiNode.getLeft().setRight(addRight);
        assertEquals("(1 (2 (4) (5)) (3))", multiNode.toPreOrderString());
    }

    /**
     * test toInOrderString().
     */
    public void testToInOrderString()
    {
        assertEquals("(2)", leftTree.toInOrderString());
        assertEquals("(null)", rightTree.toPreOrderString());
        //assertEquals("((2) 1 (null))", multiNode.toInOrderString());
        BinaryTree<String> addLeft = new BinaryTree<String>("4");
        BinaryTree<String> addRight = new BinaryTree<String>("5");
        rightTree.setElement("3");
        multiNode.getLeft().setLeft(addLeft);
        multiNode.getLeft().setRight(addRight);
        assertEquals("(((4) 2 (5)) 1 (3))", multiNode.toInOrderString());
    }

    /**
     * test toPostOrderString().
     */
    public void testToPostOrderString()
    {
        assertEquals("(2)", leftTree.toPostOrderString());
        assertEquals("(null)", rightTree.toPostOrderString());
        assertEquals("((2) (null) 1)", multiNode.toPostOrderString());
        BinaryTree<String> addLeft = new BinaryTree<String>("4");
        BinaryTree<String> addRight = new BinaryTree<String>("5");
        rightTree.setElement("3");
        multiNode.getLeft().setLeft(addLeft);
        multiNode.getLeft().setRight(addRight);
        assertEquals("(((4) (5) 2) (3) 1)", multiNode.toPostOrderString());
    }
}
