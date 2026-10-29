class Solution {
    public int majorityElement(int[] nums) {
        int cnt;
        int n=nums.length;
        // for(int i=0;i<n;i++){
        //     cnt=0;
        //     for(int j=i;j<n;j++){
        //         if(nums[i]==nums[j]){
        //             cnt++;
        //         }
        //     }
        //     if(cnt>n/2){
        //         return nums[i];
        //     }
        // }
        // return -1;

        int el=nums[0];
        cnt=0;
        for(int i=0;i<n;i++){
            if(cnt == 0){
                el = nums[i];
            }
            if(nums[i] == el){
                cnt++;
            }
            else{
                cnt--;
            }
            
        }
        if(cnt>0){
            return el;
        }
        return -1;
    }
}