import java.util.ArrayList;
import java.util.Arrays;

public class Array_Intersection {
    public static void main(String[] args) {
        int[] arr1 = {4,9,5};
        int[] arr2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(arr1,arr2)));;
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans = new ArrayList<>();
        int num1len = nums1.length;
        int num2len = nums2.length;
        for (int i = 0; i < num1len; i++) {
            int target = nums1[i];
            for (int j = 0; j < num2len; j++) {
                if(target==nums2[j] && !(ans.contains(target))){
                    ans.add(target);
                }
            }
        }
        int[] arr = new int[ans.size()];

        for (int i = 0; i < ans.size(); i++) {
            arr[i] = ans.get(i);
        }
        return arr;


    }
}
