class Solution

{

    //Function to find a continuous sub-array which adds up to a given number.

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 

    {

        // Your code here

        int i=0,j=0,sum=0;

        ArrayList<Integer>list=new ArrayList<>();

        while(j<n){
            sum+=arr[j];
            if(sum>s){
                while(sum>s ){
                    sum-=arr[i];
                    i++;
                }
            }
            if(sum==s && j>=i){
                list.add(i+1);
                list.add(j+1);

                return list;

            }

            j++;

        }

        if(list.isEmpty())
        list.add(-1);
        return list;
    }

}