import java.util.*;
import java.util.Arrays;
public class Sorts
{
  public void bubbleSort(int[] list)
  {
    for(int outer=0;outer<list.length-1;outer++)
    {
      for(int inner=0;inner<list.length-outer-1;inner++)
      {
        if(list[inner]>list[inner+1])
        {
          int temp=list[inner];
          list[inner]=list[inner+1];
          list[inner+1]=temp;
        }
      }
      //System.out.println(Arrays.toString(list));
    }
  }

  public void selectionSort(int[] list)
  {
    int flag,temp;
    for(int outer=0;outer<list.length-1;outer++){
      flag=outer;
      for(int inner=outer+1;inner<list.length;inner++){
        if(list[inner]<list[flag])
        {
          flag=inner;
        }
      }
      temp=list[outer];
      list[outer]=list[flag];
      list[flag]=temp;
      //System.out.println(Arrays.toString(list));
    }
  }

  public void insertionSort(int[] list)
  {
    for(int outer=1;outer<list.length;outer++)
    {
      int position=outer;
      int key=list[position];
      while(position>0 && list[position-1]>key)
      {
        list[position]=list[position-1];
        position--;
      }
      list[position]=key;
      //System.out.println(Arrays.toString(list));
    }
  }

  private void merge(int[] a, int first, int mid, int last)
  {
    int[] temp=new int[last-first+1];
    int midRef=mid;
    int f=first;
    int m=mid;
    int l=last;
    for(int i=0;i<temp.length;i++){
      if((f<midRef) && (m>l || a[f] < a[m])){
        temp[i]=a[f];
        f++;
      }
      else { 
        temp[i]=a[m];
        m++;
      }
    }
      
    for(int i = 0; i<temp.length; i++){
      a[i+first]=temp[i];
    }
  }

  public void mergeSort(int[] a, int first, int last)
  {
    if(first<last)
    {
      int mid=(first+last)/2;
      mergeSort(a,first, mid);
      mergeSort(a,mid+1,last);
      merge(a,first,mid+1,last);
    }
  } 
}
