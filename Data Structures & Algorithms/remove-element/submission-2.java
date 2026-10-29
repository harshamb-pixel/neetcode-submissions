class Solution {
    public int removeElement(int[] nums, int val) {
        int n=  nums.length;
        int i=0;
        int j=0;
       
        // int[] temp =new int[n];
        // for(i=0;i<n;i++){
        //     if(nums[i]!=val){
        //         temp[j++]=nums[i];
        //     }
        // }
        // for(i=0;i<j;i++){
        //     nums[i]=temp[i];
        // }

        for(j=0;j<n;j++){
            if(nums[j]!=val){
                nums[i]=nums[j];
                i++;
            }
        }
    return i;
    }
}