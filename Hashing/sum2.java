package Hashing;
/*Given an array of integers, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 < index2. Please note that your returned answers (both index1 and index2 ) are not zero-based. 
Put both these numbers in order in an array and return the array from your function ( Looking at the function signature will make things clearer ). Note that, if no pair exists, return empty list.

If multiple solutions exist, output the one where index2 is minimum. If there are multiple solutions with the minimum index2, choose the one with minimum index1 out of them.

Input: [2, 7, 11, 15], target=9
Output: index1 = 1, index2 = 2*/
import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class sum2 {
	public static ArrayList<Integer> twoSum(final ArrayList<Integer> numbers, int b) {
	    HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
	    ArrayList <Integer> toReturn = new ArrayList <Integer>();
        for(int i = 0; i < numbers.size(); i++){

            Integer diff = (Integer)(b - numbers.get(i));
            if(hash.containsKey(diff)){
                toReturn.add(hash.get(diff)+1);
                toReturn.add(i+1);
                return toReturn;
            }
            if(!hash.containsKey(numbers.get(i))){
            	hash.put(numbers.get(i), i);
            }
        }
        
        return toReturn;
	}
	
}
