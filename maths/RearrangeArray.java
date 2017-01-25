/**
 *************************************************************************
 * Description: 
 * 
 * Rearrange a given array so that Arr[i] becomes Arr[Arr[i]] with O(1) extra space. 
 * 
 * Example: array = {1, 0} after rearrange array = {0, 1} 
 * 
 * Lets say N = size of the array. Then, following holds true : 
 * All elements in the array are in the range [0, N-1] 
 * N * N does not overflow for a signed integer
 *
 *************************************************************************
 */
package maths;

import java.util.ArrayList;

public class RearrangeArray {
	public static void arrange(ArrayList<Integer> a) {
		int n= a.size();
	    for(int i=0;i<n;i++){
	    	int num =a.get(i)+(a.get(a.get(i))%n)*n;
	    	a.set(i,num);
	    }
	    for (int i = 0; i < n; i++) {
            a.set(i, a.get(i) / n);
        }
        
	}
	public static void main(String args[]){
		//sample input
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(3);
		arr.add(2);
		arr.add(0);
		arr.add(1);
		arrange(arr);
		System.out.println(arr);
	}

}
