#include<stdio.h>
int main()
{
	//Try out your code here
  int r,c,i,j,p=0;
  scanf("%d%d",&r,&c);
  int a[r][c],b[r][c];
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
      if(a[i][j]!=b[i][j])
      {
        p=1;
        break;
      }
    }
  }
  if(p==0)
  {
    printf("Yes");
  }
  else
  {
    printf("No");
  }
	return 0;
}


