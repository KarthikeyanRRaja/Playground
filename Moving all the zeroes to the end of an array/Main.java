#include<stdio.h>
int main()
{
  //Type your code here
  int n,i,l=0,k=0;
  scanf("%d",&n);
  int arr[n],nz[n],z[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  for(i=0;i<n;i++)
  {
    if(arr[i]!=0)
    {
      nz[k]=arr[i];
      k=k+1;
    }
    else
    {
      z[l]=arr[i];
      l=l+1;
    }
  }
  for(i=0;i<k;i++)
  {
    printf("%d ",nz[i]);
  }
  
  for(i=0;i<l;i++)
  {
    printf("%d ",z[i]);
  }
  

  return 0;
}