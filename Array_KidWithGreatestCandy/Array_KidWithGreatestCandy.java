import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_KidWithGreatestCandy {
    public static void main(String[] args) {
        int[] ar = {2,3,5,1,3};
        int exc = 3;
    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> r = new ArrayList<>();
        int max = 0;
        for(int i : candies){
            max = Math.max(max,i);
        }
        for (int a :candies){
            if(a+extraCandies>=max){
                r.add(true);
            }
            else r.add(false);
        }
        return r;
    }
}
