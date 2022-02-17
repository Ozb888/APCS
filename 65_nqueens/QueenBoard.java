/***
 * class QueenBoard
 * Generates solutions for N-Queens problem.
 * USAGE:
 * 1. Peruse. Transcribe your KtS verbiage into block comments preceding each method where necessary.
 * 2. Implement solver method.
 */

public class QueenBoard
{

  private int[][] _board;

  public QueenBoard( int size )
  {
    _board = new int[size][size];
  }


  /***
   * precondition: board is filled with 0's only.
   * postcondition:
   * If a solution is found, board shows position of N queens,
   * returns true.
   * If no solution, board is filled with 0's,
`   * returns false.
   */
  public boolean solve()
  {
    int row = 0;
    int col = 0;
    while (row < _board.length) {
      if (addQueen(row, col) == false) {
        row ++;
      }
      else {
        addQueen(row, col);
        col ++;
        break;
      }
    }
    if (solveH(col) == false) {
      removeQueen(row, col-1);
      col++;
    }

    return false;
  }


  /**
   *Helper method for solve.
   */
  private boolean solveH( int col )
{
    if (col >= _board.length) {
      return true;
    }
    else {
      for(int row = 0; row < _board.length; row++) {
        if (addQueen(row,col)) {
          addQueen(row, col);
          if (solveH(col + 1)) {
            return true;
          }
          else {
            removeQueen(row, col);
          }
        }
      }
    }
    return false;
  }


  public void printSolution()
  {
    /** Print board, a la toString...
        Except:
        all negs and 0's replaced with underscore
        all 1's replaced with 'Q'
    */
    String[][] boardRep = new String[_board.length][_board.length];
    for(int i = 0; i < _board.length; i++) {
      for(int j = 0; j < _board.length; j++) {
        if( _board[i][j] == 1) {
          boardRep[i][j] = "Q";
        }
        else {
          boardRep[i][j] = "_";
        }
      }
    }

    String ans = "";
    for( int r = 0; r < _board.length; r++ ) {
      for( int c = 0; c < _board.length; c++ ) {
        ans += boardRep[r][c]+"\t";
      }
      ans += "\n";
    }
    System.out.println(ans);
  }



  //================= YE OLDE SEPARATOR =================

  /***
   * decides if a queen addition is possible and alters board as needed 
	to prevent future queen interaction

   * precondition: a row and column coordinate, that exists on the _board

   * postcondition: if queen addition is possible, makes that 
      coordinate a one and all the follwing danger zones -1
	returns true
      if queen addition is not possible, returns false
   */
  private boolean addQueen(int row, int col)
  {
    if(_board[row][col] != 0){
      return false;
    }
    _board[row][col] = 1;
    int offset = 1;
    while(col+offset < _board[row].length){
      _board[row][col+offset]--;
      if(row - offset >= 0){
        _board[row-offset][col+offset]--;
      }
      if(row + offset < _board.length){
        _board[row+offset][col+offset]--;
      }
      offset++;
    }
    return true;
  }


  /***
   * checks if a queen is there and undos board as needed
   * precondition: a row and column coordinate that exists on the _board
   * postcondition:
     if a queen removal is not possible
       returns false.
     if a queen removal is possible, returns that coordiante to a zero and 
     all its danger zones to zero
      returns true
   */
  private boolean removeQueen(int row, int col){
    if ( _board[row][col] != 1 ) {
      return false;
    }
    _board[row][col] = 0;
    int offset = 1;

    while( col+offset < _board[row].length ) {
      _board[row][col+offset]++;
      if( row - offset >= 0 ) {
        _board[row-offset][col+offset]++;
      }
      if( row + offset < _board.length ) {
        _board[row+offset][col+offset]++;
      }
      offset++;
    }
    return true;
  }


  /***
   * prints the board
   * a _board
   * postcondition: a printing of the board and points at corresponding
   */
  public String  toString()
  {
    String ans = "";
    for( int r = 0; r < _board.length; r++ ) {
      for( int c = 0; c < _board[0].length; c++ ) {
        ans += _board[r][c]+"\t";
      }
      ans += "\n";
    }
    return ans;
  }


  //main method for testing...
  public static void main( String[] args )
  {

    QueenBoard b = new QueenBoard(5);
    System.out.println(b);
    /** should be...
       0	0	0	0	0
       0	0	0	0	0
       0	0	0	0	0
       0	0	0	0	0
       0	0	0	0	0
    */

    b.addQueen(3,0);
    b.addQueen(0,1);
    System.out.println(b);
    /** should be...
       0	1	-1	-2	-1
       0	0	-2	0	0
       0	-1	0	-1	0
       1	-1	-1	-1	-2
       0	-1	0	0	0
    */

    b.removeQueen(3,0);
    System.out.println(b);
    /** should be...
       0	1	-1	-1	-1
       0	0	-1	0	0
       0	0	0	-1	0
       0	0	0	0	-1
       0	0	0	0	 0
   */

  QueenBoard c = new  QueenBoard(8);
  c.solve();
  c.printSolution();



 QueenBoard d = new QueenBoard(5);
 d.solve();
 d.printSolution();
  }

}//end class
