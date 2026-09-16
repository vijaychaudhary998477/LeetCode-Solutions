
/*
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            int digits = 0;
            int temp = num;
            while (temp > 0) {
                temp /= 10;
                digits++;
            }
            if (digits % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
*/
//============================================== OR =================================
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
    for(int i=0;i<nums.length;i++){
        int digits=(int)Math.log10(nums[i])+1;
        if(digits%2==0) count++;
    }
    return count;
    }
}