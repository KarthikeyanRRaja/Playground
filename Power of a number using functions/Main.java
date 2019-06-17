#include<stdio.h>
#include<math.h>
int power(int bs,int exp)
{
  int i,po;
  po=pow(bs,exp);
  return po;
}
int main(){
    // Type your code here
  int bs,exp,ans;
  scanf("%d",&bs);
  scanf("%d",&exp);
  ans=power(bs,exp);
  printf("%d",ans);
  
  	return 0;
}