public class Array_MaxValue {
    public static void main(String[] args) {
        int[] arr = {1,23,50,8,330,4};
        System.out.println(maxValue(arr,1,5));
    }
    static int maxValue(int[] arr, int a, int b){
        int max = arr[a];
        while (a<b){
            if(arr[a+1]>max){
                max = arr[a+1];
            }
            a++;
        }
        return max;
    }
}
