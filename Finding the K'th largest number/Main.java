#include<stdio.h>
int main()
{
//Type your code here
  int n,i,j,k,tem;
  scanf("%d",&n);
  int arr[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  scanf("%d",&k);
  for(i=0;i<n;i++)
  {
    for(j=i+1;j<n;j++)
    {
      if(arr[i]>arr[j])
      {
        tem=arr[i];
        arr[i]=arr[j];
        arr[j]=tem;
      }
    }
  }
  printf("%d",arr[k/2]);
  
return 0;
}