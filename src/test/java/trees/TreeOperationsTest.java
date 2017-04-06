package trees;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TreeOperationsTest
{
    @Test
    public void find_sum() throws Exception
    {
        Node root = createTree();

        Assert.assertEquals(21, TreeOperations.sumOfLeftLeaves(root));
    }

    @Test
    public void find_sum_children() throws Exception
    {
        Node root = createTree();
        TreeOperations.sumOfChildren(root);
        Assert.assertEquals(61, root.data);
    }

    private Node createTree()
    {
        Node n10 = new Node(10);
        Node n6 = new Node(6);
        Node n12 = new Node(12);
        Node n5 = new Node(5);
        Node root = new Node(10);
        Node n15 = new Node(15);
        Node n8 = new Node(8);
        Node n5_1 = new Node(5);

        root.left = n5;
        root.right = n15;

        n5.left = n10;
        n5.right = n12;

        n12.left = n6;

        n15.right = n8;

        n8.left = n5_1;

        return root;
    }
}
