#include<stdio.h>
int natural(int n)
{
  int i,s=0;
  for(i=1;i<=n;i++)
  {
    s=s+i;
  }
  return s;
}
int main() {
    // Type your code here
  int n,sum;
  scanf("%d",&n);
  sum=natural(n);
  printf("%d",sum);
  
  	return 0;
}