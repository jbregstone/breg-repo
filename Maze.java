import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Maze {
    private Square[][] maze;
    int row;
    int col;
   
    
    public Maze(){
	maze=null;
    }
    
    boolean loadMaze(String fname){
		Scanner input=null;
		
		try{
		    input = new Scanner(new File (fname));
		}
		catch(Exception e){
		    System.out.println("No such file " + e.getMessage());
		    return false;
		}
		
		String dimensions = input.nextLine();
		Scanner dims = new Scanner(dimensions);
		String numRows= dims.next();
		String numCols= dims.next();
		int numRow = Integer.parseInt(numRows);
		int numCol = Integer.parseInt(numCols);
		this.maze = new Square [numRow] [numCol];
		this.row =numRow;
		this.col =numCol;
		//System.out.print(numRows+numCols);
		this.maze = new Square[numRow][numCol]; 

		for (int row=0; row < numRow; row++) {
		    String singleRow = input.nextLine();
		    Scanner cols = new Scanner(singleRow);
		    for (int col=0; col < numCol; col++) {
			String value = cols.next();
			int sqrValue = Integer.parseInt(value);
			Square newSquare = new Square(row, col, sqrValue);
		        maze[row][col] = newSquare;
		    }
		}

		return true;
    }
    ArrayList<Square> getNeighbors(Square sq){
	ArrayList<Square> neighbors = new ArrayList<Square>();
	int rw = sq.getRow();
	int cl = sq.getCol();
	if (rw>0 && rw<this.row-1 && cl>0 && cl<this.col-1) {
	    neighbors.add(this.maze[rw+1][cl]);
	    neighbors.add(this.maze[rw] [cl+1]);
	    neighbors.add(this.maze[rw-1] [cl]);
	    neighbors.add(this.maze[rw] [cl-1]);
	    }

	if (rw==0 && cl>0 && cl<this.col-1) {
	    neighbors.add(this.maze[rw] [cl+1]);
	    neighbors.add(this.maze[rw-1] [cl]);
	    neighbors.add(this.maze[rw] [cl-1]);
	    }
	if (rw==this.row && cl>0)
	return neighbors;
	return neighbors;
	
    }

}
