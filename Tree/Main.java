public class Main {
    static class Node{
        int value;
        Node left,right;
        Node(int val){
            this.value = val;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        addNodeToLeaf(2, root, 'L','L');
        addNodeToLeaf(3, root, 'R','R');
        addNodeToLeaf(6, root, 'L','L');
        addNodeToLeaf(7, root, 'L','R');
        inOrder(root);
        // System.out.println();
        // inOrder(root);
        // System.out.println();
        // postOrder(root);
        // System.out.println();

    }

    public static void preOrder(Node root){
        if(root !=null){
            System.out.print(root.value+" ");
            preOrder(root.left);
            preOrder(root.right);

        }
    }
    public static void postOrder(Node root){
        if(root !=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.value+" ");
        }
    }

    public static void inOrder(Node root){
        if(root !=null){
            inOrder(root.left);
            System.out.print(root.value+" ");
            inOrder(root.right);
        }
    }

    public static void addNodeToLeaf(int value,Node root,char dir1 , char dir2){

        Node temp = root;
        if(dir1 == 'L'){
            while(temp.left !=null){
                temp=temp.left;
            }
        }else{
            while(temp.right != null){
                temp = temp.right;
            }
        }
        if(dir2=='L'){
            temp.left = new Node(value);
        }else{
            temp.right = new Node(value);
        }
    }
}








