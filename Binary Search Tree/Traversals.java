class Node {
    int key;
    Node left,right;
    Node(int key){
        this.key=key;
        left=right=null;
    }
}
 class bst{
    static Node insert(Node root,int key) {
        if(root==null){
            return new Node(key);
        }
        if(root.key==key){
            return root;
        }
        if(key>root.key){
            root.right=insert(root.right, key);
        }
        else {
            root.left=insert(root.left, key);
        }
        return root;
    }

    
    static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.key+" ");
            inorder(root.right);
        }
    }
    static void preorder(Node root)
     {
        if(root!=null)
        {
            System.out.print(root.key+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
      static void postorder(Node root)
     {
        if(root!=null)
        {
            postorder(root.left); 
            postorder(root.right);
            System.out.print(root.key+" ");
        }
    }
         
    public static void main(String args[]){
        Node root=null;
        int a[]={13,24,28,30};
        for(int i=0;i<a.length;i++)
        {
            root=insert(root,a[i]);
        }
        inorder(root);
        System.out.println();
        preorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
    }
}
