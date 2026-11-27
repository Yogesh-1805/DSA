class Solution {
    public int fib(int n) {
        //Using normal method
        // int a=0;
        // int b=1;
        // for(int i=0;i<=n;i++){
        //     if(i==n){
        //         return a;
        //     }
        //     int c=a+b;
        //     a=b;
        //     b=c;
        // }
        // return 1;

         //Base case
        if(n<=1){
            return n;
        }
        int last=fib(n-1);
        int second=fib(n-2);
        return last+second;
        
    }
}