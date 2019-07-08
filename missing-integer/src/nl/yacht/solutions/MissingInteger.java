package nl.yacht.solutions;

import java.util.HashSet;
import java.util.Set;

public class MissingInteger {

	 public int solution(int[] A) {
	       Set<Integer> set = new HashSet<>();
	       int size = A.length;
	        
	        for(int el : A){
	            if(el > 0){
	                set.add(el);
	            }
	        }
	        for(int i=1; i<= size +1; i++){
	            if(!set.contains(i)){
	                return i;
	            }
	        }
	        return size + 1;
	    }
}
