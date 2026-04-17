// User function Template for Java

class Solution {

    int countPairs(int arr[], int target) {
        // Complete the function
        
        int n = arr.length;
        int count=0;
        
        // for(int i=0; i<n-1; i++){
        //     for(int j=i+1; j<n; j++){
        //         if(arr[i]+arr[j]==target) count++;
        //     }
        // }
        
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        
        for(int no : arr){
            int diff = target-no;
            
            if(map.containsKey(diff)){
                count+= map.get(diff);
            }
            
            map.put(no, map.getOrDefault(no,0)+1);
        }
        
        
        
         return count;
        
        
    }
}
