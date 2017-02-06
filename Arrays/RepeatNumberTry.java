package Arrays;
import java.util.List;
import java.util.ArrayList;
public class RepeatNumberTry {
	
		// DO NOT MODIFY THE LIST
		public static ArrayList<Integer> repeatedNumber(final List<Integer> a) {
		    ArrayList<Integer> count = new ArrayList<Integer>();
		    for(int i=0;i<a.size();i++)
		    {
		        Integer value = count.get(a.get(i)); // get value
	            value = value + 1; // increment value
		        count.set(a.get(i),value);
		       
		        
		    }
		    ArrayList<Integer> result = new ArrayList<Integer>();
		    for(int i=0;i<a.size();i++){
		         if(count.get(i)==2){
		            result.add(a.get(i));
		        }
		        else if(count.get(i)==0){
		            result.add(a.get(i));
		        }
		    }
		    return result;
		    
		}
		 public static void main(String[] args){
		    	List <Integer> A = new ArrayList<>();
		    	//3 1 2 5 3
		    	A.add(0);
		    	A.add(1);
		    	A.add(1);
		    	A.add(2);
		    	List<Integer> a=repeatedNumber(A);
		    	for(int i=0;i<a.size();i++){
		    		System.out.println(A.get(i));
		    	}
		    	
		    	
		    }
	


}
