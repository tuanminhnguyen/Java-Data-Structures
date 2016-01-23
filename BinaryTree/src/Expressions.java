
// -------------------------------------------------------------------------
/**
 *  Test the BinaryTree by creating and printing an expression.
 *
 *  @author Tuan Nguyen tuanhmng
 *  @version Nov 22, 2013
 */
public class Expressions
{

    // ----------------------------------------------------------
    //fields
    private static BinaryTree<String> exp;
    /**
     * creates a binary tree containing the expression.
     * @param args input
     */
    public static void main(String[] args)
    {
        exp = new BinaryTree<String>("*");

        BinaryTree<String> left1 = new BinaryTree<String>("-");
        BinaryTree<String> right1 = new BinaryTree<String>("/");
        BinaryTree<String> lleft2 = new BinaryTree<String>("a");
        BinaryTree<String> lright2 = new BinaryTree<String>("b");
        BinaryTree<String> rleft2 = new BinaryTree<String>("+");
        BinaryTree<String> rright2 = new BinaryTree<String>("e");
        BinaryTree<String> rlleft3 = new BinaryTree<String>("c");
        BinaryTree<String> rlright3 = new BinaryTree<String>("d");

        exp.setLeft(left1);
        exp.setRight(right1);
        left1.setLeft(lleft2);
        left1.setRight(lright2);
        right1.setLeft(rleft2);
        right1.setRight(rright2);
        rleft2.setLeft(rlleft3);
        rleft2.setRight(rlright3);

        String output = exp.toInOrderString();
        System.out.print(output);
    }

}
