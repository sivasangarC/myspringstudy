import java.util.*;
//time comple o(long n)
//time comple of linear o(n)
//same as linear search but faster
//binary search can be done by recursion funtion
//recursion funntion like calling the same funtion multiple time to  know the ans
//like by using leinar(int arr,int tar,int l,int r)
//by using if contion calling the same funtion again and again

class Main {
    public static void main(String[] args) {

        int a[] = {1,2,3,4,5,0,3,9,11,10};
        int t = 9;

        Arrays.sort(a);   // Sort the array first — binary search only works on sorted arrays

        int l = 0;
        int r = a.length - 1;
        boolean found = false;

        while (l <= r) {
            int m = (l + r) / 2; // Find the middle index

            if (a[m] == t) {     // Target found at middle
                System.out.println("Found at index " + m);
                found = true;
                break;
            }
            else if (a[m] > t) {
                r = m - 1;       // Target is in the LEFT half — shrink right boundary
            }
            else {
                l = m + 1;       // Target is in the RIGHT half — shrink left boundary
            }
        }

        if (!found) {
            System.out.println("Not Found");
        }
    }
}
