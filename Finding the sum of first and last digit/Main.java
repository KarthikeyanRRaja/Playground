#include <stdio.h>
int main() {
	//Type your code
  int n,last,first;
  scanf("%d",&n);
  last = n % 10;
  
  first = n;
  
  while(n>=10)
  {
    n=n/10;
  }
  first=n;
  printf("%d",(first+last));
	return 0;
}


