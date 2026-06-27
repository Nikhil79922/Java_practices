package Trees;

import java.util.LinkedList;
import java.util.Queue;

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

        //Level Order Traversal;
        public void LevelOrderTraversal(Node root) {
            if (root == null) return;
             Queue<Node> q = new LinkedList<>();
             q.offer(root);
             q.offer(null);

             while(!q.isEmpty()){
                 Node level = q.poll();
                 if(level == null){
                     System.out.println(" ");

                     if (q.isEmpty()) {
                         break;
                     };
                     q.offer(null);
                 }else{
                     System.out.print(level.val + " ");
                     if(level.left != null) q.offer(level.left);
                     if(level.right != null) q.offer(level.right);
                 }
             }
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

        System.out.println("LevelOrder Traversal :- ");
        tree.LevelOrderTraversal(root);
        System.out.println("");
    }
}
