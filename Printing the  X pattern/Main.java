#include <stdio.h>
int main() {
	// Type your code here
  int n,i,j,c;
  scanf("%d",&n);
  c=n;
  for(i=1;i<=c;i++)
  {
    for(j=1;j<=c;j++)
    {
      if(j==i||(j==c-i+1))
      {
        printf("*");
      }
      else
      {
        printf(" ");
      }
    }
    printf("\n");
  }
	return 0;
}