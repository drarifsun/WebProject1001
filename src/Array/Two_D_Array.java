package Array;

public class Two_D_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//2D Array declaration
		
		
		int [][] web_grid = new int [4][4];
		
		
		//Data input
		
		
		web_grid[0][0] = 10;
		web_grid[0][1] = 20;
		web_grid[0][2] = 30;
		web_grid[0][3] = 40;
		web_grid[1][0] = 50;
		web_grid[1][1] = 60;
		web_grid[1][2] = 70;
		web_grid[1][3] = 80;
		
		for (int i=0;i<4;i++)
		{
			for (int j=0;j<4;j++)
			{
				System.out.print(" "+web_grid[i][j]);
			}
			
				System.out.println();
		}
		
	}

}
