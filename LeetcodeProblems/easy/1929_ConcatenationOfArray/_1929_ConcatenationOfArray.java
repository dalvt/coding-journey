import java.util.ArrayList;

public class _1929_ConcatenationOfArray {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(1);
        nums.add(2);

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.size(); i++) {
            ans.add(nums.get(i));
        }
        
        for (int i = 0; i < nums.size(); i++) {
            ans.add(nums.get(i));
        }
        System.out.println(ans);
    }
}

