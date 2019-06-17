#include<stdio.h>
int main()
{
  //Type your code here
  int len=6,breadth=9;
  int peri,area;
  peri=2*(len+breadth);
  area=(len*breadth);
  printf("The perimeter of the rectangle is: %d cm",peri);
  printf("\nThe area of the rectangle is: %d sq cm",area);
  return 0;
}