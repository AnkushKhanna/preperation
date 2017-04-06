package trees;

public class TreeOperations
{
    public static int sumOfLeftLeaves(Node root)
    {
        int sum = 0;
        if (root == null) {
            return 0;
        }
        if (root.left != null && root.left.left == null) {
            sum += root.left.data;
        } else {
            sum += sumOfLeftLeaves(root.left);
        }

        sum += sumOfLeftLeaves(root.right);
        return sum;
    }

    public static int sumOfChildren(Node root)
    {
        if (root == null) {
            return 0;
        }

        int left = sumOfChildren(root.left);
        int right = sumOfChildren(root.right);

        int sum = left + right + root.data;

        root.data = left + right;

        return sum;
    }
}

class Node
{
    Node left;

    Node right;

    int data;

    public Node(final int data)
    {
        this.data = data;
    }
}
