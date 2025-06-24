import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}

class Pair{
    Node node;
    int state = 0;
    Pair(Node node,int state){
        this.state = state;
        this.node = node;
    }
}

class TreeImpl{

    public static void preOrder(Node root){
        if(root == null) return;
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void iterativePreOrder(Node root){
        if(root == null) return;
        Stack<Node> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            Node poppepNode = st.pop();
            System.out.print(poppepNode.val+" ");
            if(poppepNode.right != null) st.push(poppepNode.right);
            if(poppepNode.left != null) st.push(poppepNode.left);
        }
    }
    public static void inOrder(Node root){
         if(root == null) return;
        
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }
    public static void postOrder(Node root){
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+" ");
    }

    public static void topView(Node root){
        if(root == null) return;
        Queue<Pair> queue = new LinkedList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        queue.add(new Pair(root,0));
        while (queue.size() != 0) {
            Pair poppedPair = queue.poll();
            int state = poppedPair.state;
            Node node = poppedPair.node;

            if(map.containsKey(state) == false){
                System.out.print(node.val+" ");
                map.put(state, null);
            }
            if(node.left != null){
                queue.add(new Pair(node.left,state-1));
            }
             if(node.right != null){
                queue.add(new Pair(node.right,state+1));
            }
        }

    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(100);
        root.right = new Node(1000);
        root.left.left = new Node(50);
        root.left.right = new Node(60);
        root.left.right.left = new Node(70);
        root.right.right = new Node(20);
        root.right.right.left = new Node(30);
        // preOrder(root);
        // System.out.println();
        // postOrder(root);
        // System.out.println();
        // inOrder(root);
        // System.out.println();
        //iterativePreOrder(root);
        topView(root);
;    }
}