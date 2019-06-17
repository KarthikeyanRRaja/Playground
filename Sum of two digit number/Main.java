#include<stdio.h>
int main()
{
  //Type your code here
  int num,rem,sum;
  scanf("%d",&num);
  rem=(num/10);
  sum=(num%10)+rem;
  printf("%d",sum);
  return 0;
}