#include <stdio.h>
#include<math.h>
int main() {
	//Type your code
  int n,sum=0,c=0,rem,num,mm;
  scanf("%d",&n);
  num=n;
  mm=n;
  while(n>0)
  {
    rem=n%10;
    c=c+1;
    n=n/10;
  }
  while(num>0)
  {
    rem=num%10;
    sum=sum+(pow(rem,c));
    num=num/10;
  }
  if(sum==mm)
  {
    printf("Armstrong Number");
  }
  else
  {
    printf("Not an Armstrong Number");
  }
	return 0;
}