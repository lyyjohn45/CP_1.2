//比较轻松，留意这种markrow和col的方法！
//Given an image represented by an NxN matrix, where each pixel in the image is 4 
//bytes, write a method to rotate the image by 90 degrees  Can you do this in place?

public class fillTheBlank {
	
	
	public static void fillTheBlankMatirx (int[][] m, int height, int width)
	{
		boolean rowCheck[] = new boolean[height];
		boolean colCheck[] = new boolean[width];
		
		for(int i = 0; i < rowCheck.length; ++i)
		{
			rowCheck[i] = false;
		}
		
		for(int i = 0; i < colCheck.length; ++i)
		{
			colCheck[i] = false;
		}
		
		for(int i = 0; i < height; ++i)
		{
			for(int j = 0; j < width; ++j)
			{
				if(m[i][j] == 0)
				{
					rowCheck[i] = true ;
					colCheck[j] = true;
				}
			}
		}
		
		for (int i = 0; i < height; i++)
		{	
			if(rowCheck[i] == true)
			{
				for(int j = 0; j < width ; j++ )
				{
					m[i][j] = 0;
				}
			}
		}
		
		for (int i = 0; i < width; i++)
		{	
			if(colCheck[i] == true)
			{
				for(int j = 0; j < height ; j++ )
				{
					m[j][i] = 0;
				}
			}
		}
		
	}


	public static void main(String[] args) {
		int[][] test = {
						{1,2,3,4},
						{0,5,2,6},
						{8,4,1,0},
					   };
		
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 4; j++)
			{
				System.out.print(test[i][j]+ " ");
			}
			System.out.println("");
		}		

		System.out.println("");
		fillTheBlank.fillTheBlankMatirx(test, 3, 4);
		
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 4; j++)
			{
				System.out.print(test[i][j]+ " ");
			}
			System.out.println("");
		}
		
	}

}
