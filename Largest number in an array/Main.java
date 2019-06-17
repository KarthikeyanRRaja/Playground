#include<stdio.h>
int main()
{
  //fill the code
  int n,i,lar,fir;
  scanf("%d",&n);
  int arr[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  fir=arr[0];
  for(i=1;i<n;i++)
  {
    if(fir<arr[i])
    {
      fir=arr[i];
    }
  }
  printf("%d",fir);
  return 0;
}