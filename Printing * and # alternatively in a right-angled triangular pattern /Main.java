#include <stdio.h>
int main(){
	// Type your code here
  int n,i,j,k=1;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    for(j=1;j<=i;j++)
    {
    	if(k%2==1)
        {
          printf("*");
        }
      else
      {
        printf("#");
      }
      k++;
    }
    printf("\n");
  }
  	return 0;
}