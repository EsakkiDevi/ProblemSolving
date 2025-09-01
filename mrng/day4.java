class NumberChar
{
public static void main(String args[])
{
    int n=1000;
    int count=0;
    for(int i=1;i<=n;i++)
    {
    if(i>=1 && i<=9)
    {
    count+=1;
    }
    else if(i>=10 && i<=99)
    {
    count+=2;
    }
    else if(i>=100 && i<=999)
    {
    count+=3;
    }
    else
    {
    count+=4;
    }
    }
    System.out.println(count);
    
}
}

//----------------------------------------------------------------------
class  NumberPattern
{
public static void main(String args[])
{
    int n=6;
    int[][] mat=new int[n][n];
    int num=n;
    int layer=((2*n)/n)+1;
    
       for(int l=0;l<layer;l++)
          {
    
              for(int i=l;i<num;i++)//
              {
                mat[l][i]=num;
              }
              
              for(int i=l;i<num-1;i++)
              {
               mat[i][num-1]=num;
              }
              
              for(int i=num-1;i>l;i--)
              {
                mat[num-1][i]=num;
              }
              
              for(int i=num-1;i>l;i--)
              {
                mat[i][l]=num;
              }
          
          num--;
      
          }
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
        {
        System.out.print(mat[i][j]+" ");
        }
        System.out.println();
    }    
}
}
//----------------------------------------------------------
class Greater
{
  public static void main(String args[])
  {
  int arr[]={2,-4,-5,9,7,8};
  int max=Integer.MIN_VALUE;
  for(int i=0;i<arr.length;i++)
  {
      if(arr[i]>max)
      {
      System.out.println(arr[i]);
      max=arr[i];
      }
  }
  }
}


























