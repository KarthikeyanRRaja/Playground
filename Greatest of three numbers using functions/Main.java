#include <stdio.h>
int great(int n1,int n2,int n3)
{
  if((n1>n2)&&(n1>n3))
  {
    return n1;
  }
  else if(n2>n3)
  {
    return n2;
  }
  else
  {
    return n3;
  }
}
int main(){
	// Type your code here
  int n1,n2,n3;
  scanf("%d%d%d",&n1,&n2,&n3);
  int ans=great(n1,n2,n3);
  printf("%d",ans);
  	return 0;
}