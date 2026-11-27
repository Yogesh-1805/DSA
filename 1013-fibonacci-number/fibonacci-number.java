class Solution {
    public int fib(int n) {
        int a=0;
        int b=1;
        for(int i=0;i<=n;i++){
            if(i==n){
                return a;
            }
            int c=a+b;
            a=b;
            b=c;
        }
        return 1;
        
    }
}