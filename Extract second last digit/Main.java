#include<stdio.h>
int main()
{
  //Type your code here
  int num,rem,second;
  scanf("%d",&num);
  rem=num%100;
  second=rem/10;
  printf("%d",second);
  return 0;
}