import java.util.LinkedList;
import java.util.Queue;

class BTNode {

    int data;
    BTNode left;
    BTNode right;

    public BTNode(int data) {
        this.data = data;
        left=right=null;
    }
    
    public void insertLeftChild(BTNode parent , BTNode child){
    parent.left = child;
    }
    
    public void insertRightChild(BTNode parent , BTNode child){
    parent.right = child;
    }
     
}

public class BinaryT {


    BTNode root;

    public BinaryT(int data) {
        root= new BTNode(data);
    }
    public void inOrder(BTNode root ){ // left - root - right
        
        if(root==null){
        return;
        }
        
        inOrder(root.left);
        System.out.print(" " + root.data);
        inOrder(root.right);
    
    }
    public void levelOrder(BTNode root){
        Queue<BTNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            BTNode cur = queue.remove();
            System.out.print(" "+ cur.data);
            
            if(cur.left!=null){
                queue.add(cur.left);
            }
            if(cur.right!=null){
                queue.add(cur.right);
            }
        }
    }
        
    
        public void preOrder(BTNode root){ // root-left-right
        
        if(root==null){
        return;
        }
        System.out.print(" " + root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
        
         public void postOrder(BTNode root){ // left-right-root
        
        if(root==null){
        return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(" " + root.data);
    }
         
    
        
        
    public static void main(String[] args) {
        BinaryT n1 = new BinaryT(1);
        System.out.println(n1.root.data);
        BTNode n2 = new BTNode(2);
        BTNode n3 = new BTNode(3);
        
        n1.root.insertLeftChild(n1.root, n2);
        n1.root.insertRightChild(n1.root, n3);

        BTNode n4 = new BTNode(4);
        BTNode n5 = new BTNode(5);
        n2.insertLeftChild(n2, n4);
        n2.insertRightChild(n2, n5);
        
         BTNode n6 = new BTNode(6);
         n3.insertRightChild(n3, n6);
         System.out.println("In-Order");
         n1.inOrder(n1.root);
         System.out.println("\npre-order");
         n1.preOrder(n1.root);
         System.out.println("\npost-order");
         n1.postOrder(n1.root);
         System.out.println("\nlevel-order");
         n1.levelOrder(n1.root);
            
    }
}
