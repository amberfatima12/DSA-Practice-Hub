package PRACTICLE.DSA;
public class tree{
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class binarytree{
        static int  index= -1;
public static Node buildtree(int nodes[]){
index ++;
if(nodes[index]==-1){
    return null;
}
Node newNode = new Node(nodes[index]);
newNode.left=buildtree(nodes);
newNode.right=buildtree(nodes);
return newNode;
}
    }

    public static void preorder(Node root){
        if(root == null){
            return ;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);

    }

    
    public static void inorder(Node root){
        if(root == null){
            return ;
        }
             inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);

    }
 public static void postorder(Node root){
        if(root == null){
            return ;
        }
             postorder(root.left);
        postorder(root.right);
  System.out.print(root.data+" ");
    }

    public static void main(String[] args){
 int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
 binarytree tree = new binarytree();
 Node root = tree.buildtree(nodes);
 System.out.println(root.data);
 System.out.print("pre order = ");
 preorder(root);
 System.out.println(" ");
 System.out.print("in order = ");
 inorder(root);
  System.out.println(" ");
 System.out.print("post order = ");
 postorder(root);
    }
}