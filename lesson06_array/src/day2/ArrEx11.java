package day2;

public class ArrEx11 {
	public static void main(String[] args) {
		int[][][] arrInt = new int[3][3][3];
		
		int value = 0;
		for(int i =0; i <arrInt.length; i++) {
			for(int j=0; j<arrInt.length;j++) {
				for(int k =0; k<arrInt.length;k++) {
					arrInt[i][j][k] = value++;
					
				}
			}
		}
		
		
		
	
		for(int i =0; i <arrInt.length; i++) {
			for(int j=0; j<arrInt.length;j++) {
				for(int k =0; k<arrInt.length;k++) {
					System.out.printf("%4d",arrInt[i][j][k]);
				}
				System.out.println();
			}
		}
		
		
		for(int[][] arr1 : arrInt) {
			for(int[] num : arr1) {
				for(int num1 : num) {
					System.out.printf( "%4d" , num1);
				}
				System.out.println();
			}
			
		}
		
		
	
	}

}
