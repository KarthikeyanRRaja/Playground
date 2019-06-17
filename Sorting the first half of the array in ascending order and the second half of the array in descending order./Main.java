#include<stdio.h>
int main()
{
	//Try out your code here
  int n,i,j,k,t;
  scanf("%d",&n);
  int arr[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  for(i=0;i<n/2;i++)
  {
    for(j=i+1;j<n/2;j++)
    {
      if(arr[i]>arr[j])
      {
        t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
      }
    }
  }
  k=i;
  for(i=k;i<n;i++)
  {
    for(j=i+1;j<n;j++)
    {
      if(arr[i]<arr[j])
      {
        t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
      }
    }
  }
  for(i=0;i<n;i++)
  {
    printf("%d ",arr[i]);
  }
	return 0;
}