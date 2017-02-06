package Arrays;

import java.util.Scanner;
//4 4 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
public class spiralPrint2 {
	public static int[][] spiralPrint(){
		Scanner sc =new Scanner(System.in);
		int rows=sc.nextInt();
		int cols=sc.nextInt();
		
		int [] []arr =new int[rows][cols];
		int left =0;
		int right = arr[0].length-1,counter=0;
		int top = 0,bottom = arr[0].length-1;
		int size = arr[0].length*arr[0].length;
		
		while(counter<size){
			for(int i =left ;i<=right;i++){
				arr[top][i]=++counter;
				
				
			}
			top++;
			for(int i= top;i<=bottom;i++){
				arr[i][right]=++counter;
				
			}
			right--;
			for(int i= right;i>=left;i--){
				arr[bottom][i]=++counter;
				
			}
			bottom--;
			for(int i=bottom;i>=top;i--){
				arr[i][left]=++counter;
				
			}
			left++;
		}
		
		return arr;
	}
	public static void printArray(int [][] arr){
		int n=arr.length;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
	
	public static void main(String[] args){
		
		
		int [][]arr=spiralPrint();
		printArray(arr);
		
		
	}


}
