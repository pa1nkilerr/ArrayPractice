package inputCalculations;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][]matrix= {
				{10,20,30},
				{40,50,60},
		};
	//	System.out.println(matrix[1][1]);
		
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++) {
				System.out.println(matrix[i][j] + " ");
			}
		}
		
	}

}
