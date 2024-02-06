import java.util.*;
class ArraysUserIp
{
    

    
    static Scanner sc=new Scanner(System.in);
    
    public static void main(String args[])
    {
        

        int arr2d[][]=new int[3][3];
        fill2dArray(arr2d);
        // print2dArray(arr2d);
        // insertElementin2d(arr2d,1,1,34);
        // print2dArray(arr2d);
        // delete2dArray(arr2d,0,0);
         print2dArray(arr2d);
        delete2dArray(arr2d,0,0);
        print2dArray(arr2d);
        // int arr[]=new int[5];
      
        // for(int i=0;i<arr.length-2;i++)
        // {
        //     System.out.println("Enter"+ "  " +i+" number");
        //     int num=sc.nextInt();
        //     arr[i]=num;
        // }
        // printArrays(arr);
        // insertElement(arr,2,98);
        // printArrays(arr);
    }
    public static void printArrays(int arr[])
    {
    for(int i=0;i<arr.length;i++)
    {
        System.out.print(arr[i]);
        if(i!=arr.length-1)
        {
            System.out.print(",");
        }
    }
    }
    public static void insertElement(int arr[],int pos,int element)
    {
        for(int i=arr.length-2;i>=pos;i--)
        {
            arr[i+1]=arr[i];
        }
        arr[pos]=element;
    }

    public static void fill2dArray(int arr1[][])
    {
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1[i].length;j++)
            {
                System.out.print("enter"+" " +i+ "th"+" "+"element");
                int element=sc.nextInt();
                arr1[i][j]=element;
            }
            System.out.println();
        }
    }
    public static void print2dArray(int arr[][])
    {
        for(int i=0;i<arr.length;i++)
        {
        //   for(int j=0;j<arr[i].length;j++)
        //   {
        //     System.out.print(arr[i][j]+" ");
        //   }
             printArrays(arr[i]);

          System.out.println();
        }
       

    }
    public static void insertElementin2d(int arr[][],int pos1,int pos2,int element)
    {
      if(pos1<0||pos1>arr.length || pos2<0||pos2>arr.length)
    {
      System.out.println("worng input");
    }
    
    insertElement(arr[pos1],pos2,element);
    }
    public static void delete2dArray(int arr[][],int pos1,int pos2)
    {
       
            for(int j=pos2;j<=arr.length-2;j++){
                arr[pos1][j]=arr[pos1][j+1];
            
            }
              
            
        
        System.out.println("After deleting Arrays");  
        
        
        
       
    }
  
}