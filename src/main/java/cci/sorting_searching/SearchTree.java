package cci.sorting_searching;

public class SearchTree
{
    class Node
    {
        int data;

        Node left;

        Node right;
    }

    boolean checkBST(Node root)
    {

        try {
            checkBST(root, Integer.MAX_VALUE, Integer.MIN_VALUE);
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    void checkBST(Node n, int max, int min) throws Exception
    {
        if (n.data < min || n.data > max) {
            throw new Exception();
        }

        checkBST(n.left, n.data, min);
        checkBST(n.right, max, n.data);
    }
}
