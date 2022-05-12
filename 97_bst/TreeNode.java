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

    public TreeNode findPar(int val) {
      if (this.getLeft() != null) {
        if (this.getLeft().getValue() == val) {
          return this;
        }
        if (this.getLeft().getValue() > val) {
          return this.getLeft().findPar(val);
        }
      }
      if (this.getRight() != null) {
        if (this.getRight().getValue() == val) {
          return this;
        }

        if (this.getRight().getValue() < val) {
          return this.getRight().findPar(val);
        }
      }


      return null;
    }


    public void remove(int val) {
      if (this.getValue() > val) {
        if (this.getLeft().getLeft() == null && this.getLeft().getRight() == null) {
          this.setLeft(null);
        } else if (this.getLeft().getLeft() == null || this.getLeft().getRight() == null) {
          if (this.getLeft().getLeft() == null) {
            this.setLeft(this.getLeft().getRight());
          } else {
            this.setLeft(this.getLeft().getLeft());
          }
        } else {
          TreeNode temp = this.getLeft();
          if (temp.getLeft().getRight() != null) {
            temp = temp.getLeft();
            while(temp.getRight().getRight() != null) {
              temp = temp.getRight();
            }
            this.getLeft().setValue(temp.getRight().getValue());
            temp.remove(temp.getRight().getValue());

          }
          else {
            temp.getLeft().setRight(temp.getRight());
            this.setLeft(temp.getLeft());
          }

        }
      } else {
        if (this.getRight().getLeft() == null && this.getRight().getRight() == null) {
          this.setRight(null);
        } else if (this.getRight().getLeft() == null || this.getRight().getRight() == null) {
          if (this.getRight().getLeft() == null) {
            this.setRight(this.getRight().getRight());
          } else {
            this.setRight(this.getRight().getLeft());
          }
        } else {
          TreeNode temp = this.getRight();
          if (temp.getRight().getLeft() != null) {
            temp = temp.getRight();
            while(temp.getLeft().getLeft() != null) {
              temp = temp.getRight();
            }
            this.getRight().setValue(temp.getLeft().getValue());
            temp.remove(temp.getLeft().getValue());

          }
          else {
            temp.getLeft().setRight(temp.getRight());
            this.setRight(temp.getLeft());
          }
        }
      }

    }
}//end class
