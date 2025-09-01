class spiralFibo
{
  public static void main(String args[])
  {
    int m=3;
    int n=4;
    int t1=0;int t2=1;
    int mat[][]=new int[m][n];
    int result=0;
    int top=0,left=0,bottom=m-1,right=n-1;
    while(top<=bottom && left<=right)
      {
           for(int i=left;i<=right;i++)
             {
                mat[top][i]=t1;
                result=t1+t2;
                t1=t2;
                t2=result;
    
             }
            top++;
            
           for(int i=top;i<=bottom;i++)
            {
                mat[i][right]=t1;
                result=t1+t2;
                t1=t2;
                t2=result;
            
            }
            right--;
            
       if(top<=bottom)
           {
        for(int i=right;i>=left;i--)
            {
                mat[bottom][i]=t1;
                result=t1+t2;
                t1=t2;
                t2=result;
            }
            bottom--;
    
      if(left<=right)
          {
        for(int i=bottom;i>=top;i--)
          {
             mat[i][left]=t1;
             result=t1+t2;
                t1=t2;
                t2=result;
          }
          left++;
          }
        }
    
    }
    
    for(int i=0;i<m;i++)
    {
      for(int j=0;j<n;j++)
      {
        System.out.print(mat[i][j]+"\t");
        }
        System.out.println();
    }    
  }
  public static int fibo(int t1,int t2){
  int result=t1+t2;
  t1=t2;
  t2=result;
 return t1;
  }
}//------------------------------------------------------
class series34
{
  public static void main(String args[])
  {
        int num=10;
      int[] arr=new int[num];
      
      int n=2;
      int i=10;
      
     
     int index=0;
     arr[index++]=3;
     arr[index++]=4;
      for(int j=2;j<10;j++ )
      {
      int value=arr[index-n];
       if(value%10==3 && index<arr.length)
          {
              arr[index++]=value*10+3;
                if(index<arr.length)
                 {
                  arr[index++]=value*10+4;
                 }
          }
       else if(value%10==4 && index<arr.length)
          {
              arr[index++]=value*10+3;
                if(index<arr.length)
                  {
                  arr[index++]=value*10+4;
                  }
          }
      n++;
    
        
        
            
      }
      System.out.println(arr[num-1]);
     /* for(int v:arr)
      {
      System.out.println(v);
      }*/
  }
  
}
//-------------------------------------------------------------------------------------------
class longestSubstring
{
    public static void main(String args[])
    {
        String word="pwwkew";
        int maxlen=0;
        String result="";
        int index=-1;
        for(int i=0;i<word.length();i++)
        {
        char c=word.charAt(i);
           
           index=result.indexOf(c);
           if(index!=-1)
           {
           result=result.substring(index+1);
           
           }
           result+=c;
           maxlen=Math.max(result.length(),maxlen);
        }
        System.out.println(maxlen);
    }
}
