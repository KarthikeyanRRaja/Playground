#include<stdio.h>
int main()
{
	//Try out your code here
  int i,j,c=0;
  char str1[20];
  scanf("%[^\n]s",str1);
  int l=strlen(str1);
  for(i=0;i<l;i++)
  {
    c=0;
    for(j=0;j<l;j++)
    {
      if((str1[i]==str1[j])&&i!=j)
      {
        c=1;
        break;
      }
    }
    if(c==0)
    {
      printf("%c",str1[i]);
      break;
    }
  }
  if(c==1)
  {
    printf("All the characters are repetitive");
  }
	return 0;
}