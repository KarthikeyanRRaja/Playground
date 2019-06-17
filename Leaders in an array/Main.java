#include <stdio.h>
int main() 
{
    //write your code here
  int i,n,c,j;
  scanf("%d",&n);
  int arr[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  for(i=0;i<n;i++)
  {
    c=0;
    for(j=i+1;j<n;j++)
    {
      if(arr[i]>arr[j])
      {
        c=c+1;
      }
      else
      {
        break;
      }
      if(c==n-(i+1))
      {
        printf("%d ",arr[i]);
      }
    }
    
  }
  printf("%d",arr[n-1]);
    return 0;
}