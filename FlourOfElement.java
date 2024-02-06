public class FlourOfElement {
    public static void main(String args[])
    {
        int arr[]={2,4,5,6,7,9,13};
        floor(arr,8);
    }
  public static void floor(int arr[],int target)
  {
    int start=0;
    int end=arr.length-1;
    int ans=0;
    while(start<=end)
    {
        int mid=start+(end-start)/2;
        if(arr[mid]==target)
        {
          ans=arr[mid];
          break;
        }
        else if(arr[mid]<target)
        {
          start=mid+1;  
          //ans=arr[mid];  floor
        }
        else
        {
            end=mid-1;
            ans=arr[mid];
        }
    }
    System.out.println(ans);
  }

}
