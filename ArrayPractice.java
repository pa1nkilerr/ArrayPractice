package inputCalculations;

import java.util.Arrays;

public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][]arr= {
				{34,21,10,45,32}, 
				{23,12,54,43,20},
		};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.println(arr[i][j] + " ");
			}	
		}
		
	}

}
