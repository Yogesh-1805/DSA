class Solution {
    public String largestOddNumber(String num) {
        int start=0;
        int end=num.length()-1;
        while(start<end&& num.charAt(start)=='0'){
            start++;
        }
        while(start<=end&&(num.charAt(end)-'0')%2==0){
            end--;
        }
        if(start>end){
            return"";
        }
        return num.substring(start,end+1);
        
    }
}