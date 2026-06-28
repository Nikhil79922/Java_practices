public class ContestTest {

    public static void main(String [] args){
        Solution s= new Solution();
        SolutionKadnes s1 = new SolutionKadnes();
        int nums[] ={1,-2,3,4,-5};
        int nums2[]={1,2,3,4};
        long ans = s.maxSubarraySum(nums , 2);
        System.out.println("ANswers ===> " + ans);

        long ans2 = s1.maxSubArray(nums);
        System.out.println("ANswers2 ===> " + ans2);
    }

}
//class Solution {
//    public long maxSubarraySum(int[] nums, int k) {
//        long muplicationMax = Long.MIN_VALUE;
//        ;
//        long divisionMax = Long.MIN_VALUE;
//
//        for (int i = 0; i < nums.length; i++) {
//            long start = 0;
//            for (int j = i; j < nums.length; j++) {
//                start += nums[j];
//                if (k > 0) {
//                    muplicationMax = (long) Math.max((start * k), muplicationMax);
//                    if (start >= 0) {
//                        divisionMax = (long) Math.max(Math.floor(start / k), divisionMax);
//                    } else {
//                        divisionMax = (long) Math.max(Math.ceil(start / k), divisionMax);
//                    }
//                } else {
//                    muplicationMax = (long) Math.max(start, muplicationMax);
//                    divisionMax = (long) Math.max(start, divisionMax);
//                }
//            }
//        }
//        return (long) Math.max(muplicationMax, divisionMax);
//    }
//}


class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        long muplicationMax = Long.MIN_VALUE;
        ;
        long divisionMax = Long.MIN_VALUE;
        long start = 0;
        for (int i = 0; i < nums.length; i++) {

            start += nums[i];
            if (k > 0) {
                muplicationMax = (long) Math.max((start * k), muplicationMax);
                if (start >= 0) {
                    divisionMax = (long) Math.max(Math.floor((double) start / k), divisionMax);
                } else {
                    divisionMax = (long) Math.max(Math.ceil((double) start / k), divisionMax);
                }
            } else {
                muplicationMax = (long) Math.max(start, muplicationMax);
                divisionMax = (long) Math.max(start, divisionMax);
            }
            if(start < 0){
                start = 0;
            }
        }

        return (long) Math.max(muplicationMax, divisionMax);
    }
}

class SolutionKadnes {
    public int maxSubArray(int[] nums) {
        int max =Integer.MIN_VALUE;
        int curr = 0;
        for(int n :nums){
            curr += n;
            max = Math.max(curr , max);
            if(curr < 0 ){
                curr = 0;
            }
        }
        return max;
    }
}

class Solution2 {
    public long maxSum(int[] nums, int k, int mul) {
        if(k <= 0 ) return 0;
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        long ans = 0;
        for (int i = 0; i < k; i++) {
            if (mul > 0) {
                ans += (long) nums[i] * mul;
                mul--;
            } else {
                ans += (long) nums[i];
            }
        }
        return ans;
    }
}