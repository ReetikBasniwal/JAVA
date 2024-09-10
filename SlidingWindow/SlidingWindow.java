package SlidingWindow;
import java.util.*;

public class SlidingWindow {

    public static int numberOfSubstrings(String s) {
        int count = 0;
        int len = s.length();
        int hash[] = new int[3];
        hash[0] = -1;
        hash[1] = -1;
        hash[2] = -1;
        for(int i = 0; i < len; i++){
            hash[s.charAt(i) - 'a'] = i;
            if(hash[0] != -1 && hash[1] != -1 && hash[2] != -1){
                count += Math.min(hash[0], Math.min(hash[1], hash[2])) + 1;
            }
        }
        return count;
    }

    private static int numberOfSubarraysHelper(int[] nums, int k) {
        if(k < 0) return 0;

        int l = 0, r = 0;
        int ans = 0;
        int len = nums.length;
        int count = 0;
        while(r < len){

            if(nums[r]%2 != 0) count++;
            System.out.println(nums[r]%2 +  " mode ");
            while (count > k) {
                if(nums[l]%2 != 0) count--;
                l++;
            }
            ans += (r - l + 1);
            r++;
        }
        System.out.println(ans + " ans ");
        return ans;
    }

    public static int numberOfSubarrays(int[] nums, int k) {
        return numberOfSubarraysHelper(nums, k) - numberOfSubarraysHelper(nums, k -1);
    }
    
}
