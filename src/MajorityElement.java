import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

        public int majorityElement(int[] nums) {
            Map<Integer, Integer> countMap = new HashMap<>();
            int majorityElement = 0;
            int maxCount = 0;

            for (int num : nums) {
                int count = countMap.getOrDefault(num, 0) + 1;
                countMap.put(num, count);
                if (count > maxCount) {
                    maxCount = count;
                    majorityElement = num;
                }
            }

            return majorityElement;
        }

        public static void main(String[] args) {
            int[] nums = {2, 1, 2, 2, 1, 3, 3};
            MajorityElement elementfinder = new MajorityElement();
            int majority = elementfinder.majorityElement(nums);
            System.out.println("The majority element is: " + majority);
        }
}
