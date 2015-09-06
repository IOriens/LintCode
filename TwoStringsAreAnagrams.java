class Solution {
    /**
     * @param s: The first string
     * @param b: The second string
     * @return true or false
     */
    public boolean anagram(String s, String t) {
        // write your code here
        int a[]=new int[256];
        int b[]=new int[256];
        for(int i=0;i<s.length();i++){
            a[s.charAt(i)]++;
        }
        for(int i=0;i<t.length();i++){
            b[t.charAt(i)]++;
        }
        for(int i=0;i<256;i++){
            if(a[i]!=b[i])
                return false;
        }
        return true;
    }
};
