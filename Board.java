class Board
{
  private int live = 1;
  private int dead = 0;
  private int size = 5;
  private int[][] array = new int[size][size];

  public Board(int[][] initial)
  {
    for(int i=0; i<size; i++)
    {
      for(int j=0; j<size; j++)
      {
        array[i][j] = initial[i][j];
      }
    }
  }
 
  public void printBoard()
  {
    for(int i=0; i<size; i++)
    {
      for(int j=0; j<size; j++)
      {
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }
  }

  public void next()
  {
    computeLiveBoard();
    computeDeadBoard();
    mergeBoards();
  }

  public void computeLiveBoard()
  {

  }

  public void computeDeadBoard()
  {
    
  }

  public void mergeBoards()
  {
    
  }
}

