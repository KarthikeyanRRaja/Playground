#include <stdio.h>
int gcd(int n1,int n2,int n3,int min)
{
  int ans;
  while(min>=1)
  {
    if((n1%min==0)&&(n2%min==0)&&(n3%min==0))
    {
      ans=min;
      break;
    }
    min--;
  }
  return min;
}
int main() {
	//Type your code here
  int min,n1,n2,n3;
  scanf("%d%d%d",&n1,&n2,&n3);
  if((n1<n2)&&(n1<n3))
  {
    min=n1;
  }
  else if(n2<n3)
  {
    min=n2;
  }
  else
  {
    min=n3;
  }
  int ans= gcd(n1,n2,n3,min);
  printf("%d",ans);
	return 0;
}