#include<stdio.h>
int main()
{
 //Type your code here
  int n,i,in,j,t;
  scanf("%d",&n);
  int arr[n+1];
  for(i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  scanf("%d",&in);
  arr[i]=in;
  for(i=0;i<n+1;i++)
  {
    for(j=i+1;j<n+1;j++)
    {
      if(arr[i]>arr[j])
      {
        t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
      }
    }
  }
  for(i=0;i<n+1;i++)
  {
    printf("%d ",arr[i]);
  }
  return 0;
}