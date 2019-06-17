#include<stdio.h>
int prime(int n)
{
  int i,j,p;
  for(i=2;i<=n;i++)
  {
    p=0;
    for(j=2;j<=i/2;j++)
    {
    if(i%j==0)
    {
     p=1;
      break;
    }
      
  }
    if(p==0 && n!=1)
      {
        printf("%d\n",i);
      }
  }
  
}
int main(){
    // Type your code here
  int n,ans;
  scanf("%d",&n);
  prime(n);
    return 0;
}