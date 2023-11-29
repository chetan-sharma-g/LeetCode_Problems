import java.util.Arrays;

public class Array_MaxProdDifference {
    public static void main(String[] args) {
        int[] arr ={4,2,5,9,7,4,8};
        System.out.println(maxProductDifference(arr));
    }
    public static int maxProductDifference(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j>0; j--) {
                if(nums[j]<nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
                else break;
            }
        }
        return ((nums[nums.length-1]*nums[nums.length-2])-(nums[0]*nums[1]));

    }
    static void swap(int[] nums , int a,int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
