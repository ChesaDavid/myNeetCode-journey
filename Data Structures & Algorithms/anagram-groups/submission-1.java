class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> rez = new ArrayList();
        Map<String,List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] arrChar = str.toCharArray();
            Arrays.sort(arrChar);
            String sortedStrKey = new String(arrChar);

            map.putIfAbsent(sortedStrKey,new ArrayList<>());
            map.get(sortedStrKey).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
