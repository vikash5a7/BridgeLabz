package com.BridgeLabz.Algorithm;

import java.util.Scanner;

public class MergeSort {

 static int[] a = new int[10];
   public static void merge(int low,int mid,int high)
   {
     int h=low;
     int j=mid+1;
     int[] b = new int[10];
     int i=low;
     int k;
     while((h<=mid) && (j<=high))
     {
          if(a[h]<=a[j])
          {
                b[i]=a[h];
                 h++; 
           }
          else
          {
                b[i]=a[j];
                j++;
          }
          i++;
   }
   if(h>mid)
   {
       for(k=j;k<=high;k++)
      {
            b[i]=a[k];
            i++;
      }
  }
  else
  {
        for(k=h;k<=mid;k++)
       {
             b[i]=a[k];
              i++;
       }
   }
   for(k=low;k<=high;k++)
   a[k]=b[k];
}
static void merge_sort(int low,int high)
{
      int mid;
     if(low<high)
     {
               mid=(low+high)/2;
               merge_sort(low,mid);
               merge_sort(mid+1,high);
               merge(low,mid,high);
      }
 }
public static void main(String[] args) {
	 int n,i;
     System.out.println("\nEnter the size of array:");
     @SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
     n = sc.nextInt();
     System.out.println("\nEnter element:");
     for(i=0;i<n;i++)
     {
    	 	System.out.print("\n\ta:"+ i);
             a[i]=sc.nextInt();
     }
     System.out.print("\nEntered Array");
     for(i=0;i<n;i++)
    {
    	 System.out.print("\t"+ a[i]);
     }
     merge_sort(0,n-1);
     System.out.print("\nsorted Array:");
     for(i=0;i<n;i++)
    {
    	 System.out.print("\t"+a[i]);
    }
}
}
