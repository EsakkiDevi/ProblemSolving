import java.util.*;

class FreqSum
{
  public static void main(String args[])
  {
   int nums[]={1,1,2,2,2,3,1,1,1};
   
   HashMap<Integer,Integer> map1=new HashMap<>();
   for(int k:nums)
   {
      if(map1.containsKey(k))
      {
            map1.put(k,map1.get(k)+1);
      }
      else
      {
           map1.put(k,1);
      }
   }
   //System.out.println(map1);
   
   HashMap<Integer,Integer>  map2=new HashMap<>();
   for(int k:map1.keySet())
   {
           if(map2.containsKey(map1.get(k)))
           {
                  map2.put(map1.get(k),map2.get(map1.get(k))+(k*map1.get(k)));
           }
           else
           {
             map2.put(map1.get(k),k*map1.get(k));
          }
   }
    System.out.println(map2);
   
   /*int n=nums.length;
    int freq[]=new int[nums.length];
    for(int i=0;i<n;i++)
    {
        int count=1;
       if(freq[i]==-1)  continue;
       
       for(int j=i+1;j<n;j++)
       {
         if(nums[i]==nums[j])
         {
            freq[j]=-1;
            count++;
         }
      }
      freq[i]=count;
    }
      
    int start=1;
    int val=0;
       //for(int k:freq)  System.out.print(k+" ");
    for(int i=0;i<n;i++)
    {
    int index=-1;
        for(int j=0;j<n;j++)
        {
            if(freq[j]==start)
            {
            
            //System.out.println(start+"     "+nums[j]+"    "+freq[j]);
                val+=start*nums[j];
                index=j;
            }
            
        }
        
           if(val>0)
          System.out.println(start+"-->"+val);
          start++;
          val=0;
          if(index!=-1)
          freq[index]=-1;
          
    }*/
         
         
    
    
  }
}


//--------------------------------------------------------------------
class kRotation
{
   public static void main(String args[])
   {
      String s="ZohoCorporations";
      int k=3;
      String temp="";
      for(int i=0;i<s.length();i++)
      {
            temp=s.charAt(i)+temp;
            if((i+1)%k==0  ||  i==s.length()-1)
            {
                System.out.print(temp);
                temp="";
            }
      }
      
       /* String result="";
      for(int i=0;i<s.length();i+=k)
       {
       String temp="";
        for(int j=i;j<i+k && j<s.length();j++)
        {
            temp+=s.charAt(j);
        }
          result+=reverse(temp);
      }
      System.out.println(result);
    
   }
   
   public static String reverse(String s1)
   {
           String rev="";
           for(int i=s1.length()-1;i>=0;i--)
           {
               rev+=s1.charAt(i);
           }
           return rev;*/
   }
}
