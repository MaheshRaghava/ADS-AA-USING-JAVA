
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
  public static void main(String args[])
  {
    Node root=null;
    root=insert(root,10);
    root=insert(root,20);
    root=insert(root,30);
    System.out.println("Elements in BST are : 10 20 30 ");
  }
}
 
    

