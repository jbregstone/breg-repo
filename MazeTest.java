import static org.junit.Assert.fail;

import org.junit.Test;

import jdk.nashorn.internal.ir.annotations.Ignore;

public class MazeTest {

    @Ignore
    public void test() {
	fail("Not yet implemented");
    }
    @Test
    public void loadMazeTest() {
	Maze testmaze = new Maze();
	testmaze.loadMaze("maze-1");
	for (int i=0; i<testmaze.row; i++) {
	    for (int j=0; j<testmaze.col;j++) {
		System.out.print(testmaze.maze[i][j].getType());
	
	    }
	    System.out.println();
	}
	System.out.println(testmaze.row);
	System.out.println(testmaze.col);
    }

}