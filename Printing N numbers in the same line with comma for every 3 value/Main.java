#include <stdio.h>
int main() {
	//Type your code
  int n,m=3,i;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    printf("%d",i);
    if((i%m==0)&&(i!=n))
    {
      printf(",");
    }
  }
	return 0;
}