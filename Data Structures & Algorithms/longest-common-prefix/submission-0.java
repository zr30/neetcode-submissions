class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null){
            return "";
        }
        if(strs.length==1){
            return strs[0];
        }
        if(strs.length<1){
            return "";
        }
        String firstWord=strs[0];
        String ans="";
        for(int i=0; i<firstWord.length();i++){
            char currentLetter=firstWord.charAt(i);
            for(int j=1;j<strs.length;j++){
                String otherWord=strs[j];
                if(i>otherWord.length()-1){
                    return ans; 
                }
                else if(otherWord.charAt(i)!=currentLetter){
                    return ans;
                }
            }
            ans+=currentLetter;
        }
        return ans;
    }
}