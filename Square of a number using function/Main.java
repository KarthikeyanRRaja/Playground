#include<stdio.h>
int square(int n)
{
  int sq;
  sq=n*n;
  return sq;
}
int main() {
   // Type your code here
  int  n,ans;
  scanf("%d",&n);
  ans=square(n);
  printf("%d",ans);
   return 0;
}