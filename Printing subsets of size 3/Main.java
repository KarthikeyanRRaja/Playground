#include<stdio.h>
int main()
{
       int n,i,j,k;
       scanf("%d",&n);
       int arr[n];
       for(int i = 0; i<n; i++)
       {
          scanf("%d",&arr[i]) ;
       }
        for(int i = 0;i<=n- 2; i++)
        {
            for(int j= i+ 1;j<=n- 1; j++)
            {
                for(int k= j+ 1; k<= n- 1;k++)
                {
                    printf("(%d, %d, %d) ",arr[i],arr[j],arr[k]);
                }
            }
            printf("\n");
        }
    return 0;
}
