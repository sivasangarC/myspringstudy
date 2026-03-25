class main{
    //the time complecity of this o(n^2)
    public static void main(String[]se)
    {
        int []a={7,1,3,10,2,5};
     
        for(int i=0;i<a.length;i++)
        {
            // Inner loop reduces by i each pass — last i elements are already sorted, no need to check them
            for(int j=0;j<a.length-i-1;j++)
            {
            if(a[j]>a[j+1]) // If current element is bigger than next, swap them (bubble larger value to the right)
            {
                int t=a[j];    // Swap using temp variable
                a[j]=a[j+1];
                a[j+1]=t;
            }
        }
    }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        
    }
}