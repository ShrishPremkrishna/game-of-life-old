import java.util.Scanner;

class Main
{
  public static void main (String args[]){
    int[][] initial = {{0, 0, 0, 0, 0}, 
                        {0, 0, 0, 0, 0}, 
                        {0, 1, 1, 1, 0}, 
                        {0, 0, 0, 0, 0}, 
                        {0, 0, 0, 0, 0}};
    Board myBoard = new Board(initial);
    myBoard.printBoard();
    Scanner input = new Scanner(System.in);

    while(true){
      System.out.println("Continue? [y]es or [n]o");
      String userContinue = input.nextLine();
      if(userContinue.equals("y"))
      {
        myBoard.next();
        myBoard.printBoard();
      }
      else
      {
        System.out.println("Ending Shrish's Game Of Life, \nThanks for playing!");
        break;
      }
    }
  }
}
  



