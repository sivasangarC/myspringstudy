import java.util.*;
class main{
    public static void main(String[]se)
    {
        int nums[]={10,11,2,4,5,6,7};
        int s=nums.length;
        int t=0;
        int mm=-1;
        for(int nu: nums)
        {
            System.out.print(nu+" ");
        }
        System.out.println("=---------------");
        for(int i=0;i<n-1;i++)
        {
            mm=i; // Assume current position is the minimum
            for(int j=i+1;j<n;j++)
            {
                if(nums[mm]>nums[j])
                {
                    mm=j; // Found a smaller element — update minimum index
                }
            }
             t=nums[mm];    // Swap the found minimum with the current position
            nums[mm]=nums[i];
            nums[i]=t;

            for(int mmm:nums)
        {
            System.out.print(mmm+" ");
        }
        System.out.println();
        }
        
    }
}