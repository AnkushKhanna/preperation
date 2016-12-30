public class ArrayToTree
{
    static TreeNode arrayToTree(int[] array)
    {
        return arrayToTree(array, 0);
    }

    static TreeNode arrayToTree(int[] array, int start)
    {
        if (start >= array.length) {
            return null;
        }

        TreeNode root = new TreeNode(array[start]);

        if (array.length > (2 * start) + 1) {
            root.left = arrayToTree(array, (2 * start) + 1);
        }

        if  (array.length > (2 * start) + 2) {
            root.right = arrayToTree(array, (2 * start) + 2);
        }

        return root;
    }

    public static void main(String[] args)
    {
        TreeNode root = arrayToTree(new int[]{});

        displayTreeNode(root);
    }

    private static void displayTreeNode(TreeNode root) {
        if(root == null ){
            return;
        }
        System.out.println(root.value);

        if(root.left !=null) {
            displayTreeNode(root.left);
        }

        if(root.right != null){
            displayTreeNode(root.right);
        }
    }

    static class TreeNode
    {
        TreeNode left;

        TreeNode right;

        int value;

        TreeNode(int value, TreeNode left, TreeNode right)
        {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        TreeNode(int value)
        {
            this(value, null, null);
        }
    }

}

