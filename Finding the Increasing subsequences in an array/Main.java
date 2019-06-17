#include<stdio.h>
int main()
{
	//Try out your code here
  int n,i,j;
  scanf("%d",&n);
  int arr[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  for(i=0;i<n;i++)
  {
    for(j=i+1;j<n;j++)
    {
      if(arr[i]<arr[j])
      {
        printf("%d,%d\n",arr[i],arr[j]);
      }
    }
  }
	return 0;
}