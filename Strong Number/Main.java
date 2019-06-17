#include <stdio.h>
int main() {
	//Type your code
  int i,n,fact=1,sum=0,rem,nn;
  scanf("%d",&n);
  nn=n;
  while(n>0)
  {
    rem=n%10;
    fact=1;
    for(i=1;i<=rem;i++)
    {
      fact=fact*i;
    }
    sum=sum+fact;
    n=n/10;
  }
  if(sum==nn)
  {
  printf("Yes");
  }
  else
  {
    printf("No");
  }
    
	return 0;
}