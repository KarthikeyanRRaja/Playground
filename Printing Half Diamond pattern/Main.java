#include<stdio.h>
int main()
{
	int n,row_no,space,star;
    scanf("%d",&n);
	int star_count = 2*n;
	for (row_no = 1; row_no <= n; row_no++) 
      {
	    for(space = 1; space <= (n - row_no); space++) 
          {
			printf(" ");
		  }
	    for(star = 1; star<=(2*row_no-1); star++) 
          {
          
          	
				printf("*");
			
		  }
	    printf("\n");
	  }		
	return 0;
}
