class FirstLastIndex {
    public int[] searchRange(int[] nums, int target) {
        boolean forStart = true;
        int start = binarySearch(nums, target, forStart);
        if(start==-1){
            return new int[]{-1,-1};
        }
        int end = binarySearch(nums, target, !forStart);
        return new int[]{start,end};
    }

    public int binarySearch(int [] nums, int target, boolean forStart){
        int start = 0;
        int n = nums.length;
        int end = n-1;
        int ans = -1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]==target){
                ans = mid;
                if(forStart){
                end = mid-1;
                }else{
                   start = mid+1;
                }
            }
            else if(nums[mid]<target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;
    }
}