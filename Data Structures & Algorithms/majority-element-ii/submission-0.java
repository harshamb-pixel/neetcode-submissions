class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int n=nums.length;
        for(int num : nums){
            map.put(num,map.getOrDefault(num, 0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>n/3){

                list.add(entry.getKey());
            }
        }
        return list;
    }
}