class Solution {
    public int numberOfSubstrings(String s) {
        int aTot = 0, bTot = 0, cTot = 0;
        int res = 0;
        int i = 0, j = 0;
    
        while (j < s.length()) {
            if (s.charAt(j) == 'a') aTot++;
            else if (s.charAt(j) == 'b') bTot++;
            else if (s.charAt(j) == 'c') cTot++;
    
            while (aTot > 0 && bTot > 0 && cTot > 0) {
                res += s.length() - j;
    
                if (s.charAt(i) == 'a') aTot--;
                else if (s.charAt(i) == 'b') bTot--;
                else if (s.charAt(i) == 'c') cTot--;
                
                i++; 
            }
            
            j++; 
        }
        return res;
    }
}