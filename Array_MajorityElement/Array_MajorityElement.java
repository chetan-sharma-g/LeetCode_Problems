import java.util.Arrays;

public class Array_MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));;
    }
//    public static int majorityElement(int[] nums) {
//        int max = 0;
//        int count = 0;
//        int num = 0;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i; j < nums.length; j++) {
//                if (nums[i]==nums[j]){
//                    count++;
//                }
//            }
//            if(count>max){
//                num = nums[i];
//                max=count;
//            }
//            count = 0;
//        }
//        return num;
//    }
    static int majorityElement(int[] nums ){
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
    }
}
