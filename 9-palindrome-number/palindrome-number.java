class Solution {
    public boolean isPalindrome(int x) {
        int palin=0;
        int num=x;
        if(x<0){
            return false;
        }
        while(x!=0){
            int last=x%10;
            palin=palin*10+last;
            x=x/10;

        }
        if(palin ==num){
            return true;
        }
        return false;
        
    }
}