class TreeNode
{
    static class NotPerfectException extends Exception
    {
    }

    TreeNode left;

    TreeNode right;

    public static boolean isPerfect(TreeNode root)
    {
        try {
            isPerfect(root, 0);
            return true;
        } catch (NotPerfectException ex) {
            return false;
        }
    }

    private static int isPerfect(TreeNode root, int depth) throws NotPerfectException
    {
        if (root == null) {
            return depth;
        }
        if (root.left == null && root.right == null) {
            return depth;
        }

        if ((root.left == null && root.right != null) || (root.right == null && root.left != null)) {
            throw new NotPerfectException();
        }

        int depthLeft = isPerfect(root.left, depth + 1);

        int depthRight = isPerfect(root.right, depth + 1);

        if(depthLeft != depthRight){
            throw new NotPerfectException();
        }

        return depthLeft;
    }

    static TreeNode leaf()
    {
        return new TreeNode();
    }

    static TreeNode join(TreeNode left, TreeNode right)
    {
        return new TreeNode().withChildren(left, right);
    }

    TreeNode withLeft(TreeNode left)
    {
        this.left = left;
        return this;
    }

    TreeNode withRight(TreeNode right)
    {
        this.right = right;
        return this;
    }

    TreeNode withChildren(TreeNode left, TreeNode right)
    {
        this.left = left;
        this.right = right;
        return this;
    }

    TreeNode withLeftLeaf()
    {
        return withLeft(leaf());
    }

    TreeNode withRightLeaf()
    {
        return withRight(leaf());
    }

    TreeNode withLeaves()
    {
        return withChildren(leaf(), leaf());
    }

    public static void main(String[] args)
    {
        TreeNode root1 = null;
        System.out.println(isPerfect(root1));

        TreeNode root2 = TreeNode.leaf().withLeaves();
        System.out.println(isPerfect(root2));

        TreeNode root3 = TreeNode.leaf().withLeftLeaf();

        System.out.println(isPerfect(root3));

    }
}

