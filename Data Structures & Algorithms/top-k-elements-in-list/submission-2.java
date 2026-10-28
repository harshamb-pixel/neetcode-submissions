class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length<k){
            return new int[]{};
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        ArrayList<Integer> temp = new ArrayList<>(map.keySet());

        // for(Map.Entry<Integer,Integer> entry : map.entrySet()){
        //     int key = entry.getKey();
        //     if(entry.getValue() >= k){
        //         temp.add(key);
        //     }
        // }

        temp.sort((a,b) -> map.get(b) - map.get(a));


        int res[] = new int[k];
        for(int i=0;i<k;i++){
            res[i]=temp.get(i);
        }
        return res;
    }
}
