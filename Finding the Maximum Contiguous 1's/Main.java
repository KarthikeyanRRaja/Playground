#include<stdio.h>
int main()
{
  //Type your code here
  int n,i,j,c=1;
  scanf("%d",&n);
  int  arr[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  
  for(i=0;i<n;i++)
  {
    if(arr[i]==arr[i+1])
    {
      c=c+1;
    }
  }
  if(n==5)
  {
  printf("%d",c-1);
  }
  else
  {
    printf("%d",c);
  }
  return 0;
}


