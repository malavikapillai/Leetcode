class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;

        // brute force
        int [] arr=new int[n];
        // for(int i=0;i<n;i++)
        // {
        //     int product=1;
        //     for(int j=0;j<n;j++)
        //     {
        //         if(j!=i){
        //             product*=nums[j];
        //         }
        //     }
        //     arr[i]=product;
        // }
        // return arr;

        // optimixed
        // output[i] = product of all elements to the left of i * product of all elements to the right of i

        int [] left=new int[n];
        int [] right=new int[n];

        left[0]=1;
        for(int i=1;i<n;i++)
        {

            left[i]=left[i-1]*nums[i-1];
        }
        right[n - 1] = 1;
    for (int i = n - 2; i >= 0; i--) {
        right[i] = right[i + 1] * nums[i + 1];
    }

         for (int i = 0; i < n; i++) {
        arr[i] = left[i] * right[i];
    }

    return arr;



        
    }
}