package nl.yacht.solutions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution1 {
	
    public static int solution(int[] A) {
    	int oppositPairs = 0;
    	List<Integer> integersList = Arrays.stream(A).boxed().collect(Collectors.toList());
    	int listSize = integersList.size();
    	if(listSize % 2 == 0) {
    		if(integersList.contains(1) && integersList.contains(6)) {
    			oppositPairs++;
    		}
    		if(integersList.contains(2) && integersList.contains(5)) {
    			oppositPairs++;
    		}
    		if(integersList.contains(3) && integersList.contains(4)) {
    			oppositPairs++;
    		}
    		if(oppositPairs == listSize) {
    			return listSize;
    		}
    	}
    	return A.length - 1;
    }
}
