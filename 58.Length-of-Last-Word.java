class Solution {
// https://leetcode.com/submissions/detail/1250519721/
    public int lengthOfLastWord(String s) {
        int firstNonSpace = -1;
        int firstSpaceChar = -1;
        for(int i=s.length()-1; i>=0;i--) {
            if(firstNonSpace == -1 && s.charAt(i)!=' ') {
                firstNonSpace = i;
                
            }
            if(firstNonSpace !=-1 && s.charAt(i)==' ') {
                firstSpaceChar = i;
                break;
            }
        }
        
        return (firstNonSpace - firstSpaceChar);
        
        
    }
}
