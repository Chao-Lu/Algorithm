class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set  = new HashSet<>();
        int i = 0;
        int j = 0;
        int len = 1;
        int n =s.length();
        if(n==0)
            return 0;
        set.add(s.charAt(0));
        while(i<n-1 && j<n-1){
            j++;
            if(! set.contains(s.charAt(j))){
                set.add(s.charAt(j));
            } else {
                while(set.contains(s.charAt(j))){
                    set.remove(s.charAt(i));
                    i++;
                }
                set.add(s.charAt(j));
            }
            
            len = Math.max(len, (j-i+1));
        }
        return len;
        
    }
}