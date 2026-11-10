class Solution {
    public boolean isPalindrome(String s) {
        String result="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='A'&& ch<='Z'){
                ch=(char)(ch + 32);
            }
            if(Character.isLetterOrDigit(ch)){
                result+=ch;
            }
        }
        
        int left=0;
        int right=result.length()-1;

        while(left<right){
            if(result.charAt(left)!=result.charAt(right)){
                return false;
            }
            left++;
            right--;

        }
        return true;

    }
}