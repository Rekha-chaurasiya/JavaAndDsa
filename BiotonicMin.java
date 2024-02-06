public class BiotonicMin {

    public static void main(String[] args) {
      
        int arr[]={2,4,5,6,8,7,3,1};
        findmininbiotonic(arr);
    }

    public static void findmininbiotonic(int arr[])
    {
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        int mid=start+(end-start)/2;
        int prev=(mid-1+arr.length)/arr.length;
        int next=(mid+1)/arr.length;

        if(arr[start]<arr[end])
        {
            ans =arr[start];
        }
        else{
           ans= arr[end]; 
        }
        
        if(ans==-1)
        {
            System.out.println("elemnt is not found");
        }
        else{
            System.out.println("find min element is:  "+ans);
        }
    }
}
