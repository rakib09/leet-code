package com.extremecoder.algorithm;

public class FirstBadVersion_278 {
    public static int firstBadVersion(int n) {
        int low = 1,high = n,mid;
        int ans = -1;
        while(low<=high) {
            mid = low + ((high - low)/2 );
            if(isBadVersion(mid)) {
                high=mid-1;
                ans=mid;
            }
            else {
                low = mid + 1;
            }
        }
        return ans;
    }
    static boolean isBadVersion(int version) {
        if(version == 4) return true;
        else return false;
    }

    public static void main(String[] args) {
        System.out.println(firstBadVersion(5));
    }
}
