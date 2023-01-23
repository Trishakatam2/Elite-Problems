class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map <Character , Integer > map = new HashMap<>();
        int start = 0;
        int maxLength = 0;
        for (int i = 0;i < s.length() ; i++){
            char c = s.charAt(i);
            if (map.get(c) != null){
                maxLength = (maxLength < map.size()) ? map.size():maxLength;
                int n = map.get(c);

                for (int j=start;j<n;j++){
                    char d = s.charAt(j);
                    map.remove(d);
                }
                map.put(c,i);
                start = n+1;
                continue;
            }
            else{
                map.put(c,i);
            }
        }
        return (maxLength < map.size()) ? map.size():maxLength;
    }
}