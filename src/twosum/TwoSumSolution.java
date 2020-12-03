package twosum;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hq on 20/11/4.
 */
public class TwoSumSolution {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[]{0, 0};
        Map<Integer, Integer> numToReduc = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            int temReduc = target - nums[i];
            if (numToReduc.containsKey(temReduc)) {
                result[0] = numToReduc.get(temReduc);
                result[1] = i;
                break;
            }
            numToReduc.put(nums[i], i);
        }
        return result;
    }
}
