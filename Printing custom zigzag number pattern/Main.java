#include<stdio.h> 
int main() {
int i=0,j,N; 
  scanf("%d",&N);
  for(i=1;i<=N;) 
   {  
     if(i%2==0) 
         {printf("%d",++i); 
            for(j=1;j<N;j++) 
                 printf("%d",i-1); 
          printf("\n"); 
         } 
   else
     { for(j=1;j<N;j++) 
       printf("%d",i); 
      printf("%d\n",++i); 
     } 
  }
return 0;
}