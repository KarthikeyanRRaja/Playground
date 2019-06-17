#include <stdio.h>
int main() {
	// Type your code here
  int n,i,j,s,l=1;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    for(s=1;s<=(n-i);s++)
    {
      printf(" ");
    }
    for(j=1;j<=i;j++)
    {
      printf("%d ",l);
      l=l+1;
    }
    printf("\n");
  }
	return 0;
}