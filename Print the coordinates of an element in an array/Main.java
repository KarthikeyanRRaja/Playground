#include<stdio.h>
int main()
{
  //Type your code here
  int m,n,i,j,f,c=0;
  scanf("%d%d",&m,&n);
  int arr[m][n];
  for(i=0;i<m;i++)
  {
    for(j=0;j<n;j++)
    {
      scanf("%d",&arr[i][j]);
    }
  }
  
  scanf("%d",&f);
   for(i=0;i<m;i++)
  {
    for(j=0;j<n;j++)
    {
      if(arr[i][j]==f)
      {
        c=1;
        printf("(%d, %d)",i,j);
      }
    }
  }
  if(c!=1)
  {
    printf("(-1, -1)");
  }
  return 0;
}