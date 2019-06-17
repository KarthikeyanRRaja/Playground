#include<stdio.h>
int main()
{
  //Type your code here
  int n,k,i,j,c;
  scanf("%d",&n);
  scanf("%d",&k);
  int arr[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  for(i=1;i<=k;i++)
  {
    c=0;
    for(j=0;j<n;j++)
    {
      if(arr[j]==i)
      {
        c=c+1;
      }
    }
    printf("%d %d\n",i,c);
  }
  return 0;
}