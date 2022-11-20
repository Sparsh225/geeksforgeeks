
class Solution {
    long lcmTriplets(long n) {
        // code here
        if(n==2|| n==1){
            return n;
        }
        if(n%2==0){
            if(n%3==0){
                return (n-1)*(n-2)*(n-3);
            }
            else{
                return n*(n-1)*(n-3);
            }
        }
        else{
            return n*(n-1)*(n-2);
        }
    }
}