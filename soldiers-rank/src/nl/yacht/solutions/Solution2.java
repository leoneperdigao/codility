package nl.yacht.solutions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution2 {
	
    public static int solution(int[] ranks) {
    	List<Integer> rankList = Arrays.stream(ranks).boxed().collect(Collectors.toList());
     	int soldiers = 0;
     	for(int i =0; i<rankList.size(); i++) {
     		if(rankList.contains(rankList.get(i) + 1)) {
     			soldiers++;
     		}
     	}
     	return soldiers;
    }
}
