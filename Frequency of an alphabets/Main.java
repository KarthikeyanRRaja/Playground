// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include<stdio.h>
int main()
{
	char str1[20],ch,str2[20],tem[20];
	int i,j,len,c=0,k,p=0;
	scanf("%[^\n]s",str1);
	len=strlen(str1);
	strcpy(tem,str1);
	for(i=0;i<len;i++)
	{
		for(j=i+1;tem[j]!='\0';j++)
		{
			if(tem[j]==tem[i])
			{
				for(k=j;tem[k]!='\0';k++)
				{
					tem[k]=tem[k+1];
				}
			}
		}
	}
  	int flag=0;
	for(i=0;i<len;i++)
	{
		if(tem[i]==' ')
		{
			flag=1;
			for(j=i;j<len;j++)
			{
			tem[j]=tem[j+1];
		}
		}
		if(flag==1)
		{
			break;
		}
	}
	int l=strlen(tem);
	for (i = 0; i < l-1; i++) {
      for (j = i+1; j < l; j++) {
         if (tem[i] > tem[j]) {
            ch = tem[i];
            tem[i] = tem[j];
            tem[j] = ch;
         }
      }
   }
int n[l];
	for(i=0;i<l;i++)	
	{
		c=0;
		for(j=0;j<len;j++)
		{
			if(str1[j]==tem[i])
			{
				c=c+1;
				n[p]=c;
			}
		}
		p=p+1;
	}
	
	for(i=0;i<l;i++)
	{
		printf("%c%d ",tem[i],n[i]);
	}
	
}