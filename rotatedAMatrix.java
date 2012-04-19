//做的很辛苦，要继续努力啊！！


public class rotatedAMatrix {
	
	public static void rotate (int m[][], int length)
	{
		for(int i = 0; i < length/2; i++)
		{
			for(int j = i; j < (length - i) - 1; j++)//j = i, (length-i) means it goes inward layer by layer
			{
				//(x,y) => (-y, x) => (-x, -y) => (y,-x)
				//consider the matrix is not centered, need to add the offset (length-1) 
			
				int top = m[i][j];
				m[i][j] = m[length-j-1][i];
				m[length-j-1][i] = m[length-i-1][length-j-1];
				m[length-i-1][length-j-1] = m[j][length-i-1];
				m[j][length-i-1] = top;
			}
			
		}
	}


	public static void main(String[] args) {
		int[][] test = {
						{1,2,3,4},
						{5,6,7,8},
						{9,10,11,12},
						{13,14,15,16},
						};
		
		for(int i = 0; i < 4; i++)
		{
			for(int j = 0; j < 4; j++)
			{
				System.out.print(test[i][j]+ " ");
			}
			System.out.println("");
		}
		
		rotatedAMatrix.rotate(test, 4);
		
		for(int i = 0; i < 4; i++)
		{
			for(int j = 0; j < 4; j++)
			{
				System.out.print(test[i][j]+ " ");
			}
			System.out.println("");
		}

	}

}
