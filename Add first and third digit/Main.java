#include<stdio.h>
int main()
{
  //Type your code here
  int num,first,last,rem,sum;
  scanf("%d",&num);
  first=num/100;
  rem=num%100;
  last=rem%10;
  sum=first+last;
  printf("%d",sum);
  return 0;
}