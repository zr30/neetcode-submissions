class Solution {
    public int search(int[] nums, int target) {
    //find cut and then perform binary search? 
    //find cut 
    int left=0;
    int right=nums.length-1;
    while(left<right){
        int mid=(left+right)/2;
        
        if(nums[mid]>nums[right]){
            //minimum is to the right
            left=mid+1;
        }else{
            right=mid;
        }
    }
    //they should converge so both left and right represent min index
    int minIndex=right;

    //now that I have min index, I can perform binary search on both subsets to see where our target is if it exists
    //left subset
    left=0;
    right=minIndex;
    int targetIndex=-1;
    while(left<=right){
        int mid=(left+right)/2;

        if(nums[mid]==target){
            targetIndex=mid;
            return targetIndex;
        }else if(target>nums[mid]){
            left=mid+1;
        }else{
            right=mid-1;
        }

    }
    //right subset
    left=minIndex;
    right=nums.length-1;
    while(left<=right){
        int mid=(left+right)/2;

        if(nums[mid]==target){
            targetIndex=mid;
            return targetIndex;
        }else if(target>nums[mid]){
            left=mid+1;
        }else{
            right=mid-1;
        }

    }
    return -1;

    }
}
