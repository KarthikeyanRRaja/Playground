// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include<stdio.h>
int main()
{
	char str1[20],ch,tem[26];
	int i,j,len,k=0,flag=0;
	scanf("%[^\n]s",str1);
	len=strlen(str1);
	for(i=97;i<=122;i++)
	{
		ch=i;
		flag=0;
		for(j=0;j<len;j++)
		{
			if(str1[j]==ch)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			printf("%c ",ch);
		}
	}
	printf("%s",tem);
}