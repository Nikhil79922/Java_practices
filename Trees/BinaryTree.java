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

        static int count=0;
        public int countNodes(Node root){
            if(root == null){
                return count;
            }else{
                count++;
            }
            countNodes(root.left);
            countNodes(root.right);
            return  count;
        }

        //Better way to count Nodes
        public int countNodesII(Node root) {
            if (root == null) {
                return 0;
            }

            int leftCount = countNodes(root.left);
            int rightCount = countNodes(root.right);

            return leftCount + rightCount + 1;
        }

        public int totalSumOfNode(Node root) {
            if (root == null) {
                return 0;
            }

            int leftCount = totalSumOfNode(root.left);
            int rightCount = totalSumOfNode(root.right);

            return leftCount + rightCount + root.val ;
        }

        public int heightOfTree(Node root) {
            if (root == null) {
                return 0;
            }
            int leftCount = heightOfTree(root.left);
            int rightCount = heightOfTree(root.right);
            return Math.max(leftCount , rightCount ) + 1;
        }

        public int diameterOfTree(Node root) {
            if (root == null) {
                return 0;
            }
            int leftdiameter = diameterOfTree(root.left);
            int rightRight = diameterOfTree(root.right);
            int totalHeightFromNode = heightOfTree(root.left) + heightOfTree(root.right) + 1;
            return Math.max(Math.max(leftdiameter , rightRight) , totalHeightFromNode);
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


        System.out.print("Node Count Traversal :- ");
        int totalCount = tree.countNodes(root);
        System.out.println(totalCount);


        System.out.print("Node Sum Traversal :- ");
        int totalSum = tree.totalSumOfNode(root);
        System.out.println(totalSum);


        System.out.print("Nodes total Height  Traversal :- ");
        int totalHeight = tree.heightOfTree(root);
        System.out.println(totalHeight);

        System.out.print("Diameter of Tree , longest path between any two nodes :- ");
        int diameter = tree.diameterOfTree(root);
        System.out.println(diameter);
    }
}
