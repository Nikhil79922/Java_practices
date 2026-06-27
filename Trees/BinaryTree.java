package Trees;

public class BinaryTree {
    static class Node {
        int val;
        Node left;
        Node right;

        public Node(int value) {
            this.val = value;
            this.left = null;
            this.right = null;
        }
    }

    static class BT {
        static int idx = -1;

        public Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        public void PreOrderTranverse(Node root) {
            if (root == null) {
                System.out.print(-1 + " ");
                return;
            }
            System.out.print(root.val + " ");
            PreOrderTranverse(root.left);
            PreOrderTranverse(root.right);
        }

        public void InOrderTranverse(Node root) {
            if (root == null) {
                System.out.print(-1 + " ");
                return;
            }
            InOrderTranverse(root.left);
            System.out.print(root.val + " ");
            InOrderTranverse(root.right);
        }

        public void PostOrderTranverse(Node root) {
            if (root == null) {
                System.out.print(-1 + " ");
                return;
            }
            PostOrderTranverse(root.left);
            PostOrderTranverse(root.right);
            System.out.print(root.val + " ");
        }
    }

    public static void main(String[] args) {
        int node[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BT tree = new BT();
        Node root = tree.buildTree(node);
        System.out.print("PreOrder Traversal :- ");
        tree.PreOrderTranverse(root);
        System.out.println("");

        System.out.print("InOrder Traversal :- ");
        tree.InOrderTranverse(root);
        System.out.println("");

        System.out.print("PostOrder Traversal :- ");
        tree.PostOrderTranverse(root);
        System.out.println("");
    }
}
