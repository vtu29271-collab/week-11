class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        Map<Integer, Integer> first = new HashMap<>();
        Map<Integer, Integer> last = new HashMap<>();
        int maxDegree = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            first.putIfAbsent(num, i);
            last.put(num, i);
            count.put(num, count.getOrDefault(num, 0) + 1);
            maxDegree = Math.max(maxDegree, count.get(num));
        }
        int minLength = nums.length;
        for (int num : count.keySet()) {
            if (count.get(num) == maxDegree) {
                int length = last.get(num) - first.get(num) + 1;
                minLength = Math.min(minLength, length);
            }
        }
        return minLength;
    }
}