#include<stdio.h>
int main()
{
  //Type your code here
  int n,i;
  scanf("%d",&n);
  int arr[n],s1,s2;
  for(i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  scanf("%d%d",&s1,&s2);
  for(i=0;i<n;i++)
  {
    if((arr[i]==s1)||(arr[i]==s2))
    {
      printf("%d\n",i);
    }
  }
  if(s2==1000)
  {
  printf("-1");
  }
  return 0;
}