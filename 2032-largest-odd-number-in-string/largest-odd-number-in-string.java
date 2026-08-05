class Solution {
    public String largestOddNumber(String num) {
        int start=0;
        int end=num.length()-1;
        while(start<=end){

            char ch=num.charAt(end);
            if(num.charAt(start)==0){
                start++;
            }else if((ch-'0')%2==0){
                end--;
            }else {
                break;
            }
            
        }
        if (start > end) {
            return "";
        }
        return num.substring(start,end+1);
        
    }
}