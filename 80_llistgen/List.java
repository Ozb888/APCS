/***
 * interface List
 * subset of actual Java List interface
 * Specifies actions a List must be able to perform.
 *
 * If placed in current working dir, will be consulted instead of
 *  built-in Java library interface.
 *
 * new in version 2.0: 
 * REMOVE-AT-INDEX
 * ADD-AT-INDEX
 **/

public interface List<o>
{
  //add node to list, containing input Object as its data
  public boolean add( o x );

  //insert at specified index
  public void add( int index, o newVal );

  //remove node from list, return its data
  public o remove( int index );

  //return data in element at position i
  public o get( int i );

  //overwrite data in element at position i
  public o set( int i, o x );

  //return length of list
  public int size();

}//end interface