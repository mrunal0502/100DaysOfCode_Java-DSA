// User function Template for Java

class Solution {
    public int TotalPairs(int[] nums, int k) {
        // Code here
        
            HashMap<Integer, Integer> map = new HashMap<>();
            
            for(int num : nums){
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            
            int count = 0;
            
            for (int num : map.keySet()) {
            if (k == 0) {
                if (map.get(num) > 1) count++;
            } else {
                if (map.containsKey(k+num)) count++;
            }
        }
    
            return count;
      
    }
}
