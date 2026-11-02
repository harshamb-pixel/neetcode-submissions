class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=  nums.length;
        int cnt=0;
        // for(int i=0;i<n;i++){
        //     int sum =0;
        //     for(int j=i;j<n;j++){
        //         sum +=nums[j];
        //         if(sum == k){
        //             cnt++;
        //         }
        //     }
        // }
        // return cnt;

        HashMap<Integer,Integer> map = new HashMap<>();

        map.put(0,1);
        int curSum =0;
        for(int num : nums){
            curSum += num;
            
            int complement = curSum - k;
            if(map.containsKey(complement)){
                cnt +=map.getOrDefault(complement, 0);
            }
            map.put(curSum,map.getOrDefault(curSum,0)+1);
        }
        return cnt;
    }

}