import java.util.*;
class descendingfreq
{
public static void main(String args[])
  {
   int array[]={0,-1,2,1,0};
   int freq[]=new int[array.length];
   int array1[]=new int[array.length];
   int j=0;
   
   Arrays.sort(array);
   
   
   for(int i=0;i<array.length;i++)
    {
          int count=1;
        if(freq[i]==-1) continue;
          for(j=i+1;j<array.length;j++)
          {
          if(array[i]==array[j])
            {
              freq[j]=-1;
              count++;
            }
          }
          freq[i]=count;
        
    }
    int  k=0;  
    
    while(k<array1.length)
        {
            int value=0;
            int maxIndex=-1;

            for(j=0;j<freq.length;j++)
            {
              if(value<freq[j] && freq[j]>0)
              
                {
                  maxIndex=j;
                  value=freq[j];
                }
              }
              for(int m=0;m<value && k<array1.length;m++)
                {
                   array1[k++]=array[maxIndex];
                }
              freq[maxIndex]=-1;
              
        }
        
        
        for(int i=0;i<array1.length;i++)
          {
            System.out.print(array1[i]+" ");
          }
  }
  }
