package Arrays;
import java.util.*;
public class Max_non_negative_subarray {
	  public static int maxArr(ArrayList<Integer> A) {
	        int max=0,current=0;
	        for(int i=0;i<A.size();i++)
	        {
	            for(int j=0;j<A.size();j++){
	                current=f(i,j,A);
	                if(current>max){
	                    max=current;
	                }
	            }
	        }
	        return max;
	    }
	    public static int f(int i,int j,ArrayList<Integer> A){
	        return Math.abs(A.get(i)-A.get(j))+Math.abs(i-j);
	    }
	    public static void main(String[] args){
	        ArrayList<Integer> a = new ArrayList<Integer>();
	        a.add(2);
	        a.add(2);
	        a.add(2);
	        List<Integer> b = new ArrayList<Integer>();
	        b.add(4);
	        b.add(5);
	        b.add(6);
	        List<Integer> c = new ArrayList<Integer>();
	        c.add(7);
	        c.add(8);
	        c.add(9);
	        System.out.println(maxArr(a));
	    }
	
}
