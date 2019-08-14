#include<stdio.h>
    
int main (){
	
	int n,i,x,y,z,sumx,sumy,sumz;
	
    scanf("%d",&n);
    for(i=0; i<n; i++)
    {
        scanf("%d %d %d",&x,&y,&z);
        sumx+=(x);
        sumy+=(y);
        sumz+=(z);
    }
    !(sumx || sumy || sumz)?puts("YES"):puts("NO");
return 0;
}
