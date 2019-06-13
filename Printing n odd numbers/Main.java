#include <stdio.h>
int main() {
	int n,temp,count;
  scanf("%d",&n);
  //temp=1;
  count=1;
  for(temp=1;temp<2*n;temp++)
  {
  	if(count%2==1)
    {
    	printf("%d\n",count);
      count++;
    }
    else
      count++;
  }
	return 0;
}