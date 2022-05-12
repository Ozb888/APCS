/**
 * class BST
 * v1:partial
 * SKELETON
 * Implementation of the BINARY SEARCH TREE abstract data type (ADT)
 *
 * A BST maintains the invariant that, for any node N with value V,
 * L<V && V<R, where L and R are node values in N's left and right
 * subtrees, respectively.
 * (Any value in a node's left subtree must be less than its value,
 *  and any value in its right subtree must be greater.)
 *
 * This BST implementation only holds ints (its nodes have int cargo)
 */

public class BST
{

  //instance variables / attributes of a BST:
  TreeNode _root;

  /**
   * default constructor
   */
  public BST()
  {

  }


  /**
   * void insert( int )
   * Adds a new data element to tree.
   */
  public void insert( int newVal )
  {

    TreeNode temp = _root;
    TreeNode newNode = new TreeNode( newVal );

  if( _root == null){
    _root = newNode;
  }


  else{
    while (true) {
      if (newVal < temp.getValue()) {
        if (temp.getLeft() == null) {
          temp.setLeft(newNode);
          return;
        }
        else {
          temp = temp.getLeft();
        }
      }
      else {
        if (temp.getRight() == null) {
          temp.setRight(newNode);
          return;
        }
        else {
          temp = temp.getRight();
        }
     }
   }
  }
  }




  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  //~~~~~~~~~~~~~v~~TRAVERSALS~~v~~~~~~~~~~~~~~~~~~~~~

  // each traversal should simply print to standard out
  // the nodes visited, in order

  //process root, recurse left, recurse right
  public void preOrderTrav()
  {
    preOrderTrav( _root );
  }
  public void preOrderTrav( TreeNode currNode )
  {
   if (currNode != null) {
    System.out.print(currNode.getValue());
      preOrderTrav(currNode.getLeft());
      preOrderTrav(currNode.getRight());
    }
  }

  //recurse left, process root, recurse right
  public void inOrderTrav()
  {
    inOrderTrav(_root);
  }
  public void inOrderTrav( TreeNode currNode )
  {
    if (currNode != null) {
      inOrderTrav(currNode.getLeft());
      System.out.print(currNode.getValue());
      inOrderTrav(currNode.getRight());
    }
  }
  //recurse left, recurse right, process root
  public void postOrderTrav()
  {
    postOrderTrav(_root);
  }
  public void postOrderTrav( TreeNode currNode )
  {
    if(currNode != null){
      postOrderTrav(currNode.getLeft());
      postOrderTrav(currNode.getRight());
      System.out.print(currNode.getValue());
   }
  }


    /*****************************************************
     * TreeNode search(int)
     * returns pointer to node containing target,
     * or null if target not found
     *****************************************************/
    TreeNode search( int target )
    {
      return _root.search(target);
    }


    /*****************************************************
     * int height()
     * returns height of this tree (length of longest leaf-to-root path)
     * eg: a 1-node tree has height 1
     *****************************************************/
    public int height()
    {
      return _root.height(1);
    }


    /*****************************************************
     * int numLeaves()
     * returns number of leaves in tree
     *****************************************************/
    public int numLeaves()
    {
      return _root.numLeaves();
    }

    public void remove(int val) {
      TreeNode ParRem = _root.findPar(val);
      ParRem.remove(val);
    }

  //main method for testing
  public static void main( String[] args )
  {

      BST arbol = new BST();

      //PROTIP: sketch state of tree after each insertion
      //        ...BEFORE executing these.
      arbol.insert(15);
      arbol.insert(8);
      arbol.insert(23);
      arbol.insert(4);
      arbol.insert(12);
      arbol.insert(19);
      arbol.insert(27);
      arbol.insert(2);
      arbol.insert(6);
      arbol.insert(10);
      arbol.insert(14);
      arbol.insert(17);
      arbol.insert(21);
      arbol.insert(25);
      arbol.insert(29);
      arbol.insert(31);
      arbol.insert(1);
      arbol.insert(3);
      arbol.insert(5);
      arbol.insert(7);
      arbol.insert(9);
      arbol.insert(11);
      arbol.insert(13);
      arbol.insert(30);
      arbol.insert(16);
      arbol.insert(18);
      arbol.insert(20);
      arbol.insert(22);
      arbol.insert(24);
      arbol.insert(26);
      arbol.insert(28);
      arbol.remove(8);
      arbol.inOrderTrav();
  //      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/ //
  }

}//end class
