class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        int n = strs.length;

        for(String st : strs){
            char[] original =  st.toCharArray();
            Arrays.sort(original);

            String key = new String(original);

            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(st);
        }

        List<List<String>> result = new ArrayList<>();

        for(List<String> group : map.values()){
            result.add(group);
        }
        return result;
        
    }
}
