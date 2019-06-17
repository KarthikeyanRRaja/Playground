#include<stdio.h>
#include<string.h>
int main()
{
  //Type your code here
  int i,l,k=0;
  char str1[20],str2[20];
  scanf("%s",str1);
  strcpy(str2,str1);
  l=strlen(str2);
  for(i=l-1;i>=0;i--)
  {
    str2[k]=str2[i];
    k=k+1;
  }
  if(strcmp(str1,str2)==0)
  {
    printf("%s is a palindrome",str1);
  }
  else
  {
    printf("%s is not a palindrome",str1);
  }
  return 0;
}