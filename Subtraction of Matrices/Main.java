#include<stdio.h>
int main()
{
	//Try out your code here
  int i,j,r,c;
  scanf("%d%d",&r,&c);
  int a[r][c],b[r][c],d[r][c];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      scanf("%d",&a[i][j]);
    }
  }
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      scanf("%d",&b[i][j]);
    }
  }
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      d[i][j]=a[i][j]-b[i][j];
    }
  }
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      printf("%d ",d[i][j]);
    }
    printf("\n");
  }
	return 0;
}