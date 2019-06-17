#include <stdio.h>

int main()
{
  //Type your code here
  int n;
  scanf("%d",&n);
  int res=sum(n);
  printf("%d",res);
  return 0;
}
int sum(int n)
{
  if(n==1)
  {
    return 1;
  }
  else
  {
    return n+sum(n-1);
  }
}