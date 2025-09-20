import java.util.*;

class MergeIntervals
{
    public static void main (String args[])
    {
        int nums[][]={{1,4},{10,15},{7,10}};
       Arrays.sort(nums, (a, b) -> Integer.compare(a[0], b[0]));

        
        
        int start=nums[0][1];
      for(int i=1;i<nums.length;i++)
        {
          int end=nums[i][0];
          if(start<=end)
          {
               start=nums[i][1];
          }
          else
          {
            System.out.println("False");
            return;
          }
        }
        System.out.println("True");
    }
}

//---------------------------------------------------
class CountMeeting
{
    public static void main(String args[])
    {
      int start[]={2,9,6};
      int end[]={4,12,10};
      
     Arrays.sort(start);
       Arrays.sort(end);
       
       int rooms=0;
       int maxroom=0;
       
       int i=0;int j=0;
       while(i<start.length  && j<end.length)
       {
           if(start[i]<end[j])
           {
               rooms++;
               maxroom=Math.max(maxroom,rooms);
               i++;
           }
           else
           {
               rooms--;
               j++;
               
           }
       }
      
        System.out.println(maxroom);
    
      
    }
}
