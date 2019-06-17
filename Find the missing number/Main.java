#include<stdio.h>
int main()
{
  //Type your code here
  int n,i,j,l,c;
  scanf("%d",&n);
  int arr[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  
  for(i=1;i<=n;i++)
  {
    c=0;
    for(j=0;j<n;j++)
    {
      if(i==arr[j])
      {
        c=c+1;
        break;
      }
    }
    if(c==0)
    {
      printf("%d",i);
    }
  }
  return 0;
}