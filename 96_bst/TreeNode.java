/**
 * class TreeNode
 * SKELETON
 * Implements a node for use in a binary tree.
 * Only holds int cargo.
 */

public class TreeNode
{

  //instance variables / attributes of a TreeNode:
  int _cargo;        //this node's data
  TreeNode _lt, _rt; //pointers to left, right subtrees


  /**
   * default constructor
   * Construct a tree node with specified value,
   * with null left and right subtrees.
   */
  TreeNode( int initValue )
  {
    _cargo = initValue;
    _lt = null;
    _rt = null;
  }


  /**
   * overloaded constructor
   * Construct tree node w specified value, left, and right subtrees.
   */
  TreeNode( int initValue, TreeNode initLeft, TreeNode initRight )
  {
    _cargo = initValue;
    _lt = initLeft;
    _rt = initRight;
  }


  /**
   * Returns the left subtree of this node.
   */
  TreeNode getLeft()
  {
    return _lt;
  }


  /**
   * Returns the right subtree of this node.
   */
  TreeNode getRight()
  {
    return _rt;
  }


  /**
   * Returns the value stored in this tree node.
   */
  int getValue()
  {
    return _cargo;
  }


  /**
   * Sets the value of the left subtree of this node.
   */
  void setLeft( TreeNode theNewLeft )
  {
    _lt = theNewLeft;
  }


  /**
   * Sets the value of the right subtree of this node.
   */
  void setRight( TreeNode theNewRight )
  {
    _rt = theNewRight;
  }


  /**
   * Sets the value of this tree node.
   */
  void setValue( int theNewValue )
  {
    _cargo = theNewValue;
  }

  TreeNode search( int target )
    {
    	if (this.getValue() > target) {
         return this.getLeft().search(target);
      }
      else if (this.getValue() < target) {
        return this.getRight().search(target);
      } else {
        return this;
      }
    }

    public int height(int c)
    {
      int a = 0;
      int b = 0;
      if (this.getLeft() != null) {
         a = this.getLeft().height(c + 1);

      }
      if (this.getRight() != null) {
         b = this.getRight().height(c + 1);
      }
      if (this.getLeft() == null && this.getRight() == null) {
        return c;
      }
      if (b > a) {
        return b;
      }
      return a;
    }


    /*****************************************************
     * int numLeaves()
     * returns number of leaves in tree
     *****************************************************/
    public int numLeaves()
    {
      int i = 1;

      if (this.getLeft() != null) {
        i += this.getLeft().numLeaves();

      }
      if (this.getRight() != null) {
        i += this.getRight().numLeaves();

      }
      return i;

    }
}//end class
