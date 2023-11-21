import java.util.Arrays;

public class Array_checkSum {
    public static void main(String[] args) {
        int[] nums = {1,2,6,4};
        System.out.print(Arrays.toString(twoSum(nums,10)));


    }
    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0;i<nums.length ; i++){
            for (int j = i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{nums[i],nums[j]};
                }

            }
        }
        return new int[]{};
    }
}
