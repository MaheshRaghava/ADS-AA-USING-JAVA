class Node
{
  int key;
  Node left,right;
  Node(int key)
  {
    this.key=key;
    this.left=null;
    this.right=null;
  }
}
public class bst
{
  public static Node insert(Node root,int key)
  {
    if(root==null)
    {
      return new Node(key);
    }
    else if(root.key==key)
    {
      return root;
    }
    else if(key>root.key)
    {
      root.right=insert(root.right,key);
    }
    else
    {
      root.left=insert(root.left,key);
    }
    return root;
  }
  public static void inorder(Node root)
  {
    if(root==null)
    {
      return;
    }
      inorder(root.left);
      System.out.print(root.key+" ");
      inorder(root.right);
  }
  public static void preorder(Node root)
  {
    if(root==null)
    {
      return;
    }
      System.out.print(root.key+" ");
      inorder(root.left);
      inorder(root.right);
  }
  public static void postorder(Node root)
  {
    if(root==null)
    {
      return;
    }
      inorder(root.left);
      inorder(root.right);
      System.out.print(root.key+" ");
  }
  public static void main(String args[])
  {
    Node root=null;
    root=insert(root,24);
    root=insert(root,28);
    root=insert(root,30);
    System.out.println("Elements in BST are : 24 28 30 ");
    System.out.print("Inorder : ");
    inorder(root); 
    System.out.println(); 
    System.out.print("Preorder : ");
    preorder(root);
    System.out.println(); 
    System.out.print("Postorder : ");
    postorder(root);
  }
}
 
    
