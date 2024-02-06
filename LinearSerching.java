public class LinearSerching {
    public static void main(String args[])
    {
    //  int arr[]={-1,2,6,8,9,5,-7,6,8,7,8,6,6,15};
    //  int target=6;
    //  linerSearch(arr,target,false);
    //  linerSearch(arr,target,true);
    //  findMultipleNo(arr,target);
    //  maxElement(arr);
    //  minElement(arr);

    int arr2d[][]={{2,3,4},{3,5,6},{4,6,7}};
    int target=6;
    boolean findlast;
     linerSearch2dArray(arr2d,target,false);
     linearSearch2dArrayLast(arr2d,6);
     linerSearch2dArrayMultiple(arr2d,target);
     sumof2dArrayMax(arr2d);
   
    }

    public static void linerSearch(int arr[],int target,boolean findLast)
    {
        int ans=-1;
      for(int i=0;i<arr.length;i++)
      {
        if(arr[i]==target)
        {
          ans=i;
          if(findLast==false)
          break;
        }
      }
      if(ans==-1)
      {
        System.out.println("element is not found");
      }
      else{
      System.out.println("Element is found in index:"+ans);
      }
    }
    public static void findMultipleNo(int arr[],int target)
    {
        int k=0;
        int res[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]==target)
           {
            res[k]=i;
            k++;
           }
        }
        if(k==0)
        {
            System.out.println("element is not found");
        }
        else{
        for(int i=0;i<k;i++)
        {
            System.out.println("Element is found in index:"+res[i]);
        }
    }
    }
    public static void maxElement(int arr[])
    {
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        System.out.println("max Element"+max);

    }
    public static void minElement(int arr[])
    {
        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
            }
        }
        System.out.println("Min element of array is:"+min);
    }
    public static void linerSearch2dArray(int arr[][],int target,boolean findLast)
    {
        int outer=-1;
        int inner=-1;
        for(int i=0;i<arr.length;i++)
        {
            boolean brk=true;
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]==target)
                {
                  outer=i; 
                  inner=j;
                  if(findLast==false)
                  {
                  brk=false; 
                  break;
                  }
                }
            }
            if(brk==true)
            {
            break;
            }
            
        }
        if(outer==-1)
        {
            System.out.println("element not found");
        }
        else
        {
            System.out.println("element is found"+outer+" "+inner);
        }
        
      
    }

    public static void linearSearch2dArrayLast(int arr[][],int target)
    {
        int inner=-1;
        int outer=-1;
      for(int i=0;i<arr.length;i++)
      {
        for(int j=0;j<arr[i].length;j++)
        {
             if(arr[i][j]==target)
             {
                outer=i;
                inner=j;

             }
        }
      }
      if(outer==-1)
      {
        System.out.println("element is not present in array");
      }
      else
      System.out.println("element is found  index ith  "+outer+ " jth "+inner);
    }
    public static void linerSearch2dArrayMultiple(int arr[][],int target)
    {
        int size=0;
        int k=0;
        int res=0;
        for(int i=0;i<arr.length;i++)
        {
        size=size+arr[i].length;
        }
        int arr1[][]=new int [size][2];
       for(int i=0;i<arr.length;i++)
       {
        for(int j=0;j<arr[i].length;j++)
        {
           if(arr[i][j]==target) 
           {
            arr1[k][0]=i;
            arr1[k][1]=j;
            k++;
            res++;
           }
        }
    }
        if(res==0)
        {
            System.out.println("element is not found");
        }
        else{
            for(int i=0;i<k;i++)
            {
             System.out.println("element found in index "+arr1[i][0]+ "  , "+arr1[i][1]);
            }
        
       }
    }
    public static void sumof2dArrayMax(int arr[][]) 
    {
        int sum=0;
        int index=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                sum=sum+arr[i][j];
            }
            if(sum>max)
            {
                max=sum;
                index=i;
            }
        }
        System.out.println("maximum sum of sub array ith index:  "+index);
    }
}
