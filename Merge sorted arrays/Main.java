#include <stdio.h>
int main() 
{
	//write your code here
  int i,m,n,j,t,k=0;
  scanf("%d%d",&m,&n);
  int arr[m],ar[n],mer[m+n];
  for(i=0;i<m;i++)
  {
    scanf("%d",&arr[i]);
  }
  for(i=0;i<n;i++)
  {
    scanf("%d",&ar[i]);
  }
  for(i=0;i<m+n;i++)
  {
    if(i<m)
    {
    mer[i]=arr[i];
    }
    else
    {
      mer[i]=ar[k++];
    }
  }
  /*for(j=i;j<n;j++)
  {
    mer[j]=ar[k++];
  }*/
  for(i=0;i<m+n;i++)
  {
    for(j=i+1;j<m+n;j++)
    {
      if(mer[i]>mer[j])
      {
        t=mer[i];
        mer[i]=mer[j];
        mer[j]=t;
      }
    }
  }
  for(i=0;i<m+n;i++)
  {
    printf("%d ",mer[i]);
  }
	return 0;
}