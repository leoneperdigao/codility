package nl.yacht.solutions;

public class Solution3 {
	
    public static int solution(int n) {
    	int[] d = new int[30];
        int l = 0;
        int p;
        while (n > 0) {
            d[l] = n % 2;
            n /= 2;
            l++;
        }
        for(p = l/2; p >0; p--){
            int i;
            boolean ok = true;
            for(i = 0; i < (l - l/2); i++){
                if (d[i] != d[i + p]) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                return p;
            }
        }
        return -1;
    }
}
