#include<stdio.h>
int main()
{
  //Type your code here
  int n,i,j,c;
  scanf("%d",&n);
  int arr[n],tem[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  
  for(i=0;i<n;i++)
  {
    c=0;
    for(j=i+1;j<n;j++)
    {
     if(arr[i]==arr[j])
     {
       c=c+1;
     }
    }
    tem[i]=c;
  }
   int s,max;
  for(i=0;i<n;i++)
  {
    for(j=i+1;j<n;j++)
    {
    	if(tem[i]>tem[j])
    	{
    		max=arr[i];
    		s=i;
		}
	}
  }
  printf("%d",arr[s]);
  return 0;
}


